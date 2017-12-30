
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RundenWertungsTyp {

    K("K"),
    M("M"),
    P("P"),
    FK("FK"),
    FP("FP"),
    JK("JK"),
    JP("JP"),
    JS("JS");
    private final String value;
    private final static Map<String, RundenWertungsTyp> CONSTANTS = new HashMap<String, RundenWertungsTyp>();

    static {
        for (RundenWertungsTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RundenWertungsTyp(String value) {
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
    public static RundenWertungsTyp fromValue(String value) {
        RundenWertungsTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
