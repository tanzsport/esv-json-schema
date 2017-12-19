
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Flags für Startbücher
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "laufzettel",
    "verwarnungSchrittbegrenzung"
})
public class StartbuchFlagsModel implements Serializable
{

    /**
     * Laufzettel drucken
     * (Required)
     * 
     */
    @JsonProperty("laufzettel")
    @JsonPropertyDescription("Laufzettel drucken")
    private Boolean laufzettel;
    /**
     * Verwarnung wg. Schrittbegrenzung liegt vor
     * (Required)
     * 
     */
    @JsonProperty("verwarnungSchrittbegrenzung")
    @JsonPropertyDescription("Verwarnung wg. Schrittbegrenzung liegt vor")
    private Boolean verwarnungSchrittbegrenzung;
    private final static long serialVersionUID = 4423983646041683292L;

    /**
     * Laufzettel drucken
     * (Required)
     * 
     */
    @JsonProperty("laufzettel")
    public Boolean getLaufzettel() {
        return laufzettel;
    }

    /**
     * Laufzettel drucken
     * (Required)
     * 
     */
    @JsonProperty("laufzettel")
    public void setLaufzettel(Boolean laufzettel) {
        this.laufzettel = laufzettel;
    }

    public StartbuchFlagsModel withLaufzettel(Boolean laufzettel) {
        this.laufzettel = laufzettel;
        return this;
    }

    /**
     * Verwarnung wg. Schrittbegrenzung liegt vor
     * (Required)
     * 
     */
    @JsonProperty("verwarnungSchrittbegrenzung")
    public Boolean getVerwarnungSchrittbegrenzung() {
        return verwarnungSchrittbegrenzung;
    }

    /**
     * Verwarnung wg. Schrittbegrenzung liegt vor
     * (Required)
     * 
     */
    @JsonProperty("verwarnungSchrittbegrenzung")
    public void setVerwarnungSchrittbegrenzung(Boolean verwarnungSchrittbegrenzung) {
        this.verwarnungSchrittbegrenzung = verwarnungSchrittbegrenzung;
    }

    public StartbuchFlagsModel withVerwarnungSchrittbegrenzung(Boolean verwarnungSchrittbegrenzung) {
        this.verwarnungSchrittbegrenzung = verwarnungSchrittbegrenzung;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("laufzettel", laufzettel).append("verwarnungSchrittbegrenzung", verwarnungSchrittbegrenzung).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(verwarnungSchrittbegrenzung).append(laufzettel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartbuchFlagsModel) == false) {
            return false;
        }
        StartbuchFlagsModel rhs = ((StartbuchFlagsModel) other);
        return new EqualsBuilder().append(verwarnungSchrittbegrenzung, rhs.verwarnungSchrittbegrenzung).append(laufzettel, rhs.laufzettel).isEquals();
    }

}
