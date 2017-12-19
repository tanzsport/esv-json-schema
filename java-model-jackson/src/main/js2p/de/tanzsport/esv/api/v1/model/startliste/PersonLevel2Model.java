
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
 * Person in einer Startliste (Level 2)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "titel",
    "vorname",
    "nachname",
    "geschlecht",
    "wdsfMin",
    "nationalitaet",
    "startaufstellung"
})
public class PersonLevel2Model implements Serializable
{

    /**
     * DTV-Nummer der Person
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("DTV-Nummer der Person")
    private String id;
    /**
     * Titel der Person
     * (Required)
     * 
     */
    @JsonProperty("titel")
    @JsonPropertyDescription("Titel der Person")
    private String titel;
    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    @JsonPropertyDescription("Vorname der Person")
    private String vorname;
    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    @JsonPropertyDescription("Nachname der Person")
    private String nachname;
    /**
     * Geschlecht einer Person (m = männlich, w = weiblich)
     * (Required)
     * 
     */
    @JsonProperty("geschlecht")
    @JsonPropertyDescription("Geschlecht einer Person (m = m\u00e4nnlich, w = weiblich)")
    private de.tanzsport.esv.api.v1.model.startliste.PersonLevel1Model.Geschlecht geschlecht;
    /**
     * WDSF-MIN der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("wdsfMin")
    @JsonPropertyDescription("WDSF-MIN der Person sofern vorhanden")
    private Integer wdsfMin;
    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("nationalitaet")
    @JsonPropertyDescription("dreibuchstabiger IOC-Code, repr\u00e4sentiert das Land, f\u00fcr das ein Starter startet oder die Staatsangeh\u00f6rigkeit einer Person")
    private String nationalitaet;
    /**
     * Aktiver in Startaufstellung, nur relevant bei Formations- und Gruppenwettbewerben (A=aktiv in der Startaufstellung)
     * (Required)
     * 
     */
    @JsonProperty("startaufstellung")
    @JsonPropertyDescription("Aktiver in Startaufstellung, nur relevant bei Formations- und Gruppenwettbewerben (A=aktiv in der Startaufstellung)")
    private Boolean startaufstellung;
    private final static long serialVersionUID = -2945646706820698993L;

    /**
     * DTV-Nummer der Person
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * DTV-Nummer der Person
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonLevel2Model withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Titel der Person
     * (Required)
     * 
     */
    @JsonProperty("titel")
    public String getTitel() {
        return titel;
    }

    /**
     * Titel der Person
     * (Required)
     * 
     */
    @JsonProperty("titel")
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public PersonLevel2Model withTitel(String titel) {
        this.titel = titel;
        return this;
    }

    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public String getVorname() {
        return vorname;
    }

    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public PersonLevel2Model withVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public String getNachname() {
        return nachname;
    }

    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public PersonLevel2Model withNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * Geschlecht einer Person (m = männlich, w = weiblich)
     * (Required)
     * 
     */
    @JsonProperty("geschlecht")
    public de.tanzsport.esv.api.v1.model.startliste.PersonLevel1Model.Geschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Geschlecht einer Person (m = männlich, w = weiblich)
     * (Required)
     * 
     */
    @JsonProperty("geschlecht")
    public void setGeschlecht(de.tanzsport.esv.api.v1.model.startliste.PersonLevel1Model.Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    public PersonLevel2Model withGeschlecht(de.tanzsport.esv.api.v1.model.startliste.PersonLevel1Model.Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
        return this;
    }

    /**
     * WDSF-MIN der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("wdsfMin")
    public Integer getWdsfMin() {
        return wdsfMin;
    }

    /**
     * WDSF-MIN der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("wdsfMin")
    public void setWdsfMin(Integer wdsfMin) {
        this.wdsfMin = wdsfMin;
    }

    public PersonLevel2Model withWdsfMin(Integer wdsfMin) {
        this.wdsfMin = wdsfMin;
        return this;
    }

    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("nationalitaet")
    public String getNationalitaet() {
        return nationalitaet;
    }

    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("nationalitaet")
    public void setNationalitaet(String nationalitaet) {
        this.nationalitaet = nationalitaet;
    }

    public PersonLevel2Model withNationalitaet(String nationalitaet) {
        this.nationalitaet = nationalitaet;
        return this;
    }

    /**
     * Aktiver in Startaufstellung, nur relevant bei Formations- und Gruppenwettbewerben (A=aktiv in der Startaufstellung)
     * (Required)
     * 
     */
    @JsonProperty("startaufstellung")
    public Boolean getStartaufstellung() {
        return startaufstellung;
    }

    /**
     * Aktiver in Startaufstellung, nur relevant bei Formations- und Gruppenwettbewerben (A=aktiv in der Startaufstellung)
     * (Required)
     * 
     */
    @JsonProperty("startaufstellung")
    public void setStartaufstellung(Boolean startaufstellung) {
        this.startaufstellung = startaufstellung;
    }

    public PersonLevel2Model withStartaufstellung(Boolean startaufstellung) {
        this.startaufstellung = startaufstellung;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("titel", titel).append("vorname", vorname).append("nachname", nachname).append("geschlecht", geschlecht).append("wdsfMin", wdsfMin).append("nationalitaet", nationalitaet).append("startaufstellung", startaufstellung).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(titel).append(startaufstellung).append(vorname).append(nachname).append(geschlecht).append(id).append(wdsfMin).append(nationalitaet).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonLevel2Model) == false) {
            return false;
        }
        PersonLevel2Model rhs = ((PersonLevel2Model) other);
        return new EqualsBuilder().append(titel, rhs.titel).append(startaufstellung, rhs.startaufstellung).append(vorname, rhs.vorname).append(nachname, rhs.nachname).append(geschlecht, rhs.geschlecht).append(id, rhs.id).append(wdsfMin, rhs.wdsfMin).append(nationalitaet, rhs.nationalitaet).isEquals();
    }

}
