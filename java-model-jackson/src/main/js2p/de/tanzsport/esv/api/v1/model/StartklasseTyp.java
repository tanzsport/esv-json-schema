
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StartklasseTyp {

    BSW("BSW"),
    D("D"),
    C("C"),
    B("B"),
    A("A"),
    S("S"),
    PD("PD");
    private final String value;
    private final static Map<String, StartklasseTyp> CONSTANTS = new HashMap<String, StartklasseTyp>();

    static {
        for (StartklasseTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StartklasseTyp(String value) {
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
    public static StartklasseTyp fromValue(String value) {
        StartklasseTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
