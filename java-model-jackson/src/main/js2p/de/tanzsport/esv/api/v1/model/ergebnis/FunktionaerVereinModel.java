
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.LtvTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Verein eines Funktionärs im Ergebnis
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "name",
    "ltv"
})
public class FunktionaerVereinModel implements Serializable
{

    /**
     * Name des Vereins
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name des Vereins")
    private String name;
    /**
     * Schlüssel für Landesverbände (mit null)
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    @JsonPropertyDescription("Schl\u00fcssel f\u00fcr Landesverb\u00e4nde (mit null)")
    private LtvTyp ltv;
    private final static long serialVersionUID = -4630137760023523755L;

    /**
     * Name des Vereins
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name des Vereins
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FunktionaerVereinModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Schlüssel für Landesverbände (mit null)
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    public LtvTyp getLtv() {
        return ltv;
    }

    /**
     * Schlüssel für Landesverbände (mit null)
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    public void setLtv(LtvTyp ltv) {
        this.ltv = ltv;
    }

    public FunktionaerVereinModel withLtv(LtvTyp ltv) {
        this.ltv = ltv;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("ltv", ltv).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(ltv).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunktionaerVereinModel) == false) {
            return false;
        }
        FunktionaerVereinModel rhs = ((FunktionaerVereinModel) other);
        return new EqualsBuilder().append(name, rhs.name).append(ltv, rhs.ltv).isEquals();
    }

}
