
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RundenTyp {

    RD_1("1"),
    RD_1A("1A"),
    RD_1B("1B"),
    RD_R("R"),
    RD_2("2"),
    RD_3("3"),
    RD_4("4"),
    RD_5("5"),
    RD_6("6"),
    RD_7("7"),
    RD_8("8"),
    RD_9("9"),
    RD_F("F"),
    RD_FA("FA"),
    RD_FB("FB"),
    RD_SR("SR");
    private final String value;
    private final static Map<String, RundenTyp> CONSTANTS = new HashMap<String, RundenTyp>();

    static {
        for (RundenTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RundenTyp(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RundenTyp fromValue(String value) {
        RundenTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
