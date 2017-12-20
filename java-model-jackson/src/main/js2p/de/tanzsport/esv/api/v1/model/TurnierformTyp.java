
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TurnierformTyp {

    DM("DM"),
    DP("DP"),
    DC("DC"),
    RLT("RLT"),
    RS("RS"),
    GM("GM"),
    LM("LM"),
    OT("OT"),
    ET("ET"),
    IET("IET"),
    IM("IM"),
    IT("IT"),
    PDT("PDT"),
    LT("LT"),
    IMK("IMK"),
    MK("Mk"),
    RM("RM"),
    AT("AT"),
    RT("RT");
    private final String value;
    private final static Map<String, TurnierformTyp> CONSTANTS = new HashMap<String, TurnierformTyp>();

    static {
        for (TurnierformTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TurnierformTyp(String value) {
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
    public static TurnierformTyp fromValue(String value) {
        TurnierformTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
