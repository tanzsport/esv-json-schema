package de.tanzsport.schema.json.esv.v1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@RunWith(Parameterized.class)
public class CommonSchemaTest extends AbstractV1SchemaTest {

    private static final String DEF_ISO8601 = "common.json#/definitions/iso8601-date-time";
    private static final String DEF_TST = "common.json#/definitions/turnierstaette";
    private static final String DEF_LTV = "common.json#/definitions/landesverband";
    private static final String DEF_VA_AU = "common.json#/definitions/veranstalter-ausrichter";
    private static final String DEF_VER = "common.json#/definitions/verein";
    private static final String DEF_LZ = "common.json#/definitions/lizenztraeger";
    private static final String DEF_FL = "common.json#/definitions/flaeche";
    private static final String DEF_TU = "common.json#/definitions/turnier";
    private static final String DEF_IOC = "common.json#/definitions/ioc-code";
    private static final String DEF_TEAM_L1 = "common.json#/definitions/team-l1";
    private static final String DEF_PERSON_L1 = "common.json#/definitions/person-l1";
    private static final String DEF_STARTLIGA = "common.json#/definitions/startliga-nullable";
    private static final String DEF_VERANSTALTUNG = "common.json#/definitions/veranstaltung";
    private static final String DEF_EINTRAG = "common.json#/definitions/veranstaltungsliste-eintrag";
    private static final String DEF_ENDRUNDENTABELLE = "common.json#/definitions/ergebnis-endrundentabelle";
    private static final String DEF_SKATINGTABELLE = "common.json#/definitions/ergebnis-skatingtabelle";
    private static final String DEF_STICHRUNDENWERTUNG = "common.json#/definitions/starter-stichrundenwertung";

    @Parameterized.Parameters(name = "{2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        DEF_ISO8601, true, "common-iso8601-valid-offset-minutes.json", 0, null
                },
                {
                        DEF_ISO8601, true, "common-iso8601-valid-offset-hours.json", 0, null
                },
                {
                        DEF_ISO8601, true, "common-iso8601-valid-z.json", 0, null
                },
                {
                        DEF_ISO8601, true, "common-iso8601-invalid-pattern.json", 1,
                        Arrays.asList(failurePattern("iso8601-date-time", "abc"))
                },
                {
                        DEF_ISO8601, true, "common-iso8601-invalid-type.json", 1,
                        Arrays.asList(failureType("iso8601-date-time", "String"))
                },
                {
                        DEF_TST, true, "common-turnierstaette-valid.json", 0, null
                },
                {
                        DEF_TST, true, "common-turnierstaette-invalid-empty.json", 4,
                        failuresRequired("ort", "name", "anschrift", "plz")
                },
                {
                        DEF_TST, true, "common-turnierstaette-invalid-types.json", 4,
                        Arrays.asList(failureType("ort", "String"), failureType("ort", "String"),
                                failureType("name", "String"), failureType("anschrift", "String")
                        )
                },
                {
                        DEF_LTV, true, "common-landesverband-valid.json", 0, null
                },
                {
                        DEF_LTV, true, "common-landesverband-invalid-empty.json", 2,
                        failuresRequired("id", "name")
                },
                {
                        DEF_LTV, true, "common-landesverband-invalid-types.json", 2,
                        Arrays.asList(failureType("id", "Number"), failureEnum("name", "1"))
                },
                {
                        DEF_VA_AU, true, "common-veranstalter-ausrichter-valid-max.json", 0, null
                },
                {
                        DEF_VA_AU, true, "common-veranstalter-ausrichter-valid-min.json", 0, null
                },
                {
                        DEF_VA_AU, true, "common-veranstalter-ausrichter-valid-null-ltv.json", 0, null
                },
                {
                        DEF_VA_AU, true, "common-veranstalter-ausrichter-invalid-empty.json", 2,
                        failuresRequired("id", "name")
                },
                {
                        DEF_VA_AU, true, "common-veranstalter-ausrichter-invalid-types.json", 2,
                        Arrays.asList(failureType("id", "Number"), failureType("name", "String"))
                },
                {
                        DEF_VER, true, "common-verein-inland-valid.json", 0, null
                },
                {
                        DEF_VER, true, "common-verein-ausland-valid.json", 0, null
                },
                {
                        DEF_VER, true, "common-verein-invalid-empty.json", 2,
                        failuresRequired("id", "name", "ltv")
                },
                {
                        DEF_VER, true, "common-verein-invalid-types.json", 2,
                        Arrays.asList(failureType("id", "Number"), failureType("name", "String"),
                                failureType("ltv", "JSONObject")
                        )
                },
                {
                        DEF_LZ, true, "common-lizenztraeger-valid-max.json", 0, null
                },
                {
                        DEF_LZ, true, "common-lizenztraeger-valid-min.json", 0, null
                },
                {
                        DEF_LZ, true, "common-lizenztraeger-valid-allow-null.json", 0, null
                },
                {
                        DEF_LZ, true, "common-lizenztraeger-invalid-empty.json", 6,
                        failuresRequired("id", "vorname", "nachname", "club", "staat", "lizenzen")
                },
                {
                        DEF_LZ, true, "common-lizenztraeger-invalid-types.json", 9,
                        Arrays.asList(failureType("id", "String"), failureType("wdsfMin", "null"),
                                failureType("wdsfMin", "Number"), failureType("titel", "null"), failureType("titel", "String"),
                                failureType("vorname", "String"), failureType("nachname", "String"),
                                failureType("club", "JSONObject"), failureType("staat", "String"),
                                failureType("lizenzen", "JSONArray")
                        )
                },
                {
                        DEF_LZ, true, "common-lizenztraeger-invalid-lizenztyp.json", 1,
                        Arrays.asList(failureEnum("lizenzen/0", "abc"))
                },
                {
                        DEF_FL, true, "common-flaeche-valid.json", 0, null
                },
                {
                        DEF_FL, true, "common-flaeche-invalid-empty.json", 4,
                        failuresRequired("id", "typ", "laenge", "breite")
                },
                {
                        DEF_FL, true, "common-flaeche-invalid-types.json", 4,
                        Arrays.asList(failureType("id", "String"), failureType("typ", "String"),
                                failureType("laenge", "Number"), failureType("breite", "Number")
                        )
                },
                {
                        DEF_TU, true, "common-turnier-valid-max.json", 0, null
                },
                {
                        DEF_TU, true, "common-turnier-valid-min.json", 0, null
                },
                {
                        DEF_TU, true, "common-turnier-invalid-empty.json", 13,
                        failuresRequired("id", "datumVon", "datumBis", "startzeitPlan", "wettbewerbsart", "turnierform",
                                "startgruppe", "startklasseLiga", "turnierart", "zulassung", "wanderpokal",
                                "turnierrang", "aufstiegsturnier"
                        )
                },
                {
                        DEF_TU, true, "common-turnier-invalid-types.json", 25,
                        Arrays.asList(failureType("id", "Number"), failureType("datumVon", "String"),
                                failureType("datumBis", "String"), failureType("startzeitPlan", "String"),
                                failureType("startzeitPlanKorrigiert", "String"), failureType("titel", "String"),
                                failureType("titel", "null"), failureType("veranstalter", "JSONObject"),
                                failureType("ausrichter", "JSONObject"), failureType("flaechenId", "null"),
                                failureType("flaechenId", "String"),
                                failureEnum("wettbewerbsart", "1"), failureEnum("turnierform", "1"),
                                failureEnum("startgruppe", "1"), failureEnum("startklasseLiga", "1"),
                                failureEnum("turnierart", "1"), failureType("zulassung", "JSONArray"),
                                failureType("wanderpokal", "Boolean"), failureType("aufstiegsturnier", "Boolean"),
                                failureEnum("ranglistenId", "1"), failureType("wdsfTurnierId", "null"),
                                failureType("wdsfTurnierId", "Number"), failureType("startgebuehr", "null"),
                                failureType("startgebuehr", "String"), failureType("startgebuehr", "Number"),
                                failureType("bemerkungen", "null"), failureType("bemerkungen", "String"),
                                failureType("wertungsrichter", "JSONArray"), failureType("wertungsrichter", "null"),
                                failureType("turnierleiter", "String"), failureType("turnierleiter", "null"),
                                failureType("beisitzer", "String"), failureType("beisitzer", "null"),
                                failureType("chairman", "String"), failureType("chairman", "null")
                        )
                },
                {
                        DEF_IOC, true, "common-ioc-code-valid.json", 0, null
                },
                {
                        DEF_IOC, true, "common-ioc-code-invalid-longer.json", 1,
                        Arrays.asList(failureMaxLength("ioc-code", 3))
                },
                {
                        DEF_IOC, true, "common-ioc-code-invalid-shorter.json", 1,
                        Arrays.asList(failureMinLength("ioc-code", 3))
                },
                {
                        DEF_IOC, true, "common-ioc-code-invalid-types.json", 1,
                        Arrays.asList(failureType("ioc-code", "String"))
                },
                {
                        DEF_TEAM_L1, true, "common-team-l1-valid.json", 0, null
                },
                {
                        DEF_TEAM_L1, true, "common-team-l1-valid-null.json", 0, null
                },
                {
                        DEF_TEAM_L1, true, "common-team-l1-invalid-empty.json", 2,
                        failuresRequired("name", "kapitaen")
                },
                {
                        DEF_TEAM_L1, true, "common-team-l1-invalid-types.json", 2,
                        Arrays.asList(failureType("name", "String"), failureType("kapitaen", "String"))
                },
                {
                        DEF_PERSON_L1, true, "common-person-l1-valid.json", 0, null
                },
                {
                        DEF_PERSON_L1, true, "common-person-l1-invalid-empty.json", 7,
                        failuresRequired("id", "titel", "vorname", "nachname", "geschlecht", "wdsfMin", "nationalitaet")
                },
                {
                        DEF_STARTLIGA, true, "common-startliga-valid.json", 0, null
                },
                {
                        DEF_STARTLIGA, true, "common-startliga-valid-null.json", 0, null
                },
                {
                        DEF_VERANSTALTUNG, true, "common-veranstaltung-valid-max.json", 0, null
                },
                {
                        DEF_EINTRAG, true, "common-veranstaltungsliste-eintrag-valid.json", 0, null
                },
                {
                        DEF_ENDRUNDENTABELLE, true, "common-ergebnis-endrundentabelle-valid.json", 0, null
                },
                {
                        DEF_SKATINGTABELLE, true, "common-ergebnis-skatingtabelle-valid.json", 0, null
                },
                {
                        DEF_STICHRUNDENWERTUNG, true, "common-stichrundenwertung-valid-null.json", 0, null
                },
                {
                        DEF_STICHRUNDENWERTUNG, true, "common-stichrundenwertung-valid-full.json", 0, null
                },
                {
                        DEF_STICHRUNDENWERTUNG, true, "common-stichrundenwertung-invalid-empty.json", 2,
                        failuresRequired("stichrunde", "wertung")
                },
                {
                        DEF_STICHRUNDENWERTUNG, true, "common-stichrundenwertung-invalid-types.json", 2,
                        Arrays.asList(failureType("stichrunde", "Number"), failureType("wertung", "JSONArray"))
                }
        });
    }

    private final String $ref;
    private final String name;
    private final Object objectToValidate;

    public CommonSchemaTest(String $ref, boolean isObject, String resource, int expectedFailures,
            List<String> expectedMessages) {
        super(expectedFailures, expectedMessages);
        Objects.requireNonNull($ref, "$ref required!");
        Objects.requireNonNull(resource, "Resource required!");

        this.$ref = $ref;
        this.name = $ref.substring($ref.lastIndexOf("/") + 1);
        this.objectToValidate = readObject(resource);
    }

    @Test
    public void commonSchema() {
        testSchema(createTestSchema(name, $ref), objectToValidate);
    }
}
