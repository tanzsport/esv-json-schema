
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Ausrechnung in einer Endrunden oder Skating-Tabelle
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "anzahl",
    "summe"
})
public class EndrundentabellenModel implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("anzahl")
    private Integer anzahl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summe")
    private Integer summe;
    private final static long serialVersionUID = 594940833623237787L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("anzahl")
    public Integer getAnzahl() {
        return anzahl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("anzahl")
    public void setAnzahl(Integer anzahl) {
        this.anzahl = anzahl;
    }

    public EndrundentabellenModel withAnzahl(Integer anzahl) {
        this.anzahl = anzahl;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summe")
    public Integer getSumme() {
        return summe;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summe")
    public void setSumme(Integer summe) {
        this.summe = summe;
    }

    public EndrundentabellenModel withSumme(Integer summe) {
        this.summe = summe;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("anzahl", anzahl).append("summe", summe).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(summe).append(anzahl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndrundentabellenModel) == false) {
            return false;
        }
        EndrundentabellenModel rhs = ((EndrundentabellenModel) other);
        return new EqualsBuilder().append(summe, rhs.summe).append(anzahl, rhs.anzahl).isEquals();
    }

}
