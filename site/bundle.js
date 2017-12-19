var $RefParser = require('json-schema-ref-parser');
var fs = require('fs');

var schemas = [
    "../schema/v1/veranstaltungsliste.json",
    "../schema/v1/veranstaltung.json",
    "../schema/v1/startliste-level1.json",
    "../schema/v1/startliste-level2.json",
    "../schema/v1/ranglisten.json",
    "../schema/v1/funktionaer.json",
    "../schema/v1/funktionaere.json",
    "../schema/v1/aufstiegstabellen.json"
];

function targetFile(schema) {
    return schema.replace("../schema/v1/", "hugo/static/schema-bundles/v1/")
}

Promise.all(schemas.map(function (schema) {
    return $RefParser.bundle(schema)
        .then(function (bundledSchema) {
            fs.writeFileSync(targetFile(schema), JSON.stringify(bundledSchema, null, 2));
        });
})).then(function () {
    process.exit(0);
}).catch(function (err) {
    console.error(err);
    process.exit(255);
});
