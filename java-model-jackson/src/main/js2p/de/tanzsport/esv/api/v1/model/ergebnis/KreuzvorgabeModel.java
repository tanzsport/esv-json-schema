
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Kreuzvorgabe in einem Ergebnis
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "von",
    "bis"
})
public class KreuzvorgabeModel implements Serializable
{

    /**
     * Minimal-Anzahl Kreuze
     * 
     */
    @JsonProperty("von")
    @JsonPropertyDescription("Minimal-Anzahl Kreuze")
    private Integer von;
    /**
     * Maximal-Anzahl Kreuze
     * 
     */
    @JsonProperty("bis")
    @JsonPropertyDescription("Maximal-Anzahl Kreuze")
    private Integer bis;
    private final static long serialVersionUID = 4684625271840983721L;

    /**
     * Minimal-Anzahl Kreuze
     * 
     */
    @JsonProperty("von")
    public Integer getVon() {
        return von;
    }

    /**
     * Minimal-Anzahl Kreuze
     * 
     */
    @JsonProperty("von")
    public void setVon(Integer von) {
        this.von = von;
    }

    public KreuzvorgabeModel withVon(Integer von) {
        this.von = von;
        return this;
    }

    /**
     * Maximal-Anzahl Kreuze
     * 
     */
    @JsonProperty("bis")
    public Integer getBis() {
        return bis;
    }

    /**
     * Maximal-Anzahl Kreuze
     * 
     */
    @JsonProperty("bis")
    public void setBis(Integer bis) {
        this.bis = bis;
    }

    public KreuzvorgabeModel withBis(Integer bis) {
        this.bis = bis;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("von", von).append("bis", bis).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(von).append(bis).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KreuzvorgabeModel) == false) {
            return false;
        }
        KreuzvorgabeModel rhs = ((KreuzvorgabeModel) other);
        return new EqualsBuilder().append(von, rhs.von).append(bis, rhs.bis).isEquals();
    }

}
