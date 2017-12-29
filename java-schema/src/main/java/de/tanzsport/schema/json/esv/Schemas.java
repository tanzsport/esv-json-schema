package de.tanzsport.schema.json.esv;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Schemas {

    public static final String V1_COMMON = "v1/common.json";
    public static final String V1_VERANSTALTUNGSLISTE = "v1/veranstaltungsliste.json";
    public static final String V1_VERANSTALTUNG = "v1/veranstaltung.json";
    public static final String V1_STARTLISTE_LEVEL1 = "v1/startliste-level1.json";
    public static final String V1_STARTLISTE_LEVEL2 = "v1/startliste-level2.json";
    public static final String V1_AUFSTIEGSTABELLEN = "v1/aufstiegstabellen.json";
    public static final String V1_FUNKTIONAER = "v1/funktionaer.json";
    public static final String V1_FUNKTIONAERE = "v1/funktionaere.json";
    public static final String V1_RANGLISTEN = "v1/ranglisten.json";
    public static final String V1_ERGEBNIS_LEVEL1 = "v1/ergebnis-level1.json";
    public static final String V1_ERGEBNIS_LEVEL2 = "v1/ergebnis-level2.json";

    private static Map<String, String> locations = new HashMap<>();

    static {
        locations.put("http://schema.tanzsport.de/json/esv/v1/common.json", V1_COMMON);
    }

    public static InputStream asInputStream(String schema) {
        Objects.requireNonNull(schema, "Schema required!");
        if (schema.trim().equals("")) {
            throw new IllegalArgumentException("Cannot open empty schema as input stream!");
        }
        return Schemas.class.getClassLoader().getResourceAsStream(schema);
    }

    public static JSONObject asJSONObject(String schema) {
        try (InputStream inputStream = asInputStream(schema)) {
            return new JSONObject(new JSONTokener(inputStream));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Schema asSchema(String schema) {
        return load(asJSONObject(schema));
    }

    public static Schema load(JSONObject schema) {
        final SchemaLoader loader = SchemaLoader.builder()
                .resolutionScope("http://schema.tanzsport.de/json/esv/v1")
                .draftV6Support()
                .httpClient(s -> {
                    if (!locations.containsKey(s)) {
                        throw new IllegalArgumentException("Location " + s + " is not a known reference!");
                    }
                    return Schemas.class.getClassLoader().getResourceAsStream(locations.get(s));
                })
                .schemaJson(schema)
                .build();

        return loader.load().build();
    }
}
