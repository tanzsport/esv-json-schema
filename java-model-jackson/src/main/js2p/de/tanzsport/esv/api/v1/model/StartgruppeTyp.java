
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StartgruppeTyp {

    KIN_I("KinI"),
    KIN_II("KinII"),
    KIN("Kin"),
    JUN_I("JunI"),
    JUN_II("JunII"),
    JUG("Jug"),
    HGR("Hgr"),
    HGR_II("HgrII"),
    SEN_I("SenI"),
    SEN_II("SenII"),
    SEN_III("SenIII"),
    SEN_IV("SenIV"),
    U_21("U21"),
    MCI("MCI"),
    MCII("MCII"),
    G_55("G55"),
    LS_66("Ls66");
    private final String value;
    private final static Map<String, StartgruppeTyp> CONSTANTS = new HashMap<String, StartgruppeTyp>();

    static {
        for (StartgruppeTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StartgruppeTyp(String value) {
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
    public static StartgruppeTyp fromValue(String value) {
        StartgruppeTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
