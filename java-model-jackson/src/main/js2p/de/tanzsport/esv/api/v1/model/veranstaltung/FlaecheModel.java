
package de.tanzsport.esv.api.v1.model.veranstaltung;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten einer Turnierfläche
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "typ",
    "laenge",
    "breite"
})
public class FlaecheModel implements Serializable
{

    /**
     * ID der Fläche zur Referenzierung; eindeutig innerhalb einer Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID der Fl\u00e4che zur Referenzierung; eindeutig innerhalb einer Veranstaltung")
    private String id;
    /**
     * Typ der Fläche (Parkett, PVC etc.)
     * (Required)
     * 
     */
    @JsonProperty("typ")
    @JsonPropertyDescription("Typ der Fl\u00e4che (Parkett, PVC etc.)")
    private String typ;
    /**
     * Flächenlänge
     * (Required)
     * 
     */
    @JsonProperty("laenge")
    @JsonPropertyDescription("Fl\u00e4chenl\u00e4nge")
    private Double laenge;
    /**
     * Flächenbreite
     * (Required)
     * 
     */
    @JsonProperty("breite")
    @JsonPropertyDescription("Fl\u00e4chenbreite")
    private Double breite;
    private final static long serialVersionUID = 3606958069724332217L;

    /**
     * ID der Fläche zur Referenzierung; eindeutig innerhalb einer Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID der Fläche zur Referenzierung; eindeutig innerhalb einer Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FlaecheModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Typ der Fläche (Parkett, PVC etc.)
     * (Required)
     * 
     */
    @JsonProperty("typ")
    public String getTyp() {
        return typ;
    }

    /**
     * Typ der Fläche (Parkett, PVC etc.)
     * (Required)
     * 
     */
    @JsonProperty("typ")
    public void setTyp(String typ) {
        this.typ = typ;
    }

    public FlaecheModel withTyp(String typ) {
        this.typ = typ;
        return this;
    }

    /**
     * Flächenlänge
     * (Required)
     * 
     */
    @JsonProperty("laenge")
    public Double getLaenge() {
        return laenge;
    }

    /**
     * Flächenlänge
     * (Required)
     * 
     */
    @JsonProperty("laenge")
    public void setLaenge(Double laenge) {
        this.laenge = laenge;
    }

    public FlaecheModel withLaenge(Double laenge) {
        this.laenge = laenge;
        return this;
    }

    /**
     * Flächenbreite
     * (Required)
     * 
     */
    @JsonProperty("breite")
    public Double getBreite() {
        return breite;
    }

    /**
     * Flächenbreite
     * (Required)
     * 
     */
    @JsonProperty("breite")
    public void setBreite(Double breite) {
        this.breite = breite;
    }

    public FlaecheModel withBreite(Double breite) {
        this.breite = breite;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("typ", typ).append("laenge", laenge).append("breite", breite).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(typ).append(id).append(laenge).append(breite).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlaecheModel) == false) {
            return false;
        }
        FlaecheModel rhs = ((FlaecheModel) other);
        return new EqualsBuilder().append(typ, rhs.typ).append(id, rhs.id).append(laenge, rhs.laenge).append(breite, rhs.breite).isEquals();
    }

}
