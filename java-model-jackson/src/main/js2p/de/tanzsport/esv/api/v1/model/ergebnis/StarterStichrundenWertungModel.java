
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
 * Stichrundenwertung eines Starters
 * <p>
 * Stichrundenwertung eines Starters (nur eine möglich), null falls nicht vorhanden
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "stichrunde",
    "wertung"
})
public class StarterStichrundenWertungModel implements Serializable
{

    /**
     * Index der Stichrunde aus dem Stichrundenablauf
     * <p>
     *  0-basierter Index der Stichrunde aus dem Array [stichrunden] im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("stichrunde")
    @JsonPropertyDescription("0-basierter Index der Stichrunde aus dem Array [stichrunden] im Ergebnis")
    private Integer stichrunde;
    /**
     * End- oder Stichrundenwertung eines Starters (Platzwertung)
     * <p>
     * Array über alle Tänze in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("wertung")
    @JsonPropertyDescription("Array \u00fcber alle T\u00e4nze in der Reihenfolge der Nennung im Ergebnis")
    private PlatzWertungModel wertung;
    private final static long serialVersionUID = -2233044244443495017L;

    /**
     * Index der Stichrunde aus dem Stichrundenablauf
     * <p>
     *  0-basierter Index der Stichrunde aus dem Array [stichrunden] im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("stichrunde")
    public Integer getStichrunde() {
        return stichrunde;
    }

    /**
     * Index der Stichrunde aus dem Stichrundenablauf
     * <p>
     *  0-basierter Index der Stichrunde aus dem Array [stichrunden] im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("stichrunde")
    public void setStichrunde(Integer stichrunde) {
        this.stichrunde = stichrunde;
    }

    public StarterStichrundenWertungModel withStichrunde(Integer stichrunde) {
        this.stichrunde = stichrunde;
        return this;
    }

    /**
     * End- oder Stichrundenwertung eines Starters (Platzwertung)
     * <p>
     * Array über alle Tänze in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("wertung")
    public PlatzWertungModel getWertung() {
        return wertung;
    }

    /**
     * End- oder Stichrundenwertung eines Starters (Platzwertung)
     * <p>
     * Array über alle Tänze in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("wertung")
    public void setWertung(PlatzWertungModel wertung) {
        this.wertung = wertung;
    }

    public StarterStichrundenWertungModel withWertung(PlatzWertungModel wertung) {
        this.wertung = wertung;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stichrunde", stichrunde).append("wertung", wertung).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wertung).append(stichrunde).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StarterStichrundenWertungModel) == false) {
            return false;
        }
        StarterStichrundenWertungModel rhs = ((StarterStichrundenWertungModel) other);
        return new EqualsBuilder().append(wertung, rhs.wertung).append(stichrunde, rhs.stichrunde).isEquals();
    }

}
