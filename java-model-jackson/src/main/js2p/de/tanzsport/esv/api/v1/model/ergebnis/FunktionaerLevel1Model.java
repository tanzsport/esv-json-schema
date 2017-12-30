
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
 * Funktionär in einem Ergebnis (Level 1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "vorname",
    "nachname",
    "club",
    "staat"
})
public class FunktionaerLevel1Model implements Serializable
{

    /**
     * DTV-Nummer des Funktionärs (sofern vorhanden)
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("DTV-Nummer des Funktion\u00e4rs (sofern vorhanden)")
    private String id;
    /**
     * Vorname des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    @JsonPropertyDescription("Vorname des Funktion\u00e4rs")
    private String vorname;
    /**
     * Nachname des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    @JsonPropertyDescription("Nachname des Funktion\u00e4rs")
    private String nachname;
    /**
     * Verein eines Funktionärs im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("club")
    @JsonPropertyDescription("Verein eines Funktion\u00e4rs im Ergebnis")
    private FunktionaerVereinModel club;
    /**
     * Staat des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("staat")
    @JsonPropertyDescription("Staat des Funktion\u00e4rs")
    private String staat;
    private final static long serialVersionUID = -655000414526637743L;

    /**
     * DTV-Nummer des Funktionärs (sofern vorhanden)
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * DTV-Nummer des Funktionärs (sofern vorhanden)
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FunktionaerLevel1Model withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Vorname des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public String getVorname() {
        return vorname;
    }

    /**
     * Vorname des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public FunktionaerLevel1Model withVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    /**
     * Nachname des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public String getNachname() {
        return nachname;
    }

    /**
     * Nachname des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public FunktionaerLevel1Model withNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * Verein eines Funktionärs im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("club")
    public FunktionaerVereinModel getClub() {
        return club;
    }

    /**
     * Verein eines Funktionärs im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("club")
    public void setClub(FunktionaerVereinModel club) {
        this.club = club;
    }

    public FunktionaerLevel1Model withClub(FunktionaerVereinModel club) {
        this.club = club;
        return this;
    }

    /**
     * Staat des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("staat")
    public String getStaat() {
        return staat;
    }

    /**
     * Staat des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("staat")
    public void setStaat(String staat) {
        this.staat = staat;
    }

    public FunktionaerLevel1Model withStaat(String staat) {
        this.staat = staat;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("vorname", vorname).append("nachname", nachname).append("club", club).append("staat", staat).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(club).append(nachname).append(staat).append(id).append(vorname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunktionaerLevel1Model) == false) {
            return false;
        }
        FunktionaerLevel1Model rhs = ((FunktionaerLevel1Model) other);
        return new EqualsBuilder().append(club, rhs.club).append(nachname, rhs.nachname).append(staat, rhs.staat).append(id, rhs.id).append(vorname, rhs.vorname).isEquals();
    }

}
