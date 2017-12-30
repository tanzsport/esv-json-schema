
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


/**
 * Ergebnis (Level 1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "taenze",
    "wr",
    "tl",
    "bs",
    "ch",
    "vorkommnisse",
    "beginn",
    "ende",
    "ablauf",
    "kombiniertMit",
    "zuschauer",
    "starter",
    "endrundentabellen",
    "skatingtabellen"
})
public class ErgebnisLevel1Model implements Serializable
{

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
    private List<FunktionaerLevel1Model> wr = new ArrayList<FunktionaerLevel1Model>();
    /**
     * Turnierleiter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("tl")
    @JsonPropertyDescription("Turnierleiter des Turniers")
    private List<FunktionaerLevel1Model> tl = new ArrayList<FunktionaerLevel1Model>();
    /**
     * Beisitzer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("bs")
    @JsonPropertyDescription("Beisitzer des Turniers")
    private List<FunktionaerLevel1Model> bs = new ArrayList<FunktionaerLevel1Model>();
    /**
     * Chairpersonen des Turniers
     * (Required)
     * 
     */
    @JsonProperty("ch")
    @JsonPropertyDescription("Chairpersonen des Turniers")
    private List<FunktionaerLevel1Model> ch = new ArrayList<FunktionaerLevel1Model>();
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
    private List<RundenablaufLevel1Model> ablauf = new ArrayList<RundenablaufLevel1Model>();
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
    private List<ErgebnisStarterLevel1Model> starter = new ArrayList<ErgebnisStarterLevel1Model>();
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
    private final static long serialVersionUID = -6447646219328832442L;

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

    public ErgebnisLevel1Model withTaenze(List<TanzTyp> taenze) {
        this.taenze = taenze;
        return this;
    }

    /**
     * Wertungsrichter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("wr")
    public List<FunktionaerLevel1Model> getWr() {
        return wr;
    }

    /**
     * Wertungsrichter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("wr")
    public void setWr(List<FunktionaerLevel1Model> wr) {
        this.wr = wr;
    }

    public ErgebnisLevel1Model withWr(List<FunktionaerLevel1Model> wr) {
        this.wr = wr;
        return this;
    }

    /**
     * Turnierleiter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("tl")
    public List<FunktionaerLevel1Model> getTl() {
        return tl;
    }

    /**
     * Turnierleiter des Turniers
     * (Required)
     * 
     */
    @JsonProperty("tl")
    public void setTl(List<FunktionaerLevel1Model> tl) {
        this.tl = tl;
    }

    public ErgebnisLevel1Model withTl(List<FunktionaerLevel1Model> tl) {
        this.tl = tl;
        return this;
    }

    /**
     * Beisitzer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("bs")
    public List<FunktionaerLevel1Model> getBs() {
        return bs;
    }

    /**
     * Beisitzer des Turniers
     * (Required)
     * 
     */
    @JsonProperty("bs")
    public void setBs(List<FunktionaerLevel1Model> bs) {
        this.bs = bs;
    }

    public ErgebnisLevel1Model withBs(List<FunktionaerLevel1Model> bs) {
        this.bs = bs;
        return this;
    }

    /**
     * Chairpersonen des Turniers
     * (Required)
     * 
     */
    @JsonProperty("ch")
    public List<FunktionaerLevel1Model> getCh() {
        return ch;
    }

    /**
     * Chairpersonen des Turniers
     * (Required)
     * 
     */
    @JsonProperty("ch")
    public void setCh(List<FunktionaerLevel1Model> ch) {
        this.ch = ch;
    }

    public ErgebnisLevel1Model withCh(List<FunktionaerLevel1Model> ch) {
        this.ch = ch;
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

    public ErgebnisLevel1Model withVorkommnisse(String vorkommnisse) {
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

    public ErgebnisLevel1Model withBeginn(ZonedDateTime beginn) {
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

    public ErgebnisLevel1Model withEnde(ZonedDateTime ende) {
        this.ende = ende;
        return this;
    }

    /**
     * Rundenablauf
     * (Required)
     * 
     */
    @JsonProperty("ablauf")
    public List<RundenablaufLevel1Model> getAblauf() {
        return ablauf;
    }

    /**
     * Rundenablauf
     * (Required)
     * 
     */
    @JsonProperty("ablauf")
    public void setAblauf(List<RundenablaufLevel1Model> ablauf) {
        this.ablauf = ablauf;
    }

    public ErgebnisLevel1Model withAblauf(List<RundenablaufLevel1Model> ablauf) {
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

    public ErgebnisLevel1Model withKombiniertMit(Integer kombiniertMit) {
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

    public ErgebnisLevel1Model withZuschauer(Integer zuschauer) {
        this.zuschauer = zuschauer;
        return this;
    }

    /**
     * Starter mit Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public List<ErgebnisStarterLevel1Model> getStarter() {
        return starter;
    }

    /**
     * Starter mit Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public void setStarter(List<ErgebnisStarterLevel1Model> starter) {
        this.starter = starter;
    }

    public ErgebnisLevel1Model withStarter(List<ErgebnisStarterLevel1Model> starter) {
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

    public ErgebnisLevel1Model withEndrundentabellen(List<List<List<List<EndrundentabellenModel>>>> endrundentabellen) {
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

    public ErgebnisLevel1Model withSkatingtabellen(List<SkatingTabelleModel> skatingtabellen) {
        this.skatingtabellen = skatingtabellen;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("taenze", taenze).append("wr", wr).append("tl", tl).append("bs", bs).append("ch", ch).append("vorkommnisse", vorkommnisse).append("beginn", beginn).append("ende", ende).append("ablauf", ablauf).append("kombiniertMit", kombiniertMit).append("zuschauer", zuschauer).append("starter", starter).append("endrundentabellen", endrundentabellen).append("skatingtabellen", skatingtabellen).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kombiniertMit).append(starter).append(ch).append(ende).append(endrundentabellen).append(vorkommnisse).append(bs).append(zuschauer).append(tl).append(taenze).append(ablauf).append(wr).append(skatingtabellen).append(beginn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErgebnisLevel1Model) == false) {
            return false;
        }
        ErgebnisLevel1Model rhs = ((ErgebnisLevel1Model) other);
        return new EqualsBuilder().append(kombiniertMit, rhs.kombiniertMit).append(starter, rhs.starter).append(ch, rhs.ch).append(ende, rhs.ende).append(endrundentabellen, rhs.endrundentabellen).append(vorkommnisse, rhs.vorkommnisse).append(bs, rhs.bs).append(zuschauer, rhs.zuschauer).append(tl, rhs.tl).append(taenze, rhs.taenze).append(ablauf, rhs.ablauf).append(wr, rhs.wr).append(skatingtabellen, rhs.skatingtabellen).append(beginn, rhs.beginn).isEquals();
    }

}
