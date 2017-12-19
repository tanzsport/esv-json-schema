
package de.tanzsport.esv.api.v1.model.aufstiegstabelle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.StartgruppeTyp;
import de.tanzsport.esv.api.v1.model.TurnierartTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Eintrag in der Aufstiegstabelle
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "startgruppen",
    "turnierart",
    "kriterien"
})
public class AufstiegstabelleEintragModel implements Serializable
{

    /**
     * Startgruppen für diesen Eintrag
     * (Required)
     * 
     */
    @JsonProperty("startgruppen")
    @JsonPropertyDescription("Startgruppen f\u00fcr diesen Eintrag")
    private List<StartgruppeTyp> startgruppen = new ArrayList<StartgruppeTyp>();
    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    @JsonPropertyDescription("Turnierart")
    private TurnierartTyp turnierart;
    /**
     * Aufstiegskriterien für diesen Eintrag
     * (Required)
     * 
     */
    @JsonProperty("kriterien")
    @JsonPropertyDescription("Aufstiegskriterien f\u00fcr diesen Eintrag")
    private List<AufstiegsTabelleKriterienModel> kriterien = new ArrayList<AufstiegsTabelleKriterienModel>();
    private final static long serialVersionUID = 4756164607564454514L;

    /**
     * Startgruppen für diesen Eintrag
     * (Required)
     * 
     */
    @JsonProperty("startgruppen")
    public List<StartgruppeTyp> getStartgruppen() {
        return startgruppen;
    }

    /**
     * Startgruppen für diesen Eintrag
     * (Required)
     * 
     */
    @JsonProperty("startgruppen")
    public void setStartgruppen(List<StartgruppeTyp> startgruppen) {
        this.startgruppen = startgruppen;
    }

    public AufstiegstabelleEintragModel withStartgruppen(List<StartgruppeTyp> startgruppen) {
        this.startgruppen = startgruppen;
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

    public AufstiegstabelleEintragModel withTurnierart(TurnierartTyp turnierart) {
        this.turnierart = turnierart;
        return this;
    }

    /**
     * Aufstiegskriterien für diesen Eintrag
     * (Required)
     * 
     */
    @JsonProperty("kriterien")
    public List<AufstiegsTabelleKriterienModel> getKriterien() {
        return kriterien;
    }

    /**
     * Aufstiegskriterien für diesen Eintrag
     * (Required)
     * 
     */
    @JsonProperty("kriterien")
    public void setKriterien(List<AufstiegsTabelleKriterienModel> kriterien) {
        this.kriterien = kriterien;
    }

    public AufstiegstabelleEintragModel withKriterien(List<AufstiegsTabelleKriterienModel> kriterien) {
        this.kriterien = kriterien;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("startgruppen", startgruppen).append("turnierart", turnierart).append("kriterien", kriterien).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(turnierart).append(startgruppen).append(kriterien).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AufstiegstabelleEintragModel) == false) {
            return false;
        }
        AufstiegstabelleEintragModel rhs = ((AufstiegstabelleEintragModel) other);
        return new EqualsBuilder().append(turnierart, rhs.turnierart).append(startgruppen, rhs.startgruppen).append(kriterien, rhs.kriterien).isEquals();
    }

}
