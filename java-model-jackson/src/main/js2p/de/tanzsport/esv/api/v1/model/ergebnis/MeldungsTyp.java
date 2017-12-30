
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MeldungsTyp {

    R("1"),
    NM("2"),
    NMS("3"),
    NMA("4");
    private final String value;
    private final static Map<String, MeldungsTyp> CONSTANTS = new HashMap<String, MeldungsTyp>();

    static {
        for (MeldungsTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MeldungsTyp(String value) {
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
    public static MeldungsTyp fromValue(String value) {
        MeldungsTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
