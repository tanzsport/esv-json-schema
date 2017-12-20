
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.StartgruppeTyp;
import de.tanzsport.esv.api.v1.model.StartklasseTyp;
import de.tanzsport.esv.api.v1.model.StartligaTyp;
import de.tanzsport.esv.api.v1.model.TurnierartTyp;
import de.tanzsport.esv.api.v1.model.WettbewerbsartTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Startbuch eines Starters in einer Startliste (Level 2)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "wettbewerbsart",
    "turnierart",
    "startgruppe",
    "startliga",
    "startklasse",
    "naechsteStartklasse",
    "punkte",
    "platzierungen",
    "regeln",
    "flags"
})
public class StartbuchLevel2Model implements Serializable
{

    /**
     * Wettbewerbsart
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    @JsonPropertyDescription("Wettbewerbsart")
    private WettbewerbsartTyp wettbewerbsart;
    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    @JsonPropertyDescription("Turnierart")
    private TurnierartTyp turnierart;
    /**
     * Startgruppe
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    @JsonPropertyDescription("Startgruppe")
    private StartgruppeTyp startgruppe;
    /**
     * Startliga
     * (Required)
     * 
     */
    @JsonProperty("startliga")
    @JsonPropertyDescription("Startliga")
    private StartligaTyp startliga;
    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    @JsonPropertyDescription("Startklasse")
    private StartklasseTyp startklasse;
    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("naechsteStartklasse")
    @JsonPropertyDescription("Startklasse")
    private StartklasseTyp naechsteStartklasse;
    /**
     * Ist- und Zielpunkte bzw. -platzierungen
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    @JsonPropertyDescription("Ist- und Zielpunkte bzw. -platzierungen")
    private IstZielModel punkte;
    /**
     * Ist- und Zielpunkte bzw. -platzierungen
     * (Required)
     * 
     */
    @JsonProperty("platzierungen")
    @JsonPropertyDescription("Ist- und Zielpunkte bzw. -platzierungen")
    private IstZielModel platzierungen;
    /**
     * Aufstiegsregeln für Einzelwettbewerbe Std/Lat, später ggf. JMD
     * (Required)
     * 
     */
    @JsonProperty("regeln")
    @JsonPropertyDescription("Aufstiegsregeln f\u00fcr Einzelwettbewerbe Std/Lat, sp\u00e4ter ggf. JMD")
    private AufstiegsregelModel regeln;
    /**
     * Flags für Startbücher
     * (Required)
     * 
     */
    @JsonProperty("flags")
    @JsonPropertyDescription("Flags f\u00fcr Startb\u00fccher")
    private StartbuchFlagsModel flags;
    private final static long serialVersionUID = -2540988664544819387L;

    /**
     * Wettbewerbsart
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    public WettbewerbsartTyp getWettbewerbsart() {
        return wettbewerbsart;
    }

    /**
     * Wettbewerbsart
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    public void setWettbewerbsart(WettbewerbsartTyp wettbewerbsart) {
        this.wettbewerbsart = wettbewerbsart;
    }

    public StartbuchLevel2Model withWettbewerbsart(WettbewerbsartTyp wettbewerbsart) {
        this.wettbewerbsart = wettbewerbsart;
        return this;
    }

    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    public TurnierartTyp getTurnierart() {
        return turnierart;
    }

    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    public void setTurnierart(TurnierartTyp turnierart) {
        this.turnierart = turnierart;
    }

    public StartbuchLevel2Model withTurnierart(TurnierartTyp turnierart) {
        this.turnierart = turnierart;
        return this;
    }

    /**
     * Startgruppe
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    public StartgruppeTyp getStartgruppe() {
        return startgruppe;
    }

    /**
     * Startgruppe
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    public void setStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
    }

    public StartbuchLevel2Model withStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
        return this;
    }

    /**
     * Startliga
     * (Required)
     * 
     */
    @JsonProperty("startliga")
    public StartligaTyp getStartliga() {
        return startliga;
    }

    /**
     * Startliga
     * (Required)
     * 
     */
    @JsonProperty("startliga")
    public void setStartliga(StartligaTyp startliga) {
        this.startliga = startliga;
    }

    public StartbuchLevel2Model withStartliga(StartligaTyp startliga) {
        this.startliga = startliga;
        return this;
    }

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    public StartklasseTyp getStartklasse() {
        return startklasse;
    }

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    public void setStartklasse(StartklasseTyp startklasse) {
        this.startklasse = startklasse;
    }

    public StartbuchLevel2Model withStartklasse(StartklasseTyp startklasse) {
        this.startklasse = startklasse;
        return this;
    }

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("naechsteStartklasse")
    public StartklasseTyp getNaechsteStartklasse() {
        return naechsteStartklasse;
    }

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("naechsteStartklasse")
    public void setNaechsteStartklasse(StartklasseTyp naechsteStartklasse) {
        this.naechsteStartklasse = naechsteStartklasse;
    }

    public StartbuchLevel2Model withNaechsteStartklasse(StartklasseTyp naechsteStartklasse) {
        this.naechsteStartklasse = naechsteStartklasse;
        return this;
    }

    /**
     * Ist- und Zielpunkte bzw. -platzierungen
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public IstZielModel getPunkte() {
        return punkte;
    }

    /**
     * Ist- und Zielpunkte bzw. -platzierungen
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public void setPunkte(IstZielModel punkte) {
        this.punkte = punkte;
    }

    public StartbuchLevel2Model withPunkte(IstZielModel punkte) {
        this.punkte = punkte;
        return this;
    }

    /**
     * Ist- und Zielpunkte bzw. -platzierungen
     * (Required)
     * 
     */
    @JsonProperty("platzierungen")
    public IstZielModel getPlatzierungen() {
        return platzierungen;
    }

    /**
     * Ist- und Zielpunkte bzw. -platzierungen
     * (Required)
     * 
     */
    @JsonProperty("platzierungen")
    public void setPlatzierungen(IstZielModel platzierungen) {
        this.platzierungen = platzierungen;
    }

    public StartbuchLevel2Model withPlatzierungen(IstZielModel platzierungen) {
        this.platzierungen = platzierungen;
        return this;
    }

    /**
     * Aufstiegsregeln für Einzelwettbewerbe Std/Lat, später ggf. JMD
     * (Required)
     * 
     */
    @JsonProperty("regeln")
    public AufstiegsregelModel getRegeln() {
        return regeln;
    }

    /**
     * Aufstiegsregeln für Einzelwettbewerbe Std/Lat, später ggf. JMD
     * (Required)
     * 
     */
    @JsonProperty("regeln")
    public void setRegeln(AufstiegsregelModel regeln) {
        this.regeln = regeln;
    }

    public StartbuchLevel2Model withRegeln(AufstiegsregelModel regeln) {
        this.regeln = regeln;
        return this;
    }

    /**
     * Flags für Startbücher
     * (Required)
     * 
     */
    @JsonProperty("flags")
    public StartbuchFlagsModel getFlags() {
        return flags;
    }

    /**
     * Flags für Startbücher
     * (Required)
     * 
     */
    @JsonProperty("flags")
    public void setFlags(StartbuchFlagsModel flags) {
        this.flags = flags;
    }

    public StartbuchLevel2Model withFlags(StartbuchFlagsModel flags) {
        this.flags = flags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("wettbewerbsart", wettbewerbsart).append("turnierart", turnierart).append("startgruppe", startgruppe).append("startliga", startliga).append("startklasse", startklasse).append("naechsteStartklasse", naechsteStartklasse).append("punkte", punkte).append("platzierungen", platzierungen).append("regeln", regeln).append("flags", flags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(punkte).append(platzierungen).append(wettbewerbsart).append(naechsteStartklasse).append(startgruppe).append(startklasse).append(turnierart).append(flags).append(startliga).append(regeln).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartbuchLevel2Model) == false) {
            return false;
        }
        StartbuchLevel2Model rhs = ((StartbuchLevel2Model) other);
        return new EqualsBuilder().append(punkte, rhs.punkte).append(platzierungen, rhs.platzierungen).append(wettbewerbsart, rhs.wettbewerbsart).append(naechsteStartklasse, rhs.naechsteStartklasse).append(startgruppe, rhs.startgruppe).append(startklasse, rhs.startklasse).append(turnierart, rhs.turnierart).append(flags, rhs.flags).append(startliga, rhs.startliga).append(regeln, rhs.regeln).isEquals();
    }

}
