package de.tanzsport.schema.json.esv.v1;

import de.tanzsport.schema.json.esv.Schemas;
import org.assertj.core.api.JUnitSoftAssertions;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Rule;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class AbstractV1SchemaTest {

    @Rule
    public JUnitSoftAssertions softly = new JUnitSoftAssertions();

    protected static String failureRequired(String key) {
        return String.format("required key [%1$s] not found", key);
    }

    protected static List<String> failuresRequired(String... keys) {
        if (keys == null || keys.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(keys).stream().map(k -> failureRequired(k)).collect(Collectors.toList());
    }

    protected static String failurePattern(String key, String value) {
        return String.format("%1$s: string [%2$s] does not match pattern", key, value);
    }

    protected static String failureExtraneous(String key) {
        return String.format("extraneous key [%1$s] is not permitted", key);
    }

    protected static String failureType(String key, String type) {
        if ("null".equals(type)) {
            return String.format("%1$s: expected: null", key);
        }
        return String.format("%1$s: expected type: %2$s", key, type);
    }

    protected static String failureEnum(String key, String value) {
        return String.format("%1$s: %2$s is not a valid enum value", key, value);
    }

    protected static String failureMaxLength(String key, int maxLength) {
        return String.format("%1$s: expected maxLength: %2$s", key, maxLength);
    }

    protected static String failureMinLength(String key, int maxLength) {
        return String.format("%1$s: expected minLength: %2$s", key, maxLength);
    }


    protected final int expectedFailures;
    protected final boolean shouldBeValid;
    protected final List<String> expectedMessages;

    public AbstractV1SchemaTest(int expectedFailures, List<String> expectedMessages) {
        this.expectedFailures = expectedFailures;
        this.shouldBeValid = expectedFailures == 0;
        this.expectedMessages = expectedMessages == null ? Collections.emptyList() : expectedMessages;
    }

    protected void testSchema(Schema schema, Object objectToValidate) {
        try {
            schema.validate(objectToValidate);

            // fail if unsuccesful validation expected
            if (!shouldBeValid) {
                softly.fail("Expected validation failure, but validation succeeded");
            }
        }
        catch (ValidationException e) {
            // fail if successful validation expected
            if (shouldBeValid) {
                dumpValidationFailures(e);
                softly.fail("Expected validation success, but validation failed");
            }
            else {
                assertValidationFailures(e);
            }
        }
    }

    protected JSONObject readObject(String jsonFile) {
        try (InputStream inputStream = getClass().getResourceAsStream(jsonFile)) {
            return new JSONObject(new JSONTokener(inputStream));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected JSONArray readArray(String jsonFile) {
        try (InputStream inputStream = getClass().getResourceAsStream(jsonFile)) {
            return new JSONArray(new JSONTokener(inputStream));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected Schema createTestSchema(String property, String $ref) {
        final JSONObject testSchemaJson = new JSONObject()
                .put("$schema", "http://json-schema.org/draft-06/schema#")
                .put("$id", "http://schema.tanzsport.de/json/esv/v1/test-" + property)
                .put("properties",
                        new JSONObject().put(property,
                                new JSONObject().put("$ref", $ref)
                        )
                )
                .put("required",
                        new JSONArray().put(property)
                );

        return Schemas.load(testSchemaJson);
    }

    protected void assertValidationFailures(ValidationException e) {
        Objects.requireNonNull(e, "ValidationException required!");

        final List<String> validationMessages = new ArrayList<>();
        int failures = 0;
        if (e.getCausingExceptions().isEmpty()) {
            failures = 1;
            validationMessages.addAll(e.getAllMessages());
        }
        else {
            failures = e.getCausingExceptions().size();
            validationMessages.addAll(e.getCausingExceptions().stream().flatMap(ce -> ce.getAllMessages().stream())
                    .collect(Collectors.toList()));
        }

        if (failures != expectedFailures) {
            validationMessages.forEach(System.out::println);
        }
        softly.assertThat(failures).withFailMessage("Expected %1$s failures, got %2$s", expectedFailures, failures)
                .isEqualTo(expectedFailures);
        expectedMessages.forEach(em -> {
            if (validationMessages.stream().filter(m -> m.contains(em)).count() == 0) {
                dumpValidationFailures(e);
                softly.fail("Did not find expected validation message: " + em);
            }
        });
    }

    protected void dumpValidationFailures(ValidationException e) {
        if (e.getCausingExceptions().size() > 0) {
            e.getCausingExceptions().forEach(ce -> {
                ce.getAllMessages().forEach(m -> System.out.println(m));
                ce.printStackTrace();
            });
        }
        else {
            e.getAllMessages().forEach(m -> System.out.println(m));
            e.printStackTrace();
        }
    }
}
