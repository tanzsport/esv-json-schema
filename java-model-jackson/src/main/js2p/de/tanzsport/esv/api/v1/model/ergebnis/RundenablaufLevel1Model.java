
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.RundenTyp;
import de.tanzsport.esv.api.v1.model.RundenWertungsTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Eintrag im Rundenablauf eines Ergebnisses (Level 1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "runde",
    "typ"
})
public class RundenablaufLevel1Model implements Serializable
{

    /**
     * Rundentyp in einem Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("runde")
    @JsonPropertyDescription("Rundentyp in einem Ergebnis")
    private RundenTyp runde;
    /**
     * Wertungstyp in einer Runde
     * (Required)
     * 
     */
    @JsonProperty("typ")
    @JsonPropertyDescription("Wertungstyp in einer Runde")
    private RundenWertungsTyp typ;
    private final static long serialVersionUID = 1087093998803662117L;

    /**
     * Rundentyp in einem Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("runde")
    public RundenTyp getRunde() {
        return runde;
    }

    /**
     * Rundentyp in einem Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("runde")
    public void setRunde(RundenTyp runde) {
        this.runde = runde;
    }

    public RundenablaufLevel1Model withRunde(RundenTyp runde) {
        this.runde = runde;
        return this;
    }

    /**
     * Wertungstyp in einer Runde
     * (Required)
     * 
     */
    @JsonProperty("typ")
    public RundenWertungsTyp getTyp() {
        return typ;
    }

    /**
     * Wertungstyp in einer Runde
     * (Required)
     * 
     */
    @JsonProperty("typ")
    public void setTyp(RundenWertungsTyp typ) {
        this.typ = typ;
    }

    public RundenablaufLevel1Model withTyp(RundenWertungsTyp typ) {
        this.typ = typ;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("runde", runde).append("typ", typ).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(runde).append(typ).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RundenablaufLevel1Model) == false) {
            return false;
        }
        RundenablaufLevel1Model rhs = ((RundenablaufLevel1Model) other);
        return new EqualsBuilder().append(runde, rhs.runde).append(typ, rhs.typ).isEquals();
    }

}
