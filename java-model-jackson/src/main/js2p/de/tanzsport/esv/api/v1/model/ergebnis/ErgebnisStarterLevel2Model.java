
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.StartgruppeTyp;
import de.tanzsport.esv.api.v1.model.StartklasseTyp;
import de.tanzsport.esv.api.v1.model.WettbewerbsartTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Starter in einem Ergebnis (Level 2)
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
    "startgruppe",
    "startklasse",
    "wettbewerbsart",
    "ergebnis",
    "wertung",
    "stichrundenwertung"
})
public class ErgebnisStarterLevel2Model implements Serializable
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
     * Startgruppe (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    @JsonPropertyDescription("Startgruppe (inkl. null)")
    private StartgruppeTyp startgruppe;
    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    @JsonPropertyDescription("Startklasse (inkl. null)")
    private StartklasseTyp startklasse;
    /**
     * Wettbewerbsart (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    @JsonPropertyDescription("Wettbewerbsart (inkl. null)")
    private WettbewerbsartTyp wettbewerbsart;
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
    /**
     * Stichrundenwertung eines Starters
     * <p>
     * Stichrundenwertung eines Starters (nur eine möglich), null falls nicht vorhanden
     * (Required)
     * 
     */
    @JsonProperty("stichrundenwertung")
    @JsonPropertyDescription("Stichrundenwertung eines Starters (nur eine m\u00f6glich), null falls nicht vorhanden")
    private StarterStichrundenWertungModel stichrundenwertung;
    private final static long serialVersionUID = -7733487032730811070L;

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

    public ErgebnisStarterLevel2Model withId(Integer id) {
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

    public ErgebnisStarterLevel2Model withStartNr(Integer startNr) {
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

    public ErgebnisStarterLevel2Model withPersonen(List<ErgebnisPersonModel> personen) {
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

    public ErgebnisStarterLevel2Model withStaat(String staat) {
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

    public ErgebnisStarterLevel2Model withStatus(TeilnahmeTyp status) {
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

    public ErgebnisStarterLevel2Model withMeldungsTyp(MeldungsTyp meldungsTyp) {
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

    public ErgebnisStarterLevel2Model withSterne(Integer sterne) {
        this.sterne = sterne;
        return this;
    }

    /**
     * Startgruppe (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    public StartgruppeTyp getStartgruppe() {
        return startgruppe;
    }

    /**
     * Startgruppe (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    public void setStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
    }

    public ErgebnisStarterLevel2Model withStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
        return this;
    }

    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    public StartklasseTyp getStartklasse() {
        return startklasse;
    }

    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    public void setStartklasse(StartklasseTyp startklasse) {
        this.startklasse = startklasse;
    }

    public ErgebnisStarterLevel2Model withStartklasse(StartklasseTyp startklasse) {
        this.startklasse = startklasse;
        return this;
    }

    /**
     * Wettbewerbsart (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    public WettbewerbsartTyp getWettbewerbsart() {
        return wettbewerbsart;
    }

    /**
     * Wettbewerbsart (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    public void setWettbewerbsart(WettbewerbsartTyp wettbewerbsart) {
        this.wettbewerbsart = wettbewerbsart;
    }

    public ErgebnisStarterLevel2Model withWettbewerbsart(WettbewerbsartTyp wettbewerbsart) {
        this.wettbewerbsart = wettbewerbsart;
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

    public ErgebnisStarterLevel2Model withErgebnis(StarterErgebnisModel ergebnis) {
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

    public ErgebnisStarterLevel2Model withWertung(List<WertungModel> wertung) {
        this.wertung = wertung;
        return this;
    }

    /**
     * Stichrundenwertung eines Starters
     * <p>
     * Stichrundenwertung eines Starters (nur eine möglich), null falls nicht vorhanden
     * (Required)
     * 
     */
    @JsonProperty("stichrundenwertung")
    public StarterStichrundenWertungModel getStichrundenwertung() {
        return stichrundenwertung;
    }

    /**
     * Stichrundenwertung eines Starters
     * <p>
     * Stichrundenwertung eines Starters (nur eine möglich), null falls nicht vorhanden
     * (Required)
     * 
     */
    @JsonProperty("stichrundenwertung")
    public void setStichrundenwertung(StarterStichrundenWertungModel stichrundenwertung) {
        this.stichrundenwertung = stichrundenwertung;
    }

    public ErgebnisStarterLevel2Model withStichrundenwertung(StarterStichrundenWertungModel stichrundenwertung) {
        this.stichrundenwertung = stichrundenwertung;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("startNr", startNr).append("personen", personen).append("staat", staat).append("status", status).append("meldungsTyp", meldungsTyp).append("sterne", sterne).append("startgruppe", startgruppe).append("startklasse", startklasse).append("wettbewerbsart", wettbewerbsart).append("ergebnis", ergebnis).append("wertung", wertung).append("stichrundenwertung", stichrundenwertung).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wertung).append(startklasse).append(sterne).append(meldungsTyp).append(stichrundenwertung).append(startNr).append(personen).append(wettbewerbsart).append(startgruppe).append(staat).append(id).append(ergebnis).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErgebnisStarterLevel2Model) == false) {
            return false;
        }
        ErgebnisStarterLevel2Model rhs = ((ErgebnisStarterLevel2Model) other);
        return new EqualsBuilder().append(wertung, rhs.wertung).append(startklasse, rhs.startklasse).append(sterne, rhs.sterne).append(meldungsTyp, rhs.meldungsTyp).append(stichrundenwertung, rhs.stichrundenwertung).append(startNr, rhs.startNr).append(personen, rhs.personen).append(wettbewerbsart, rhs.wettbewerbsart).append(startgruppe, rhs.startgruppe).append(staat, rhs.staat).append(id, rhs.id).append(ergebnis, rhs.ergebnis).append(status, rhs.status).isEquals();
    }

}
