
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Startbuch eines Starters in einer Startliste (Level 1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
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
public class StartbuchLevel1Model implements Serializable
{

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
     * Startliga (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startliga")
    @JsonPropertyDescription("Startliga (inkl. null)")
    private StartligaTyp startliga;
    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startklasse")
    @JsonPropertyDescription("Startklasse (inkl. null)")
    private StartklasseTyp startklasse;
    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("naechsteStartklasse")
    @JsonPropertyDescription("Startklasse (inkl. null)")
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
    private final static long serialVersionUID = -8354308512625900467L;

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

    public StartbuchLevel1Model withTurnierart(TurnierartTyp turnierart) {
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

    public StartbuchLevel1Model withStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
        return this;
    }

    /**
     * Startliga (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startliga")
    public StartligaTyp getStartliga() {
        return startliga;
    }

    /**
     * Startliga (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("startliga")
    public void setStartliga(StartligaTyp startliga) {
        this.startliga = startliga;
    }

    public StartbuchLevel1Model withStartliga(StartligaTyp startliga) {
        this.startliga = startliga;
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

    public StartbuchLevel1Model withStartklasse(StartklasseTyp startklasse) {
        this.startklasse = startklasse;
        return this;
    }

    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("naechsteStartklasse")
    public StartklasseTyp getNaechsteStartklasse() {
        return naechsteStartklasse;
    }

    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("naechsteStartklasse")
    public void setNaechsteStartklasse(StartklasseTyp naechsteStartklasse) {
        this.naechsteStartklasse = naechsteStartklasse;
    }

    public StartbuchLevel1Model withNaechsteStartklasse(StartklasseTyp naechsteStartklasse) {
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

    public StartbuchLevel1Model withPunkte(IstZielModel punkte) {
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

    public StartbuchLevel1Model withPlatzierungen(IstZielModel platzierungen) {
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

    public StartbuchLevel1Model withRegeln(AufstiegsregelModel regeln) {
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

    public StartbuchLevel1Model withFlags(StartbuchFlagsModel flags) {
        this.flags = flags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("turnierart", turnierart).append("startgruppe", startgruppe).append("startliga", startliga).append("startklasse", startklasse).append("naechsteStartklasse", naechsteStartklasse).append("punkte", punkte).append("platzierungen", platzierungen).append("regeln", regeln).append("flags", flags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(punkte).append(platzierungen).append(naechsteStartklasse).append(startgruppe).append(startklasse).append(turnierart).append(flags).append(startliga).append(regeln).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartbuchLevel1Model) == false) {
            return false;
        }
        StartbuchLevel1Model rhs = ((StartbuchLevel1Model) other);
        return new EqualsBuilder().append(punkte, rhs.punkte).append(platzierungen, rhs.platzierungen).append(naechsteStartklasse, rhs.naechsteStartklasse).append(startgruppe, rhs.startgruppe).append(startklasse, rhs.startklasse).append(turnierart, rhs.turnierart).append(flags, rhs.flags).append(startliga, rhs.startliga).append(regeln, rhs.regeln).isEquals();
    }

}
