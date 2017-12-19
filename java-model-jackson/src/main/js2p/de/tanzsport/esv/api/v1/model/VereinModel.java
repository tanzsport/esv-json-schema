
package de.tanzsport.esv.api.v1.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten eines Vereins
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "name",
    "ltv"
})
public class VereinModel implements Serializable
{

    /**
     * ID des Vereins, null bei ausländischen Vereinen
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID des Vereins, null bei ausl\u00e4ndischen Vereinen")
    private Integer id;
    /**
     * Name des Vereins
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name des Vereins")
    private String name;
    /**
     * Daten eines Landesverbandes
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    @JsonPropertyDescription("Daten eines Landesverbandes")
    private LandesverbandModel ltv;
    private final static long serialVersionUID = -1005032797483922526L;

    /**
     * ID des Vereins, null bei ausländischen Vereinen
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID des Vereins, null bei ausländischen Vereinen
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public VereinModel withId(Integer id) {
        this.id = id;
        return this;
    }

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

    public VereinModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Daten eines Landesverbandes
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    public LandesverbandModel getLtv() {
        return ltv;
    }

    /**
     * Daten eines Landesverbandes
     * (Required)
     * 
     */
    @JsonProperty("ltv")
    public void setLtv(LandesverbandModel ltv) {
        this.ltv = ltv;
    }

    public VereinModel withLtv(LandesverbandModel ltv) {
        this.ltv = ltv;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("ltv", ltv).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(ltv).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VereinModel) == false) {
            return false;
        }
        VereinModel rhs = ((VereinModel) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(ltv, rhs.ltv).isEquals();
    }

}
