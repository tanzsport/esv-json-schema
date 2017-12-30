
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TanzTyp {

    LW("LW"),
    TG("TG"),
    WW("WW"),
    SF("SF"),
    QU("QU"),
    SB("SB"),
    CC("CC"),
    RB("RB"),
    PD("PD"),
    JV("JV"),
    STD("STD"),
    LAT("LAT"),
    JMD("JMD"),
    JAZZ("JAZZ"),
    DF("DF"),
    SA("SA");
    private final String value;
    private final static Map<String, TanzTyp> CONSTANTS = new HashMap<String, TanzTyp>();

    static {
        for (TanzTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TanzTyp(String value) {
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
    public static TanzTyp fromValue(String value) {
        TanzTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
