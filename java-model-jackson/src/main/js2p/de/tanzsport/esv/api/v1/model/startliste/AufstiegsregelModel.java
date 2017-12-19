
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Aufstiegsregeln für Einzelwettbewerbe Std/Lat, später ggf. JMD
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "minPunkte",
    "platzierungBis"
})
public class AufstiegsregelModel implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minPunkte")
    private Integer minPunkte;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platzierungBis")
    private Integer platzierungBis;
    private final static long serialVersionUID = -2982874191664266291L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minPunkte")
    public Integer getMinPunkte() {
        return minPunkte;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minPunkte")
    public void setMinPunkte(Integer minPunkte) {
        this.minPunkte = minPunkte;
    }

    public AufstiegsregelModel withMinPunkte(Integer minPunkte) {
        this.minPunkte = minPunkte;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platzierungBis")
    public Integer getPlatzierungBis() {
        return platzierungBis;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platzierungBis")
    public void setPlatzierungBis(Integer platzierungBis) {
        this.platzierungBis = platzierungBis;
    }

    public AufstiegsregelModel withPlatzierungBis(Integer platzierungBis) {
        this.platzierungBis = platzierungBis;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minPunkte", minPunkte).append("platzierungBis", platzierungBis).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minPunkte).append(platzierungBis).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AufstiegsregelModel) == false) {
            return false;
        }
        AufstiegsregelModel rhs = ((AufstiegsregelModel) other);
        return new EqualsBuilder().append(minPunkte, rhs.minPunkte).append(platzierungBis, rhs.platzierungBis).isEquals();
    }

}
