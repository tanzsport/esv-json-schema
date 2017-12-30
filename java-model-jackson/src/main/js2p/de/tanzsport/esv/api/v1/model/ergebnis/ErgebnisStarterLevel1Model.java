
package de.tanzsport.esv.api.v1.model.ergebnis;

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
 * Starter in einem Ergebnis (Level 1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "startNr",
    "personen",
    "staat",
    "status",
    "meldungsTyp",
    "sterne",
    "ergebnis",
    "wertung"
})
public class ErgebnisStarterLevel1Model implements Serializable
{

    /**
     * Starter-ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Starter-ID")
    private Integer id;
    /**
     * Start-Nummer
     * (Required)
     * 
     */
    @JsonProperty("startNr")
    @JsonPropertyDescription("Start-Nummer")
    private Integer startNr;
    /**
     * Personen dieses Starters
     * (Required)
     * 
     */
    @JsonProperty("personen")
    @JsonPropertyDescription("Personen dieses Starters")
    private List<ErgebnisPersonModel> personen = new ArrayList<ErgebnisPersonModel>();
    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    @JsonPropertyDescription("dreibuchstabiger IOC-Code, repr\u00e4sentiert das Land, f\u00fcr das ein Starter startet oder die Staatsangeh\u00f6rigkeit einer Person")
    private String staat;
    /**
     * Teilnahme-Status eines Starters im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Teilnahme-Status eines Starters im Ergebnis")
    private TeilnahmeTyp status;
    /**
     * Meldungstyp eines Starters im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("meldungsTyp")
    @JsonPropertyDescription("Meldungstyp eines Starters im Ergebnis")
    private MeldungsTyp meldungsTyp;
    /**
     * Anzahl Sterne
     * (Required)
     * 
     */
    @JsonProperty("sterne")
    @JsonPropertyDescription("Anzahl Sterne")
    private Integer sterne;
    /**
     * Ergebnis eines Starters
     * (Required)
     * 
     */
    @JsonProperty("ergebnis")
    @JsonPropertyDescription("Ergebnis eines Starters")
    private StarterErgebnisModel ergebnis;
    /**
     * Wertungen des Starters
     * (Required)
     * 
     */
    @JsonProperty("wertung")
    @JsonPropertyDescription("Wertungen des Starters")
    private List<WertungModel> wertung = new ArrayList<WertungModel>();
    private final static long serialVersionUID = -1007648758533440003L;

    /**
     * Starter-ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Starter-ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public ErgebnisStarterLevel1Model withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Start-Nummer
     * (Required)
     * 
     */
    @JsonProperty("startNr")
    public Integer getStartNr() {
        return startNr;
    }

    /**
     * Start-Nummer
     * (Required)
     * 
     */
    @JsonProperty("startNr")
    public void setStartNr(Integer startNr) {
        this.startNr = startNr;
    }

    public ErgebnisStarterLevel1Model withStartNr(Integer startNr) {
        this.startNr = startNr;
        return this;
    }

    /**
     * Personen dieses Starters
     * (Required)
     * 
     */
    @JsonProperty("personen")
    public List<ErgebnisPersonModel> getPersonen() {
        return personen;
    }

    /**
     * Personen dieses Starters
     * (Required)
     * 
     */
    @JsonProperty("personen")
    public void setPersonen(List<ErgebnisPersonModel> personen) {
        this.personen = personen;
    }

    public ErgebnisStarterLevel1Model withPersonen(List<ErgebnisPersonModel> personen) {
        this.personen = personen;
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

    public ErgebnisStarterLevel1Model withStaat(String staat) {
        this.staat = staat;
        return this;
    }

    /**
     * Teilnahme-Status eines Starters im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("status")
    public TeilnahmeTyp getStatus() {
        return status;
    }

    /**
     * Teilnahme-Status eines Starters im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(TeilnahmeTyp status) {
        this.status = status;
    }

    public ErgebnisStarterLevel1Model withStatus(TeilnahmeTyp status) {
        this.status = status;
        return this;
    }

    /**
     * Meldungstyp eines Starters im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("meldungsTyp")
    public MeldungsTyp getMeldungsTyp() {
        return meldungsTyp;
    }

    /**
     * Meldungstyp eines Starters im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("meldungsTyp")
    public void setMeldungsTyp(MeldungsTyp meldungsTyp) {
        this.meldungsTyp = meldungsTyp;
    }

    public ErgebnisStarterLevel1Model withMeldungsTyp(MeldungsTyp meldungsTyp) {
        this.meldungsTyp = meldungsTyp;
        return this;
    }

    /**
     * Anzahl Sterne
     * (Required)
     * 
     */
    @JsonProperty("sterne")
    public Integer getSterne() {
        return sterne;
    }

    /**
     * Anzahl Sterne
     * (Required)
     * 
     */
    @JsonProperty("sterne")
    public void setSterne(Integer sterne) {
        this.sterne = sterne;
    }

    public ErgebnisStarterLevel1Model withSterne(Integer sterne) {
        this.sterne = sterne;
        return this;
    }

    /**
     * Ergebnis eines Starters
     * (Required)
     * 
     */
    @JsonProperty("ergebnis")
    public StarterErgebnisModel getErgebnis() {
        return ergebnis;
    }

    /**
     * Ergebnis eines Starters
     * (Required)
     * 
     */
    @JsonProperty("ergebnis")
    public void setErgebnis(StarterErgebnisModel ergebnis) {
        this.ergebnis = ergebnis;
    }

    public ErgebnisStarterLevel1Model withErgebnis(StarterErgebnisModel ergebnis) {
        this.ergebnis = ergebnis;
        return this;
    }

    /**
     * Wertungen des Starters
     * (Required)
     * 
     */
    @JsonProperty("wertung")
    public List<WertungModel> getWertung() {
        return wertung;
    }

    /**
     * Wertungen des Starters
     * (Required)
     * 
     */
    @JsonProperty("wertung")
    public void setWertung(List<WertungModel> wertung) {
        this.wertung = wertung;
    }

    public ErgebnisStarterLevel1Model withWertung(List<WertungModel> wertung) {
        this.wertung = wertung;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("startNr", startNr).append("personen", personen).append("staat", staat).append("status", status).append("meldungsTyp", meldungsTyp).append("sterne", sterne).append("ergebnis", ergebnis).append("wertung", wertung).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personen).append(wertung).append(staat).append(sterne).append(id).append(meldungsTyp).append(ergebnis).append(startNr).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErgebnisStarterLevel1Model) == false) {
            return false;
        }
        ErgebnisStarterLevel1Model rhs = ((ErgebnisStarterLevel1Model) other);
        return new EqualsBuilder().append(personen, rhs.personen).append(wertung, rhs.wertung).append(staat, rhs.staat).append(sterne, rhs.sterne).append(id, rhs.id).append(meldungsTyp, rhs.meldungsTyp).append(ergebnis, rhs.ergebnis).append(startNr, rhs.startNr).append(status, rhs.status).isEquals();
    }

}
