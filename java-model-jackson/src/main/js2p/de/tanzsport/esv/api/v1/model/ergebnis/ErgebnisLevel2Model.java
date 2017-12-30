
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.TanzTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "endergebnis",
    "taenze",
    "wr",
    "tl",
    "bs",
    "ch",
    "moderatoren",
    "protokoll",
    "vorkommnisse",
    "beginn",
    "ende",
    "ablauf",
    "kombiniertMit",
    "zuschauer",
    "starter",
    "endrundentabellen",
    "skatingtabellen",
    "stichrundentabellen"
})
public class ErgebnisLevel2Model implements Serializable
{

    /**
     * Flag für Endergebnis
     * (Required)
     * 
     */
    @JsonProperty("endergebnis")
    @JsonPropertyDescription("Flag f\u00fcr Endergebnis")
    private Boolean endergebnis;
    /**
     * Tänze des Turniers
     * (Required)
     * 
     */
    @JsonProperty("taenze")
    @JsonPropertyDescription("T\u00e4nze des Turniers")
    private List<TanzTyp> taenze = new ArrayList<TanzTyp>();
    /**
     * Wertungsrichter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("wr")
    @JsonPropertyDescription("Wertungsrichter des Turniers")
    private List<FunktionaerLevel2Model> wr = new ArrayList<FunktionaerLevel2Model>();
    /**
     * Turnierleiter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("tl")
    @JsonPropertyDescription("Turnierleiter des Turniers")
    private List<FunktionaerLevel2Model> tl = new ArrayList<FunktionaerLevel2Model>();
    /**
     * Beisitzer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("bs")
    @JsonPropertyDescription("Beisitzer des Turniers")
    private List<FunktionaerLevel2Model> bs = new ArrayList<FunktionaerLevel2Model>();
    /**
     * Chairpersonen des Turniers
     * (Required)
     * 
     */
    @JsonProperty("ch")
    @JsonPropertyDescription("Chairpersonen des Turniers")
    private List<FunktionaerLevel2Model> ch = new ArrayList<FunktionaerLevel2Model>();
    /**
     * Moderatoren des Turniers
     * (Required)
     * 
     */
    @JsonProperty("moderatoren")
    @JsonPropertyDescription("Moderatoren des Turniers")
    private List<FunktionaerLevel2Model> moderatoren = new ArrayList<FunktionaerLevel2Model>();
    /**
     * Protokollführer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("protokoll")
    @JsonPropertyDescription("Protokollf\u00fchrer des Turniers")
    private List<FunktionaerLevel2Model> protokoll = new ArrayList<FunktionaerLevel2Model>();
    /**
     * Besondere Vorkommnisse
     * (Required)
     * 
     */
    @JsonProperty("vorkommnisse")
    @JsonPropertyDescription("Besondere Vorkommnisse")
    private String vorkommnisse;
    /**
     * ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)
     * (Required)
     * 
     */
    @JsonProperty("beginn")
    @JsonPropertyDescription("ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)")
    private ZonedDateTime beginn;
    /**
     * ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)
     * (Required)
     * 
     */
    @JsonProperty("ende")
    @JsonPropertyDescription("ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)")
    private ZonedDateTime ende;
    /**
     * Rundenablauf
     * (Required)
     * 
     */
    @JsonProperty("ablauf")
    @JsonPropertyDescription("Rundenablauf")
    private List<RundenablaufLevel2Model> ablauf = new ArrayList<RundenablaufLevel2Model>();
    /**
     * ID des Turniers, mit dem das Turnier dieses Ergebnisses kombiniert wurde
     * (Required)
     * 
     */
    @JsonProperty("kombiniertMit")
    @JsonPropertyDescription("ID des Turniers, mit dem das Turnier dieses Ergebnisses kombiniert wurde")
    private Integer kombiniertMit;
    /**
     * Anzahl der Zuschauer
     * (Required)
     * 
     */
    @JsonProperty("zuschauer")
    @JsonPropertyDescription("Anzahl der Zuschauer")
    private Integer zuschauer;
    /**
     * Starter mit Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("starter")
    @JsonPropertyDescription("Starter mit Ergebnis")
    private List<ErgebnisStarterLevel2Model> starter = new ArrayList<ErgebnisStarterLevel2Model>();
    /**
     * Endrundentabellen dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("endrundentabellen")
    @JsonPropertyDescription("Endrundentabellen dieses Ergebnisses")
    private List<List<List<List<EndrundentabellenModel>>>> endrundentabellen = new ArrayList<List<List<List<EndrundentabellenModel>>>>();
    /**
     * Skatingtabellen dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("skatingtabellen")
    @JsonPropertyDescription("Skatingtabellen dieses Ergebnisses")
    private List<SkatingTabelleModel> skatingtabellen = new ArrayList<SkatingTabelleModel>();
    /**
     * Finaltabellen der Stichrunden dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("stichrundentabellen")
    @JsonPropertyDescription("Finaltabellen der Stichrunden dieses Ergebnisses")
    private List<List<List<List<EndrundentabellenModel>>>> stichrundentabellen = new ArrayList<List<List<List<EndrundentabellenModel>>>>();
    private final static long serialVersionUID = -9004566305048924695L;

    /**
     * Flag für Endergebnis
     * (Required)
     * 
     */
    @JsonProperty("endergebnis")
    public Boolean getEndergebnis() {
        return endergebnis;
    }

    /**
     * Flag für Endergebnis
     * (Required)
     * 
     */
    @JsonProperty("endergebnis")
    public void setEndergebnis(Boolean endergebnis) {
        this.endergebnis = endergebnis;
    }

    public ErgebnisLevel2Model withEndergebnis(Boolean endergebnis) {
        this.endergebnis = endergebnis;
        return this;
    }

    /**
     * Tänze des Turniers
     * (Required)
     * 
     */
    @JsonProperty("taenze")
    public List<TanzTyp> getTaenze() {
        return taenze;
    }

    /**
     * Tänze des Turniers
     * (Required)
     * 
     */
    @JsonProperty("taenze")
    public void setTaenze(List<TanzTyp> taenze) {
        this.taenze = taenze;
    }

    public ErgebnisLevel2Model withTaenze(List<TanzTyp> taenze) {
        this.taenze = taenze;
        return this;
    }

    /**
     * Wertungsrichter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("wr")
    public List<FunktionaerLevel2Model> getWr() {
        return wr;
    }

    /**
     * Wertungsrichter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("wr")
    public void setWr(List<FunktionaerLevel2Model> wr) {
        this.wr = wr;
    }

    public ErgebnisLevel2Model withWr(List<FunktionaerLevel2Model> wr) {
        this.wr = wr;
        return this;
    }

    /**
     * Turnierleiter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("tl")
    public List<FunktionaerLevel2Model> getTl() {
        return tl;
    }

    /**
     * Turnierleiter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("tl")
    public void setTl(List<FunktionaerLevel2Model> tl) {
        this.tl = tl;
    }

    public ErgebnisLevel2Model withTl(List<FunktionaerLevel2Model> tl) {
        this.tl = tl;
        return this;
    }

    /**
     * Beisitzer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("bs")
    public List<FunktionaerLevel2Model> getBs() {
        return bs;
    }

    /**
     * Beisitzer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("bs")
    public void setBs(List<FunktionaerLevel2Model> bs) {
        this.bs = bs;
    }

    public ErgebnisLevel2Model withBs(List<FunktionaerLevel2Model> bs) {
        this.bs = bs;
        return this;
    }

    /**
     * Chairpersonen des Turniers
     * (Required)
     * 
     */
    @JsonProperty("ch")
    public List<FunktionaerLevel2Model> getCh() {
        return ch;
    }

    /**
     * Chairpersonen des Turniers
     * (Required)
     * 
     */
    @JsonProperty("ch")
    public void setCh(List<FunktionaerLevel2Model> ch) {
        this.ch = ch;
    }

    public ErgebnisLevel2Model withCh(List<FunktionaerLevel2Model> ch) {
        this.ch = ch;
        return this;
    }

    /**
     * Moderatoren des Turniers
     * (Required)
     * 
     */
    @JsonProperty("moderatoren")
    public List<FunktionaerLevel2Model> getModeratoren() {
        return moderatoren;
    }

    /**
     * Moderatoren des Turniers
     * (Required)
     * 
     */
    @JsonProperty("moderatoren")
    public void setModeratoren(List<FunktionaerLevel2Model> moderatoren) {
        this.moderatoren = moderatoren;
    }

    public ErgebnisLevel2Model withModeratoren(List<FunktionaerLevel2Model> moderatoren) {
        this.moderatoren = moderatoren;
        return this;
    }

    /**
     * Protokollführer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("protokoll")
    public List<FunktionaerLevel2Model> getProtokoll() {
        return protokoll;
    }

    /**
     * Protokollführer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("protokoll")
    public void setProtokoll(List<FunktionaerLevel2Model> protokoll) {
        this.protokoll = protokoll;
    }

    public ErgebnisLevel2Model withProtokoll(List<FunktionaerLevel2Model> protokoll) {
        this.protokoll = protokoll;
        return this;
    }

    /**
     * Besondere Vorkommnisse
     * (Required)
     * 
     */
    @JsonProperty("vorkommnisse")
    public String getVorkommnisse() {
        return vorkommnisse;
    }

    /**
     * Besondere Vorkommnisse
     * (Required)
     * 
     */
    @JsonProperty("vorkommnisse")
    public void setVorkommnisse(String vorkommnisse) {
        this.vorkommnisse = vorkommnisse;
    }

    public ErgebnisLevel2Model withVorkommnisse(String vorkommnisse) {
        this.vorkommnisse = vorkommnisse;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)
     * (Required)
     * 
     */
    @JsonProperty("beginn")
    public ZonedDateTime getBeginn() {
        return beginn;
    }

    /**
     * ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)
     * (Required)
     * 
     */
    @JsonProperty("beginn")
    public void setBeginn(ZonedDateTime beginn) {
        this.beginn = beginn;
    }

    public ErgebnisLevel2Model withBeginn(ZonedDateTime beginn) {
        this.beginn = beginn;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)
     * (Required)
     * 
     */
    @JsonProperty("ende")
    public ZonedDateTime getEnde() {
        return ende;
    }

    /**
     * ISO8601 Datum/Zeit (ggf. auch ohne Zeitzonenangabe)
     * (Required)
     * 
     */
    @JsonProperty("ende")
    public void setEnde(ZonedDateTime ende) {
        this.ende = ende;
    }

    public ErgebnisLevel2Model withEnde(ZonedDateTime ende) {
        this.ende = ende;
        return this;
    }

    /**
     * Rundenablauf
     * (Required)
     * 
     */
    @JsonProperty("ablauf")
    public List<RundenablaufLevel2Model> getAblauf() {
        return ablauf;
    }

    /**
     * Rundenablauf
     * (Required)
     * 
     */
    @JsonProperty("ablauf")
    public void setAblauf(List<RundenablaufLevel2Model> ablauf) {
        this.ablauf = ablauf;
    }

    public ErgebnisLevel2Model withAblauf(List<RundenablaufLevel2Model> ablauf) {
        this.ablauf = ablauf;
        return this;
    }

    /**
     * ID des Turniers, mit dem das Turnier dieses Ergebnisses kombiniert wurde
     * (Required)
     * 
     */
    @JsonProperty("kombiniertMit")
    public Integer getKombiniertMit() {
        return kombiniertMit;
    }

    /**
     * ID des Turniers, mit dem das Turnier dieses Ergebnisses kombiniert wurde
     * (Required)
     * 
     */
    @JsonProperty("kombiniertMit")
    public void setKombiniertMit(Integer kombiniertMit) {
        this.kombiniertMit = kombiniertMit;
    }

    public ErgebnisLevel2Model withKombiniertMit(Integer kombiniertMit) {
        this.kombiniertMit = kombiniertMit;
        return this;
    }

    /**
     * Anzahl der Zuschauer
     * (Required)
     * 
     */
    @JsonProperty("zuschauer")
    public Integer getZuschauer() {
        return zuschauer;
    }

    /**
     * Anzahl der Zuschauer
     * (Required)
     * 
     */
    @JsonProperty("zuschauer")
    public void setZuschauer(Integer zuschauer) {
        this.zuschauer = zuschauer;
    }

    public ErgebnisLevel2Model withZuschauer(Integer zuschauer) {
        this.zuschauer = zuschauer;
        return this;
    }

    /**
     * Starter mit Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public List<ErgebnisStarterLevel2Model> getStarter() {
        return starter;
    }

    /**
     * Starter mit Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public void setStarter(List<ErgebnisStarterLevel2Model> starter) {
        this.starter = starter;
    }

    public ErgebnisLevel2Model withStarter(List<ErgebnisStarterLevel2Model> starter) {
        this.starter = starter;
        return this;
    }

    /**
     * Endrundentabellen dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("endrundentabellen")
    public List<List<List<List<EndrundentabellenModel>>>> getEndrundentabellen() {
        return endrundentabellen;
    }

    /**
     * Endrundentabellen dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("endrundentabellen")
    public void setEndrundentabellen(List<List<List<List<EndrundentabellenModel>>>> endrundentabellen) {
        this.endrundentabellen = endrundentabellen;
    }

    public ErgebnisLevel2Model withEndrundentabellen(List<List<List<List<EndrundentabellenModel>>>> endrundentabellen) {
        this.endrundentabellen = endrundentabellen;
        return this;
    }

    /**
     * Skatingtabellen dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("skatingtabellen")
    public List<SkatingTabelleModel> getSkatingtabellen() {
        return skatingtabellen;
    }

    /**
     * Skatingtabellen dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("skatingtabellen")
    public void setSkatingtabellen(List<SkatingTabelleModel> skatingtabellen) {
        this.skatingtabellen = skatingtabellen;
    }

    public ErgebnisLevel2Model withSkatingtabellen(List<SkatingTabelleModel> skatingtabellen) {
        this.skatingtabellen = skatingtabellen;
        return this;
    }

    /**
     * Finaltabellen der Stichrunden dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("stichrundentabellen")
    public List<List<List<List<EndrundentabellenModel>>>> getStichrundentabellen() {
        return stichrundentabellen;
    }

    /**
     * Finaltabellen der Stichrunden dieses Ergebnisses
     * (Required)
     * 
     */
    @JsonProperty("stichrundentabellen")
    public void setStichrundentabellen(List<List<List<List<EndrundentabellenModel>>>> stichrundentabellen) {
        this.stichrundentabellen = stichrundentabellen;
    }

    public ErgebnisLevel2Model withStichrundentabellen(List<List<List<List<EndrundentabellenModel>>>> stichrundentabellen) {
        this.stichrundentabellen = stichrundentabellen;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endergebnis", endergebnis).append("taenze", taenze).append("wr", wr).append("tl", tl).append("bs", bs).append("ch", ch).append("moderatoren", moderatoren).append("protokoll", protokoll).append("vorkommnisse", vorkommnisse).append("beginn", beginn).append("ende", ende).append("ablauf", ablauf).append("kombiniertMit", kombiniertMit).append("zuschauer", zuschauer).append("starter", starter).append("endrundentabellen", endrundentabellen).append("skatingtabellen", skatingtabellen).append("stichrundentabellen", stichrundentabellen).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kombiniertMit).append(moderatoren).append(starter).append(ch).append(ende).append(protokoll).append(endrundentabellen).append(vorkommnisse).append(bs).append(zuschauer).append(tl).append(stichrundentabellen).append(taenze).append(ablauf).append(wr).append(endergebnis).append(skatingtabellen).append(beginn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErgebnisLevel2Model) == false) {
            return false;
        }
        ErgebnisLevel2Model rhs = ((ErgebnisLevel2Model) other);
        return new EqualsBuilder().append(kombiniertMit, rhs.kombiniertMit).append(moderatoren, rhs.moderatoren).append(starter, rhs.starter).append(ch, rhs.ch).append(ende, rhs.ende).append(protokoll, rhs.protokoll).append(endrundentabellen, rhs.endrundentabellen).append(vorkommnisse, rhs.vorkommnisse).append(bs, rhs.bs).append(zuschauer, rhs.zuschauer).append(tl, rhs.tl).append(stichrundentabellen, rhs.stichrundentabellen).append(taenze, rhs.taenze).append(ablauf, rhs.ablauf).append(wr, rhs.wr).append(endergebnis, rhs.endergebnis).append(skatingtabellen, rhs.skatingtabellen).append(beginn, rhs.beginn).isEquals();
    }

}
