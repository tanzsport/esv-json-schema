
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TurnierartTyp {

    STD("Std"),
    LAT("Lat"),
    KMB("Kmb"),
    JMD("JMD"),
    SD_STD("SD-Std"),
    SD_LAT("SD-Lat"),
    JAZZ("Jazz");
    private final String value;
    private final static Map<String, TurnierartTyp> CONSTANTS = new HashMap<String, TurnierartTyp>();

    static {
        for (TurnierartTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TurnierartTyp(String value) {
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
    public static TurnierartTyp fromValue(String value) {
        TurnierartTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
