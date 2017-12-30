
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
 * Funktionär in einem Ergebnis (Level 2)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "kuerzel",
    "id",
    "vorname",
    "nachname",
    "club",
    "staat"
})
public class FunktionaerLevel2Model implements Serializable
{

    /**
     * Buchstaben-Kürzel des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("kuerzel")
    @JsonPropertyDescription("Buchstaben-K\u00fcrzel des Funktion\u00e4rs")
    private String kuerzel;
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
    private FunktionaerVereinModel verein;
    /**
     * Staat des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("staat")
    @JsonPropertyDescription("Staat des Funktion\u00e4rs")
    private String staat;
    private final static long serialVersionUID = -3442926170228606659L;

    /**
     * Buchstaben-Kürzel des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("kuerzel")
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * Buchstaben-Kürzel des Funktionärs
     * (Required)
     * 
     */
    @JsonProperty("kuerzel")
    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public FunktionaerLevel2Model withKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
        return this;
    }

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

    public FunktionaerLevel2Model withId(String id) {
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

    public FunktionaerLevel2Model withVorname(String vorname) {
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

    public FunktionaerLevel2Model withNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * Verein eines Funktionärs im Ergebnis
     * 
     */
    @JsonProperty("club")
    public FunktionaerVereinModel getClub() {
        return verein;
    }

    /**
     * Verein eines Funktionärs im Ergebnis
     * 
     */
    @JsonProperty("club")
    public void setClub(FunktionaerVereinModel verein) {
        this.verein = verein;
    }

    public FunktionaerLevel2Model withVerein(FunktionaerVereinModel verein) {
        this.verein = verein;
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

    public FunktionaerLevel2Model withStaat(String staat) {
        this.staat = staat;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kuerzel", kuerzel).append("id", id).append("vorname", vorname).append("nachname", nachname).append("verein", verein).append("staat", staat).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vorname).append(verein).append(nachname).append(staat).append(id).append(kuerzel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunktionaerLevel2Model) == false) {
            return false;
        }
        FunktionaerLevel2Model rhs = ((FunktionaerLevel2Model) other);
        return new EqualsBuilder().append(vorname, rhs.vorname).append(verein, rhs.verein).append(nachname, rhs.nachname).append(staat, rhs.staat).append(id, rhs.id).append(kuerzel, rhs.kuerzel).isEquals();
    }

}
