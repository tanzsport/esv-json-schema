
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StartklasseLigaTyp {

    BSW("BSW"),
    D("D"),
    C("C"),
    B("B"),
    A("A"),
    S("S"),
    PD("PD"),
    _1_BL("1BL"),
    _2_BL("2BL"),
    RL("RL"),
    OL("OL"),
    LL("LL"),
    VL("VL");
    private final String value;
    private final static Map<String, StartklasseLigaTyp> CONSTANTS = new HashMap<String, StartklasseLigaTyp>();

    static {
        for (StartklasseLigaTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StartklasseLigaTyp(String value) {
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
    public static StartklasseLigaTyp fromValue(String value) {
        StartklasseLigaTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
