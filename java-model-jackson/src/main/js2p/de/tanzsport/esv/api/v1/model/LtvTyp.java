
package de.tanzsport.esv.api.v1.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LtvTyp {

    HATV("HATV"),
    HTV("HTV"),
    LTV_BERLIN("LTVBerlin"),
    LTV_BR("LTVBr"),
    LTV_BREMEN("LTVBremen"),
    LTVB("LTVB"),
    LTVS("LTVS"),
    NTV("NTV"),
    SLT("SLT"),
    TBW("TBW"),
    TMV("TMV"),
    TNW("TNW"),
    TRP("TRP"),
    TSH("TSH"),
    TTSV("TTSV"),
    LTVSA("LTVSA");
    private final String value;
    private final static Map<String, LtvTyp> CONSTANTS = new HashMap<String, LtvTyp>();

    static {
        for (LtvTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LtvTyp(String value) {
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
    public static LtvTyp fromValue(String value) {
        LtvTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
