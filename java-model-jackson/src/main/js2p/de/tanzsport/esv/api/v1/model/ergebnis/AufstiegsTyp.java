
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AufstiegsTyp {

    KEIN("0"),
    REGULAER("1"),
    BESCHLUSS("2");
    private final String value;
    private final static Map<String, AufstiegsTyp> CONSTANTS = new HashMap<String, AufstiegsTyp>();

    static {
        for (AufstiegsTyp c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AufstiegsTyp(String value) {
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
    public static AufstiegsTyp fromValue(String value) {
        AufstiegsTyp constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
