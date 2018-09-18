var ajv = require('ajv')({allErrors: true});
var axios = require('axios');

var schemas = {
    'Veranstaltungsliste V1': '../schema-bundles/v1/veranstaltungsliste.json',
    'Veranstaltung V1': '../schema-bundles/v1/veranstaltung.json',
    'Aufstiegstabellen V1': '../schema-bundles/v1/aufstiegstabellen.json',
    'Funktion\u00e4r V1': '../schema-bundles/v1/funktionaer.json',
    'Funktion\u00e4re V1': '../schema-bundles/v1/funktionaere.json',
    'Ranglisten V1': '../schema-bundles/v1/ranglisten.json',
    'Startliste V1, Level 1': '../schema-bundles/v1/startliste-level1.json',
    'Startliste V1, Level 2': '../schema-bundles/v1/startliste-level2.json',
    'Ergebnis V1, Level 1': '../schema-bundles/v1/ergebnis-level1.json',
    'Ergebnis V1, Level 2': '../schema-bundles/v1/ergebnis-level2.json',
};

var cache = {};

function loadSchema(id) {
    if (cache[id] === undefined) {
        return axios.get(schemas[id])
            .then(function (response) {
                cache[id] = response.data;
                return response.data;
            });
    } else {
        return Promise.resolve(cache[id]);
    }
}

var select;
var src;
var submit;
var result;
var success;
var error;
var compiledSchema;
var details;

function reset() {
    compiledSchema = undefined;
    result.innerText = undefined;
    result.classList.add('hidden');
    success.classList.add('hidden');
    error.classList.add('hidden');
    details.innerText = '';
}

window.onload = function () {
    select = document.getElementById('schema');
    src = document.getElementById('src');
    submit = document.getElementById('submit');
    result = document.getElementById('result');
    success = document.getElementById('success-message');
    error = document.getElementById('error-message');
    details = document.getElementById('details');

    for (var prop in schemas) {
        var opt = document.createElement('option');
        opt.value = prop;
        opt.innerHTML = prop;
        select.appendChild(opt);
    }

    select.onchange = function () {
        if (select.value != "") {
            loadSchema(select.value)
                .then(function (schema) {
                    compiledSchema = ajv.compile(schema);
                    submit.classList.remove('disabled');
                })
                .catch(function (error) {
                    reset();
                    console.error(error);
                    alert('Laden der Schema-Datei fehlgeschlagen!');
                });
        } else {
            reset();
        }
    };

    submit.onclick = function (e) {
        if (compiledSchema) {
            success.classList.add('hidden');
            error.classList.add('hidden');
            result.classList.add('hidden');
            details.innerText = '';
            try {
                var objectToValidate = JSON.parse(src.value);
                var valid = compiledSchema(objectToValidate);
                if (valid) {
                    success.classList.remove('hidden');
                } else {
                    error.classList.remove('hidden')
                    result.classList.remove('hidden');
                    details.innerText = JSON.stringify(compiledSchema.errors, null, 2);
                    console.warn(compiledSchema.errors);
                }
            } catch (e) {
                reset();
                console.error(e);
                alert('Validierung fehlgeschlagen: ' + e.message);
            }
        }
        e.preventDefault();
        return false;
    }
};
