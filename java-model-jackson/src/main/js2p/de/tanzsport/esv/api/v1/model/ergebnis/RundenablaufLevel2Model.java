
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.RundenTyp;
import de.tanzsport.esv.api.v1.model.RundenWertungsTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Eintrag im Rundenablauf eines Ergebnisses (Level 2)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "runde",
    "typ",
    "platz",
    "startreihenfolge",
    "kreuzvorgabe"
})
public class RundenablaufLevel2Model implements Serializable
{

    /**
     * Rundentyp in einem Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("runde")
    @JsonPropertyDescription("Rundentyp in einem Ergebnis")
    private RundenTyp runde;
    /**
     * Wertungstyp in einer Runde
     * (Required)
     * 
     */
    @JsonProperty("typ")
    @JsonPropertyDescription("Wertungstyp in einer Runde")
    private RundenWertungsTyp typ;
    /**
     * Platz für den eine Stichrunde durchgeführt wurde
     * (Required)
     * 
     */
    @JsonProperty("platz")
    @JsonPropertyDescription("Platz f\u00fcr den eine Stichrunde durchgef\u00fchrt wurde")
    private Integer platz;
    /**
     * Startnummern der Starter in der Reihenfolge des Starts in der Runde
     * (Required)
     * 
     */
    @JsonProperty("startreihenfolge")
    @JsonPropertyDescription("Startnummern der Starter in der Reihenfolge des Starts in der Runde")
    private List<Integer> startreihenfolge = new ArrayList<Integer>();
    /**
     * Kreuzvorgabe in einem Ergebnis
     * 
     */
    @JsonProperty("kreuzvorgabe")
    @JsonPropertyDescription("Kreuzvorgabe in einem Ergebnis")
    private KreuzvorgabeModel kreuzvorgabe;
    private final static long serialVersionUID = 648766804045765271L;

    /**
     * Rundentyp in einem Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("runde")
    public RundenTyp getRunde() {
        return runde;
    }

    /**
     * Rundentyp in einem Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("runde")
    public void setRunde(RundenTyp runde) {
        this.runde = runde;
    }

    public RundenablaufLevel2Model withRunde(RundenTyp runde) {
        this.runde = runde;
        return this;
    }

    /**
     * Wertungstyp in einer Runde
     * (Required)
     * 
     */
    @JsonProperty("typ")
    public RundenWertungsTyp getTyp() {
        return typ;
    }

    /**
     * Wertungstyp in einer Runde
     * (Required)
     * 
     */
    @JsonProperty("typ")
    public void setTyp(RundenWertungsTyp typ) {
        this.typ = typ;
    }

    public RundenablaufLevel2Model withTyp(RundenWertungsTyp typ) {
        this.typ = typ;
        return this;
    }

    /**
     * Platz für den eine Stichrunde durchgeführt wurde
     * (Required)
     * 
     */
    @JsonProperty("platz")
    public Integer getPlatz() {
        return platz;
    }

    /**
     * Platz für den eine Stichrunde durchgeführt wurde
     * (Required)
     * 
     */
    @JsonProperty("platz")
    public void setPlatz(Integer platz) {
        this.platz = platz;
    }

    public RundenablaufLevel2Model withPlatz(Integer platz) {
        this.platz = platz;
        return this;
    }

    /**
     * Startnummern der Starter in der Reihenfolge des Starts in der Runde
     * (Required)
     * 
     */
    @JsonProperty("startreihenfolge")
    public List<Integer> getStartreihenfolge() {
        return startreihenfolge;
    }

    /**
     * Startnummern der Starter in der Reihenfolge des Starts in der Runde
     * (Required)
     * 
     */
    @JsonProperty("startreihenfolge")
    public void setStartreihenfolge(List<Integer> startreihenfolge) {
        this.startreihenfolge = startreihenfolge;
    }

    public RundenablaufLevel2Model withStartreihenfolge(List<Integer> startreihenfolge) {
        this.startreihenfolge = startreihenfolge;
        return this;
    }

    /**
     * Kreuzvorgabe in einem Ergebnis
     * 
     */
    @JsonProperty("kreuzvorgabe")
    public KreuzvorgabeModel getKreuzvorgabe() {
        return kreuzvorgabe;
    }

    /**
     * Kreuzvorgabe in einem Ergebnis
     * 
     */
    @JsonProperty("kreuzvorgabe")
    public void setKreuzvorgabe(KreuzvorgabeModel kreuzvorgabe) {
        this.kreuzvorgabe = kreuzvorgabe;
    }

    public RundenablaufLevel2Model withKreuzvorgabe(KreuzvorgabeModel kreuzvorgabe) {
        this.kreuzvorgabe = kreuzvorgabe;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("runde", runde).append("typ", typ).append("platz", platz).append("startreihenfolge", startreihenfolge).append("kreuzvorgabe", kreuzvorgabe).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startreihenfolge).append(runde).append(typ).append(kreuzvorgabe).append(platz).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RundenablaufLevel2Model) == false) {
            return false;
        }
        RundenablaufLevel2Model rhs = ((RundenablaufLevel2Model) other);
        return new EqualsBuilder().append(startreihenfolge, rhs.startreihenfolge).append(runde, rhs.runde).append(typ, rhs.typ).append(kreuzvorgabe, rhs.kreuzvorgabe).append(platz, rhs.platz).isEquals();
    }

}
