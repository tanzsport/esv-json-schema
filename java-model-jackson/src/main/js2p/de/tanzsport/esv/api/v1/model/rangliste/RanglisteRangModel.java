
package de.tanzsport.esv.api.v1.model.rangliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Rang eines Starters in der Rangliste
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "rl",
    "dm"
})
public class RanglisteRangModel implements Serializable
{

    /**
     * Platz in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("rl")
    @JsonPropertyDescription("Platz in der Rangliste")
    private Integer rl;
    /**
     * Platz der vorhergehenden DM (sofern vorhanden)
     * (Required)
     * 
     */
    @JsonProperty("dm")
    @JsonPropertyDescription("Platz der vorhergehenden DM (sofern vorhanden)")
    private Integer dm;
    private final static long serialVersionUID = -6021187021833212602L;

    /**
     * Platz in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("rl")
    public Integer getRl() {
        return rl;
    }

    /**
     * Platz in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("rl")
    public void setRl(Integer rl) {
        this.rl = rl;
    }

    public RanglisteRangModel withRl(Integer rl) {
        this.rl = rl;
        return this;
    }

    /**
     * Platz der vorhergehenden DM (sofern vorhanden)
     * (Required)
     * 
     */
    @JsonProperty("dm")
    public Integer getDm() {
        return dm;
    }

    /**
     * Platz der vorhergehenden DM (sofern vorhanden)
     * (Required)
     * 
     */
    @JsonProperty("dm")
    public void setDm(Integer dm) {
        this.dm = dm;
    }

    public RanglisteRangModel withDm(Integer dm) {
        this.dm = dm;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rl", rl).append("dm", dm).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dm).append(rl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RanglisteRangModel) == false) {
            return false;
        }
        RanglisteRangModel rhs = ((RanglisteRangModel) other);
        return new EqualsBuilder().append(dm, rhs.dm).append(rl, rhs.rl).isEquals();
    }

}
