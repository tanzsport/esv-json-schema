
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Regeln für die Aufstellungen bei Formations- und Gruppenwettbewerben
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "min",
    "max",
    "ausland"
})
public class AufstellungLevel2Model implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("min")
    private Integer min;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("max")
    private Integer max;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ausland")
    private Integer ausland;
    private final static long serialVersionUID = -8361304274905471054L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    public AufstellungLevel2Model withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("max")
    public Integer getMax() {
        return max;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("max")
    public void setMax(Integer max) {
        this.max = max;
    }

    public AufstellungLevel2Model withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ausland")
    public Integer getAusland() {
        return ausland;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ausland")
    public void setAusland(Integer ausland) {
        this.ausland = ausland;
    }

    public AufstellungLevel2Model withAusland(Integer ausland) {
        this.ausland = ausland;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("min", min).append("max", max).append("ausland", ausland).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ausland).append(min).append(max).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AufstellungLevel2Model) == false) {
            return false;
        }
        AufstellungLevel2Model rhs = ((AufstellungLevel2Model) other);
        return new EqualsBuilder().append(ausland, rhs.ausland).append(min, rhs.min).append(max, rhs.max).isEquals();
    }

}
