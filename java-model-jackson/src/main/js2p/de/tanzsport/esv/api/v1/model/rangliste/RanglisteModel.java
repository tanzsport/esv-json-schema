
package de.tanzsport.esv.api.v1.model.rangliste;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.RanglistenId;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Rangliste
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "stand",
    "starter"
})
public class RanglisteModel implements Serializable
{

    /**
     * Ranglisten-ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Ranglisten-ID")
    private RanglistenId id;
    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("stand")
    @JsonPropertyDescription("ISO8601 Datum/Zeit")
    private ZonedDateTime stand;
    /**
     * Starter in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("starter")
    @JsonPropertyDescription("Starter in der Rangliste")
    private List<RanglisteStarterModel> starter = new ArrayList<RanglisteStarterModel>();
    private final static long serialVersionUID = 926068993716714401L;

    /**
     * Ranglisten-ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public RanglistenId getId() {
        return id;
    }

    /**
     * Ranglisten-ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(RanglistenId id) {
        this.id = id;
    }

    public RanglisteModel withId(RanglistenId id) {
        this.id = id;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("stand")
    public ZonedDateTime getStand() {
        return stand;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("stand")
    public void setStand(ZonedDateTime stand) {
        this.stand = stand;
    }

    public RanglisteModel withStand(ZonedDateTime stand) {
        this.stand = stand;
        return this;
    }

    /**
     * Starter in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public List<RanglisteStarterModel> getStarter() {
        return starter;
    }

    /**
     * Starter in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public void setStarter(List<RanglisteStarterModel> starter) {
        this.starter = starter;
    }

    public RanglisteModel withStarter(List<RanglisteStarterModel> starter) {
        this.starter = starter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("stand", stand).append("starter", starter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(stand).append(starter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RanglisteModel) == false) {
            return false;
        }
        RanglisteModel rhs = ((RanglisteModel) other);
        return new EqualsBuilder().append(id, rhs.id).append(stand, rhs.stand).append(starter, rhs.starter).isEquals();
    }

}
