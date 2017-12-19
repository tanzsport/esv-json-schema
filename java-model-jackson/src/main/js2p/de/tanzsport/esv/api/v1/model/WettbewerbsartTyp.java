
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WettbewerbsartTyp {

    EINZEL("Einzel"),
    FORMATION_STD_LAT("FormationStdLat"),
    MANNSCHAFT("Mannschaft"),
    SOLO("Solo"),
    SOLO_MAENNLICH("SoloMaennlich"),
    SOLO_WEIBLICH("SoloWeiblich"),
    DUO("Duo"),
    SMALL_GROUP("SmallGroup"),
    FORMATION_JMD("FormationJMD");
    private final String value;
    private final static Map<String, WettbewerbsartTyp> CONSTANTS = new HashMap<String, WettbewerbsartTyp>();

    static {
        for (WettbewerbsartTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private WettbewerbsartTyp(String value) {
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
    public static WettbewerbsartTyp fromValue(String value) {
        WettbewerbsartTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
