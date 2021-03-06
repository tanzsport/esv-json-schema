
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
 * Daten eines Landesverbandes
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "name"
})
public class LandesverbandModel implements Serializable
{

    /**
     * ID des Landesverbandes
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID des Landesverbandes")
    private Integer id;
    /**
     * Schlüssel für Landesverbände
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Schl\u00fcssel f\u00fcr Landesverb\u00e4nde")
    private LtvTyp name;
    private final static long serialVersionUID = -8371967517408040146L;

    /**
     * ID des Landesverbandes
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID des Landesverbandes
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public LandesverbandModel withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Schlüssel für Landesverbände
     * (Required)
     * 
     */
    @JsonProperty("name")
    public LtvTyp getName() {
        return name;
    }

    /**
     * Schlüssel für Landesverbände
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(LtvTyp name) {
        this.name = name;
    }

    public LandesverbandModel withName(LtvTyp name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandesverbandModel) == false) {
            return false;
        }
        LandesverbandModel rhs = ((LandesverbandModel) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).isEquals();
    }

}
