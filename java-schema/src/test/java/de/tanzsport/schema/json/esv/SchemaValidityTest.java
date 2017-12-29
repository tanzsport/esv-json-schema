package de.tanzsport.schema.json.esv;

import org.json_schema.CoreDraft06MetaSchema;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SchemaValidityTest {

    private final CoreDraft06MetaSchema metaSchema;
    private final String schema;

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Schemas.V1_COMMON},
                {Schemas.V1_VERANSTALTUNGSLISTE},
                {Schemas.V1_VERANSTALTUNG},
                {Schemas.V1_STARTLISTE_LEVEL1},
                {Schemas.V1_STARTLISTE_LEVEL2},
                {Schemas.V1_AUFSTIEGSTABELLEN},
                {Schemas.V1_FUNKTIONAER},
                {Schemas.V1_FUNKTIONAERE},
                {Schemas.V1_RANGLISTEN},
                {Schemas.V1_ERGEBNIS_LEVEL1},
                {Schemas.V1_ERGEBNIS_LEVEL2},
        });
    }

    public SchemaValidityTest(String schema) {
        this.metaSchema = new CoreDraft06MetaSchema();
        this.schema = schema;
    }

    @Test
    public void schemaValidatesAgainstMetaSchema() {
        final JSONObject schemaJson = Schemas.asJSONObject(schema);
        metaSchema.validate(schemaJson);
    }
}
