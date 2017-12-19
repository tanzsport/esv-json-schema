
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StartligaTyp {

    _1_BL("1BL"),
    _2_BL("2BL"),
    RL("RL"),
    OL("OL"),
    LL("LL"),
    VL("VL");
    private final String value;
    private final static Map<String, StartligaTyp> CONSTANTS = new HashMap<String, StartligaTyp>();

    static {
        for (StartligaTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StartligaTyp(String value) {
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
    public static StartligaTyp fromValue(String value) {
        StartligaTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
