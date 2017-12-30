
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VerwarnungDisqualifikationsTyp {

    OHNE("0"),
    VSB("1"),
    DSB("2"),
    DSQ("3");
    private final String value;
    private final static Map<String, VerwarnungDisqualifikationsTyp> CONSTANTS = new HashMap<String, VerwarnungDisqualifikationsTyp>();

    static {
        for (VerwarnungDisqualifikationsTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VerwarnungDisqualifikationsTyp(String value) {
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
    public static VerwarnungDisqualifikationsTyp fromValue(String value) {
        VerwarnungDisqualifikationsTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
