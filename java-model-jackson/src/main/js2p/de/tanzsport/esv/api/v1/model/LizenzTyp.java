
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LizenzTyp {

    TL("TL"),
    TL_JMD("TL-JMD"),
    WR_D("WR-D"),
    WR_C("WR-C"),
    WR_B_STD("WR-B-Std"),
    WR_B_LAT("WR-B-Lat"),
    WR_A_STD("WR-A-Std"),
    WR_A_LAT("WR-A-Lat"),
    WR_S_STD("WR-S-Std"),
    WR_S_LAT("WR-S-Lat"),
    WR_S_RL_STD("WR-S-RL-Std"),
    WR_S_RL_LAT("WR-S-RL-Lat"),
    WR_S_DM_STD("WR-S-DM-Std"),
    WR_S_DM_LAT("WR-S-DM-Lat"),
    WR_F_1("WR-F1"),
    WR_F_2("WR-F2"),
    WR_F_BL("WR-F-BL"),
    WR_F_DM("WR-F-DM"),
    WR_J_1("WR-J1"),
    WR_J_2("WR-J2"),
    WR_J_1_DM("WR-J1-DM"),
    WR_J_2_DM("WR-J2-DM");
    private final String value;
    private final static Map<String, LizenzTyp> CONSTANTS = new HashMap<String, LizenzTyp>();

    static {
        for (LizenzTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LizenzTyp(String value) {
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
    public static LizenzTyp fromValue(String value) {
        LizenzTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
