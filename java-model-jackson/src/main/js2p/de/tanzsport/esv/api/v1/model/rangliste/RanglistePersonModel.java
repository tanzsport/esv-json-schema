
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
 * Person in einem Ranglisten-Starter
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "titel",
    "nachname",
    "vorname"
})
public class RanglistePersonModel implements Serializable
{

    /**
     * DTV-Nummer der Person
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("DTV-Nummer der Person")
    private String id;
    /**
     * Titel der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("titel")
    @JsonPropertyDescription("Titel der Person sofern vorhanden")
    private String titel;
    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    @JsonPropertyDescription("Nachname der Person")
    private String nachname;
    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    @JsonPropertyDescription("Vorname der Person")
    private String vorname;
    private final static long serialVersionUID = -2327363644695714724L;

    /**
     * DTV-Nummer der Person
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * DTV-Nummer der Person
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RanglistePersonModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Titel der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("titel")
    public String getTitel() {
        return titel;
    }

    /**
     * Titel der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("titel")
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public RanglistePersonModel withTitel(String titel) {
        this.titel = titel;
        return this;
    }

    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public String getNachname() {
        return nachname;
    }

    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public RanglistePersonModel withNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public String getVorname() {
        return vorname;
    }

    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public RanglistePersonModel withVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("titel", titel).append("nachname", nachname).append("vorname", vorname).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nachname).append(titel).append(id).append(vorname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RanglistePersonModel) == false) {
            return false;
        }
        RanglistePersonModel rhs = ((RanglistePersonModel) other);
        return new EqualsBuilder().append(nachname, rhs.nachname).append(titel, rhs.titel).append(id, rhs.id).append(vorname, rhs.vorname).isEquals();
    }

}
