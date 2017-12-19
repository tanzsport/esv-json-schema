
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten eines Teams in der Startliste (Level 1) [wurde nicht verwendet]
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "name",
    "kapitaen"
})
public class TeamLevel1Model implements Serializable
{

    /**
     * Name des Teams
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name des Teams")
    private String name;
    /**
     * Kapitän des Teams sofern angegeben
     * (Required)
     * 
     */
    @JsonProperty("kapitaen")
    @JsonPropertyDescription("Kapit\u00e4n des Teams sofern angegeben")
    private String kapitaen;
    private final static long serialVersionUID = -5301924422670901787L;

    /**
     * Name des Teams
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name des Teams
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TeamLevel1Model withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Kapitän des Teams sofern angegeben
     * (Required)
     * 
     */
    @JsonProperty("kapitaen")
    public String getKapitaen() {
        return kapitaen;
    }

    /**
     * Kapitän des Teams sofern angegeben
     * (Required)
     * 
     */
    @JsonProperty("kapitaen")
    public void setKapitaen(String kapitaen) {
        this.kapitaen = kapitaen;
    }

    public TeamLevel1Model withKapitaen(String kapitaen) {
        this.kapitaen = kapitaen;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("kapitaen", kapitaen).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(kapitaen).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamLevel1Model) == false) {
            return false;
        }
        TeamLevel1Model rhs = ((TeamLevel1Model) other);
        return new EqualsBuilder().append(name, rhs.name).append(kapitaen, rhs.kapitaen).isEquals();
    }

}
