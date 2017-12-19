
package de.tanzsport.esv.api.v1.model.aufstiegstabelle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.LtvTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Aufstiegstabelle
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "ltv",
    "minPunkte",
    "tabellen"
})
public class AufstiegsTabelleModel implements Serializable
{

    /**
     * Landesverbände, für die Tabelle gilt
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    @JsonPropertyDescription("Landesverb\u00e4nde, f\u00fcr die Tabelle gilt")
    private List<LtvTyp> ltv = new ArrayList<LtvTyp>();
    /**
     * Mindestpunkte, die zum Erreichen einer Platzierung erforderlich sind
     * (Required)
     * 
     */
    @JsonProperty("minPunkte")
    @JsonPropertyDescription("Mindestpunkte, die zum Erreichen einer Platzierung erforderlich sind")
    private Integer minPunkte;
    /**
     * Tabellen für Aufstiegspunkte und Platzierungen
     * (Required)
     * 
     */
    @JsonProperty("tabellen")
    @JsonPropertyDescription("Tabellen f\u00fcr Aufstiegspunkte und Platzierungen")
    private List<AufstiegstabelleEintragModel> tabellen = new ArrayList<AufstiegstabelleEintragModel>();
    private final static long serialVersionUID = -6125729678744602145L;

    /**
     * Landesverbände, für die Tabelle gilt
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    public List<LtvTyp> getLtv() {
        return ltv;
    }

    /**
     * Landesverbände, für die Tabelle gilt
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    public void setLtv(List<LtvTyp> ltv) {
        this.ltv = ltv;
    }

    public AufstiegsTabelleModel withLtv(List<LtvTyp> ltv) {
        this.ltv = ltv;
        return this;
    }

    /**
     * Mindestpunkte, die zum Erreichen einer Platzierung erforderlich sind
     * (Required)
     * 
     */
    @JsonProperty("minPunkte")
    public Integer getMinPunkte() {
        return minPunkte;
    }

    /**
     * Mindestpunkte, die zum Erreichen einer Platzierung erforderlich sind
     * (Required)
     * 
     */
    @JsonProperty("minPunkte")
    public void setMinPunkte(Integer minPunkte) {
        this.minPunkte = minPunkte;
    }

    public AufstiegsTabelleModel withMinPunkte(Integer minPunkte) {
        this.minPunkte = minPunkte;
        return this;
    }

    /**
     * Tabellen für Aufstiegspunkte und Platzierungen
     * (Required)
     * 
     */
    @JsonProperty("tabellen")
    public List<AufstiegstabelleEintragModel> getTabellen() {
        return tabellen;
    }

    /**
     * Tabellen für Aufstiegspunkte und Platzierungen
     * (Required)
     * 
     */
    @JsonProperty("tabellen")
    public void setTabellen(List<AufstiegstabelleEintragModel> tabellen) {
        this.tabellen = tabellen;
    }

    public AufstiegsTabelleModel withTabellen(List<AufstiegstabelleEintragModel> tabellen) {
        this.tabellen = tabellen;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ltv", ltv).append("minPunkte", minPunkte).append("tabellen", tabellen).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tabellen).append(minPunkte).append(ltv).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AufstiegsTabelleModel) == false) {
            return false;
        }
        AufstiegsTabelleModel rhs = ((AufstiegsTabelleModel) other);
        return new EqualsBuilder().append(tabellen, rhs.tabellen).append(minPunkte, rhs.minPunkte).append(ltv, rhs.ltv).isEquals();
    }

}
