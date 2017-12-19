
package de.tanzsport.esv.api.v1.model.veranstaltung;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.LizenztraegerModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * JSON-Schema für die Response des Endpunktes /api/v1/turniere/:id
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "datumVon",
    "datumBis",
    "turnierstaette",
    "veranstalter",
    "ausrichter",
    "titel",
    "bemerkung",
    "wertungsrichter",
    "funktionaere",
    "flaechen",
    "turniere"
})
public class VeranstaltungModel implements Serializable
{

    /**
     * ID der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID der Veranstaltung")
    private Integer id;
    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumVon")
    @JsonPropertyDescription("ISO8601 Datum/Zeit")
    private ZonedDateTime datumVon;
    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumBis")
    @JsonPropertyDescription("ISO8601 Datum/Zeit")
    private ZonedDateTime datumBis;
    /**
     * Daten einer Turnierstätte
     * (Required)
     * 
     */
    @JsonProperty("turnierstaette")
    @JsonPropertyDescription("Daten einer Turnierst\u00e4tte")
    private TurnierstaetteModel turnierstaette;
    /**
     * Daten eines Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("veranstalter")
    @JsonPropertyDescription("Daten eines Veranstalters/Ausrichters")
    private VeranstalterAusrichterModel veranstalter;
    /**
     * Daten eines Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("ausrichter")
    @JsonPropertyDescription("Daten eines Veranstalters/Ausrichters")
    private VeranstalterAusrichterModel ausrichter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("titel")
    private String titel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bemerkung")
    private String bemerkung;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wertungsrichter")
    private List<LizenztraegerModel> wertungsrichter = new ArrayList<LizenztraegerModel>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("funktionaere")
    private List<LizenztraegerModel> funktionaere = new ArrayList<LizenztraegerModel>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flaechen")
    private List<FlaecheModel> flaechen = new ArrayList<FlaecheModel>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("turniere")
    private List<TurnierModel> turniere = new ArrayList<TurnierModel>();
    private final static long serialVersionUID = 6417021000672311630L;

    /**
     * ID der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public VeranstaltungModel withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumVon")
    public ZonedDateTime getDatumVon() {
        return datumVon;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumVon")
    public void setDatumVon(ZonedDateTime datumVon) {
        this.datumVon = datumVon;
    }

    public VeranstaltungModel withDatumVon(ZonedDateTime datumVon) {
        this.datumVon = datumVon;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumBis")
    public ZonedDateTime getDatumBis() {
        return datumBis;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumBis")
    public void setDatumBis(ZonedDateTime datumBis) {
        this.datumBis = datumBis;
    }

    public VeranstaltungModel withDatumBis(ZonedDateTime datumBis) {
        this.datumBis = datumBis;
        return this;
    }

    /**
     * Daten einer Turnierstätte
     * (Required)
     * 
     */
    @JsonProperty("turnierstaette")
    public TurnierstaetteModel getTurnierstaette() {
        return turnierstaette;
    }

    /**
     * Daten einer Turnierstätte
     * (Required)
     * 
     */
    @JsonProperty("turnierstaette")
    public void setTurnierstaette(TurnierstaetteModel turnierstaette) {
        this.turnierstaette = turnierstaette;
    }

    public VeranstaltungModel withTurnierstaette(TurnierstaetteModel turnierstaette) {
        this.turnierstaette = turnierstaette;
        return this;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("veranstalter")
    public VeranstalterAusrichterModel getVeranstalter() {
        return veranstalter;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("veranstalter")
    public void setVeranstalter(VeranstalterAusrichterModel veranstalter) {
        this.veranstalter = veranstalter;
    }

    public VeranstaltungModel withVeranstalter(VeranstalterAusrichterModel veranstalter) {
        this.veranstalter = veranstalter;
        return this;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("ausrichter")
    public VeranstalterAusrichterModel getAusrichter() {
        return ausrichter;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("ausrichter")
    public void setAusrichter(VeranstalterAusrichterModel ausrichter) {
        this.ausrichter = ausrichter;
    }

    public VeranstaltungModel withAusrichter(VeranstalterAusrichterModel ausrichter) {
        this.ausrichter = ausrichter;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("titel")
    public String getTitel() {
        return titel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("titel")
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public VeranstaltungModel withTitel(String titel) {
        this.titel = titel;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bemerkung")
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bemerkung")
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public VeranstaltungModel withBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wertungsrichter")
    public List<LizenztraegerModel> getWertungsrichter() {
        return wertungsrichter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wertungsrichter")
    public void setWertungsrichter(List<LizenztraegerModel> wertungsrichter) {
        this.wertungsrichter = wertungsrichter;
    }

    public VeranstaltungModel withWertungsrichter(List<LizenztraegerModel> wertungsrichter) {
        this.wertungsrichter = wertungsrichter;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("funktionaere")
    public List<LizenztraegerModel> getFunktionaere() {
        return funktionaere;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("funktionaere")
    public void setFunktionaere(List<LizenztraegerModel> funktionaere) {
        this.funktionaere = funktionaere;
    }

    public VeranstaltungModel withFunktionaere(List<LizenztraegerModel> funktionaere) {
        this.funktionaere = funktionaere;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flaechen")
    public List<FlaecheModel> getFlaechen() {
        return flaechen;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flaechen")
    public void setFlaechen(List<FlaecheModel> flaechen) {
        this.flaechen = flaechen;
    }

    public VeranstaltungModel withFlaechen(List<FlaecheModel> flaechen) {
        this.flaechen = flaechen;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("turniere")
    public List<TurnierModel> getTurniere() {
        return turniere;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("turniere")
    public void setTurniere(List<TurnierModel> turniere) {
        this.turniere = turniere;
    }

    public VeranstaltungModel withTurniere(List<TurnierModel> turniere) {
        this.turniere = turniere;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("datumVon", datumVon).append("datumBis", datumBis).append("turnierstaette", turnierstaette).append("veranstalter", veranstalter).append("ausrichter", ausrichter).append("titel", titel).append("bemerkung", bemerkung).append("wertungsrichter", wertungsrichter).append("funktionaere", funktionaere).append("flaechen", flaechen).append("turniere", turniere).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(datumVon).append(wertungsrichter).append(flaechen).append(funktionaere).append(turniere).append(turnierstaette).append(veranstalter).append(titel).append(bemerkung).append(datumBis).append(id).append(ausrichter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VeranstaltungModel) == false) {
            return false;
        }
        VeranstaltungModel rhs = ((VeranstaltungModel) other);
        return new EqualsBuilder().append(datumVon, rhs.datumVon).append(wertungsrichter, rhs.wertungsrichter).append(flaechen, rhs.flaechen).append(funktionaere, rhs.funktionaere).append(turniere, rhs.turniere).append(turnierstaette, rhs.turnierstaette).append(veranstalter, rhs.veranstalter).append(titel, rhs.titel).append(bemerkung, rhs.bemerkung).append(datumBis, rhs.datumBis).append(id, rhs.id).append(ausrichter, rhs.ausrichter).isEquals();
    }

}
