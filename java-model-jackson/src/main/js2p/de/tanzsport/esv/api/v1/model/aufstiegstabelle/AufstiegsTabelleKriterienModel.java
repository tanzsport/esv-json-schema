
package de.tanzsport.esv.api.v1.model.aufstiegstabelle;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.StartklasseTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Kriterien in einem Eintrag einer Aufstiegstabelle
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "klasse",
    "zielklasse",
    "punkte",
    "plaetze",
    "bisPlatz",
    "doppelstart"
})
public class AufstiegsTabelleKriterienModel implements Serializable
{

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("klasse")
    @JsonPropertyDescription("Startklasse")
    private StartklasseTyp klasse;
    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("zielklasse")
    @JsonPropertyDescription("Startklasse (inkl. null)")
    private StartklasseTyp zielklasse;
    /**
     * Erforderliche Punkte für Aufstieg
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    @JsonPropertyDescription("Erforderliche Punkte f\u00fcr Aufstieg")
    private Integer punkte;
    /**
     * Erforderliche Platzierungen für Aufstieg
     * (Required)
     * 
     */
    @JsonProperty("plaetze")
    @JsonPropertyDescription("Erforderliche Platzierungen f\u00fcr Aufstieg")
    private Integer plaetze;
    /**
     * Platzierung bis Platz
     * (Required)
     * 
     */
    @JsonProperty("bisPlatz")
    @JsonPropertyDescription("Platzierung bis Platz")
    private Integer bisPlatz;
    /**
     * Kennzeichnet Aufstiege in Startklasse, die nur im Doppelstart genutzt werden können
     * (Required)
     * 
     */
    @JsonProperty("doppelstart")
    @JsonPropertyDescription("Kennzeichnet Aufstiege in Startklasse, die nur im Doppelstart genutzt werden k\u00f6nnen")
    private Boolean doppelstart;
    private final static long serialVersionUID = -8723566065423880660L;

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("klasse")
    public StartklasseTyp getKlasse() {
        return klasse;
    }

    /**
     * Startklasse
     * (Required)
     * 
     */
    @JsonProperty("klasse")
    public void setKlasse(StartklasseTyp klasse) {
        this.klasse = klasse;
    }

    public AufstiegsTabelleKriterienModel withKlasse(StartklasseTyp klasse) {
        this.klasse = klasse;
        return this;
    }

    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("zielklasse")
    public StartklasseTyp getZielklasse() {
        return zielklasse;
    }

    /**
     * Startklasse (inkl. null)
     * (Required)
     * 
     */
    @JsonProperty("zielklasse")
    public void setZielklasse(StartklasseTyp zielklasse) {
        this.zielklasse = zielklasse;
    }

    public AufstiegsTabelleKriterienModel withZielklasse(StartklasseTyp zielklasse) {
        this.zielklasse = zielklasse;
        return this;
    }

    /**
     * Erforderliche Punkte für Aufstieg
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public Integer getPunkte() {
        return punkte;
    }

    /**
     * Erforderliche Punkte für Aufstieg
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public void setPunkte(Integer punkte) {
        this.punkte = punkte;
    }

    public AufstiegsTabelleKriterienModel withPunkte(Integer punkte) {
        this.punkte = punkte;
        return this;
    }

    /**
     * Erforderliche Platzierungen für Aufstieg
     * (Required)
     * 
     */
    @JsonProperty("plaetze")
    public Integer getPlaetze() {
        return plaetze;
    }

    /**
     * Erforderliche Platzierungen für Aufstieg
     * (Required)
     * 
     */
    @JsonProperty("plaetze")
    public void setPlaetze(Integer plaetze) {
        this.plaetze = plaetze;
    }

    public AufstiegsTabelleKriterienModel withPlaetze(Integer plaetze) {
        this.plaetze = plaetze;
        return this;
    }

    /**
     * Platzierung bis Platz
     * (Required)
     * 
     */
    @JsonProperty("bisPlatz")
    public Integer getBisPlatz() {
        return bisPlatz;
    }

    /**
     * Platzierung bis Platz
     * (Required)
     * 
     */
    @JsonProperty("bisPlatz")
    public void setBisPlatz(Integer bisPlatz) {
        this.bisPlatz = bisPlatz;
    }

    public AufstiegsTabelleKriterienModel withBisPlatz(Integer bisPlatz) {
        this.bisPlatz = bisPlatz;
        return this;
    }

    /**
     * Kennzeichnet Aufstiege in Startklasse, die nur im Doppelstart genutzt werden können
     * (Required)
     * 
     */
    @JsonProperty("doppelstart")
    public Boolean getDoppelstart() {
        return doppelstart;
    }

    /**
     * Kennzeichnet Aufstiege in Startklasse, die nur im Doppelstart genutzt werden können
     * (Required)
     * 
     */
    @JsonProperty("doppelstart")
    public void setDoppelstart(Boolean doppelstart) {
        this.doppelstart = doppelstart;
    }

    public AufstiegsTabelleKriterienModel withDoppelstart(Boolean doppelstart) {
        this.doppelstart = doppelstart;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("klasse", klasse).append("zielklasse", zielklasse).append("punkte", punkte).append("plaetze", plaetze).append("bisPlatz", bisPlatz).append("doppelstart", doppelstart).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(punkte).append(klasse).append(zielklasse).append(plaetze).append(bisPlatz).append(doppelstart).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AufstiegsTabelleKriterienModel) == false) {
            return false;
        }
        AufstiegsTabelleKriterienModel rhs = ((AufstiegsTabelleKriterienModel) other);
        return new EqualsBuilder().append(punkte, rhs.punkte).append(klasse, rhs.klasse).append(zielklasse, rhs.zielklasse).append(plaetze, rhs.plaetze).append(bisPlatz, rhs.bisPlatz).append(doppelstart, rhs.doppelstart).isEquals();
    }

}
