
package de.tanzsport.esv.api.v1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten eines Lizenzträgers
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "wdsfMin",
    "lizenzNr",
    "titel",
    "vorname",
    "nachname",
    "club",
    "staat",
    "lizenzen"
})
public class LizenztraegerModel implements Serializable
{

    /**
     * DTV-Nummer des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("DTV-Nummer des Lizenztr\u00e4gers")
    private String id;
    /**
     * WDSF-MIN sofern vorhanden
     * 
     */
    @JsonProperty("wdsfMin")
    @JsonPropertyDescription("WDSF-MIN sofern vorhanden")
    private Integer wdsfMin;
    /**
     * alte Lizenz-Nr. sofern vorhanden
     * 
     */
    @JsonProperty("lizenzNr")
    @JsonPropertyDescription("alte Lizenz-Nr. sofern vorhanden")
    private Integer lizenzNr;
    /**
     * Titel sofern vorhanden
     * 
     */
    @JsonProperty("titel")
    @JsonPropertyDescription("Titel sofern vorhanden")
    private String titel;
    /**
     * Vorname des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    @JsonPropertyDescription("Vorname des Lizenztr\u00e4gers")
    private String vorname;
    /**
     * Nachname des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    @JsonPropertyDescription("Nachname des Lizenztr\u00e4gers")
    private String nachname;
    /**
     * Daten eines Vereins
     * (Required)
     * 
     */
    @JsonProperty("club")
    @JsonPropertyDescription("Daten eines Vereins")
    private VereinModel verein;
    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    @JsonPropertyDescription("dreibuchstabiger IOC-Code, repr\u00e4sentiert das Land, f\u00fcr das ein Starter startet oder die Staatsangeh\u00f6rigkeit einer Person")
    private String staat;
    /**
     * Lizenzen des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("lizenzen")
    @JsonPropertyDescription("Lizenzen des Lizenztr\u00e4gers")
    private List<LizenzTyp> lizenzen = new ArrayList<LizenzTyp>();
    private final static long serialVersionUID = 2471960688652473452L;

    /**
     * DTV-Nummer des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * DTV-Nummer des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public LizenztraegerModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * WDSF-MIN sofern vorhanden
     * 
     */
    @JsonProperty("wdsfMin")
    public Integer getWdsfMin() {
        return wdsfMin;
    }

    /**
     * WDSF-MIN sofern vorhanden
     * 
     */
    @JsonProperty("wdsfMin")
    public void setWdsfMin(Integer wdsfMin) {
        this.wdsfMin = wdsfMin;
    }

    public LizenztraegerModel withWdsfMin(Integer wdsfMin) {
        this.wdsfMin = wdsfMin;
        return this;
    }

    /**
     * alte Lizenz-Nr. sofern vorhanden
     * 
     */
    @JsonProperty("lizenzNr")
    public Integer getLizenzNr() {
        return lizenzNr;
    }

    /**
     * alte Lizenz-Nr. sofern vorhanden
     * 
     */
    @JsonProperty("lizenzNr")
    public void setLizenzNr(Integer lizenzNr) {
        this.lizenzNr = lizenzNr;
    }

    public LizenztraegerModel withLizenzNr(Integer lizenzNr) {
        this.lizenzNr = lizenzNr;
        return this;
    }

    /**
     * Titel sofern vorhanden
     * 
     */
    @JsonProperty("titel")
    public String getTitel() {
        return titel;
    }

    /**
     * Titel sofern vorhanden
     * 
     */
    @JsonProperty("titel")
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public LizenztraegerModel withTitel(String titel) {
        this.titel = titel;
        return this;
    }

    /**
     * Vorname des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public String getVorname() {
        return vorname;
    }

    /**
     * Vorname des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public LizenztraegerModel withVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    /**
     * Nachname des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public String getNachname() {
        return nachname;
    }

    /**
     * Nachname des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LizenztraegerModel withNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * Daten eines Vereins
     * 
     */
    @JsonProperty("club")
    public VereinModel getClub() {
        return verein;
    }

    /**
     * Daten eines Vereins
     * 
     */
    @JsonProperty("club")
    public void setClub(VereinModel verein) {
        this.verein = verein;
    }

    public LizenztraegerModel withVerein(VereinModel verein) {
        this.verein = verein;
        return this;
    }

    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    public String getStaat() {
        return staat;
    }

    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    public void setStaat(String staat) {
        this.staat = staat;
    }

    public LizenztraegerModel withStaat(String staat) {
        this.staat = staat;
        return this;
    }

    /**
     * Lizenzen des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("lizenzen")
    public List<LizenzTyp> getLizenzen() {
        return lizenzen;
    }

    /**
     * Lizenzen des Lizenzträgers
     * (Required)
     * 
     */
    @JsonProperty("lizenzen")
    public void setLizenzen(List<LizenzTyp> lizenzen) {
        this.lizenzen = lizenzen;
    }

    public LizenztraegerModel withLizenzen(List<LizenzTyp> lizenzen) {
        this.lizenzen = lizenzen;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("wdsfMin", wdsfMin).append("lizenzNr", lizenzNr).append("titel", titel).append("vorname", vorname).append("nachname", nachname).append("verein", verein).append("staat", staat).append("lizenzen", lizenzen).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(titel).append(lizenzen).append(lizenzNr).append(vorname).append(verein).append(nachname).append(staat).append(id).append(wdsfMin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LizenztraegerModel) == false) {
            return false;
        }
        LizenztraegerModel rhs = ((LizenztraegerModel) other);
        return new EqualsBuilder().append(titel, rhs.titel).append(lizenzen, rhs.lizenzen).append(lizenzNr, rhs.lizenzNr).append(vorname, rhs.vorname).append(verein, rhs.verein).append(nachname, rhs.nachname).append(staat, rhs.staat).append(id, rhs.id).append(wdsfMin, rhs.wdsfMin).isEquals();
    }

}
