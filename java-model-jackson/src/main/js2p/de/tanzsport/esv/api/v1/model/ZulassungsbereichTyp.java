
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ZulassungsbereichTyp {

    WDSF("WDSF"),
    EU("EU"),
    DTV("DTV"),
    HATV("HATV"),
    HTV("HTV"),
    LTV_BERLIN("LTVBerlin"),
    LTV_BR("LTVBr"),
    LTV_BREMEN("LTVBremen"),
    LTVB("LTVB"),
    LTVS("LTVS"),
    LTVSA("LTVSA"),
    NTV("NTV"),
    SLT("SLT"),
    TBW("TBW"),
    TMV("TMV"),
    TNW("TNW"),
    TRP("TRP"),
    TSH("TSH"),
    TTSV("TTSV");
    private final String value;
    private final static Map<String, ZulassungsbereichTyp> CONSTANTS = new HashMap<String, ZulassungsbereichTyp>();

    static {
        for (ZulassungsbereichTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ZulassungsbereichTyp(String value) {
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
    public static ZulassungsbereichTyp fromValue(String value) {
        ZulassungsbereichTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
