
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Ist- und Zielpunkte bzw. -platzierungen
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "ist",
    "ziel"
})
public class IstZielModel implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ist")
    private Integer ist;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ziel")
    private Integer ziel;
    private final static long serialVersionUID = 3595373516822295155L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ist")
    public Integer getIst() {
        return ist;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ist")
    public void setIst(Integer ist) {
        this.ist = ist;
    }

    public IstZielModel withIst(Integer ist) {
        this.ist = ist;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ziel")
    public Integer getZiel() {
        return ziel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ziel")
    public void setZiel(Integer ziel) {
        this.ziel = ziel;
    }

    public IstZielModel withZiel(Integer ziel) {
        this.ziel = ziel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ist", ist).append("ziel", ziel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ist).append(ziel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IstZielModel) == false) {
            return false;
        }
        IstZielModel rhs = ((IstZielModel) other);
        return new EqualsBuilder().append(ist, rhs.ist).append(ziel, rhs.ziel).isEquals();
    }

}
