
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RanglistenId {

    __EMPTY__(""),
    JUN_II_STD("JunII-Std"),
    JUN_II_LAT("JunII-Lat"),
    JUG_STD("Jug-Std"),
    JUG_LAT("Jug-Lat"),
    HGR_STD("Hgr-Std"),
    HGR_RS_STD("Hgr-RS-Std"),
    HGR_RS_LAT("Hgr-RS-Lat"),
    SEN_I_STD("SenI-Std"),
    SEN_II_STD("SenII-Std"),
    G_55_STD("G55-Std"),
    LS_66_STD("LS66-Std"),
    JUG_SOLO_M_JMD("Jug-SoloM-JMD"),
    JUG_SOLO_W_JMD("Jug-SoloW-JMD"),
    JUG_DUO_JMD("Jug-Duo-JMD"),
    JUG_SG_JMD("Jug-SG-JMD"),
    HGR_SOLO_M_JMD("Hgr-SoloM-JMD"),
    HGR_SOLO_W_JMD("Hgr-SoloW-JMD"),
    HGR_DUO_JMD("Hgr-Duo-JMD"),
    HGR_SG_JMD("Hgr-SG-JMD");
    private final String value;
    private final static Map<String, RanglistenId> CONSTANTS = new HashMap<String, RanglistenId>();

    static {
        for (RanglistenId c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RanglistenId(String value) {
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
    public static RanglistenId fromValue(String value) {
        RanglistenId constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
