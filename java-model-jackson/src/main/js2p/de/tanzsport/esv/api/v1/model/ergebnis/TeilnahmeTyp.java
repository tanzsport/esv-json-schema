
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TeilnahmeTyp {

    T("1"),
    FE("2"),
    FU("3");
    private final String value;
    private final static Map<String, TeilnahmeTyp> CONSTANTS = new HashMap<String, TeilnahmeTyp>();

    static {
        for (TeilnahmeTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TeilnahmeTyp(String value) {
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
    public static TeilnahmeTyp fromValue(String value) {
        TeilnahmeTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
