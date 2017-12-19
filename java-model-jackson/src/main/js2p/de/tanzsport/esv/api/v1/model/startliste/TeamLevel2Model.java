
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
 * Daten eines Teams in der Startliste (Level 2)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "name",
    "kapitaen",
    "trainer",
    "musikTitel"
})
public class TeamLevel2Model implements Serializable
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
    /**
     * Trainer des Teams sofern angegeben
     * (Required)
     * 
     */
    @JsonProperty("trainer")
    @JsonPropertyDescription("Trainer des Teams sofern angegeben")
    private String trainer;
    /**
     * Titel der Choreographie/des Tanzes
     * (Required)
     * 
     */
    @JsonProperty("musikTitel")
    @JsonPropertyDescription("Titel der Choreographie/des Tanzes")
    private String musikTitel;
    private final static long serialVersionUID = -5928446095954464003L;

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

    public TeamLevel2Model withName(String name) {
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

    public TeamLevel2Model withKapitaen(String kapitaen) {
        this.kapitaen = kapitaen;
        return this;
    }

    /**
     * Trainer des Teams sofern angegeben
     * (Required)
     * 
     */
    @JsonProperty("trainer")
    public String getTrainer() {
        return trainer;
    }

    /**
     * Trainer des Teams sofern angegeben
     * (Required)
     * 
     */
    @JsonProperty("trainer")
    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public TeamLevel2Model withTrainer(String trainer) {
        this.trainer = trainer;
        return this;
    }

    /**
     * Titel der Choreographie/des Tanzes
     * (Required)
     * 
     */
    @JsonProperty("musikTitel")
    public String getMusikTitel() {
        return musikTitel;
    }

    /**
     * Titel der Choreographie/des Tanzes
     * (Required)
     * 
     */
    @JsonProperty("musikTitel")
    public void setMusikTitel(String musikTitel) {
        this.musikTitel = musikTitel;
    }

    public TeamLevel2Model withMusikTitel(String musikTitel) {
        this.musikTitel = musikTitel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("kapitaen", kapitaen).append("trainer", trainer).append("musikTitel", musikTitel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(musikTitel).append(kapitaen).append(trainer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamLevel2Model) == false) {
            return false;
        }
        TeamLevel2Model rhs = ((TeamLevel2Model) other);
        return new EqualsBuilder().append(name, rhs.name).append(musikTitel, rhs.musikTitel).append(kapitaen, rhs.kapitaen).append(trainer, rhs.trainer).isEquals();
    }

}
