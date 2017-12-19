package org.json_schema;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;

public class CoreDraft06MetaSchema {

    private final Schema schema;

    public CoreDraft06MetaSchema() {
        try (InputStream inputStream = getClass().getResourceAsStream("core-draft06.json")) {
            final JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
            schema = SchemaLoader.load(rawSchema);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void validate(JSONObject jsonObject) {
        schema.validate(jsonObject);
    }
}
