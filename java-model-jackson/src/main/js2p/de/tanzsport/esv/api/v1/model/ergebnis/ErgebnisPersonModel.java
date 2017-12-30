
package de.tanzsport.esv.api.v1.model.ergebnis;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Person in einem Ergebnis
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "vorname",
    "nachname",
    "wdsfMin"
})
public class ErgebnisPersonModel implements Serializable
{

    /**
     * DTV-Nummer der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("DTV-Nummer der Person sofern vorhanden")
    private String id;
    /**
     * Vorname der Person
     * (Required)
     * 
     */
    @JsonProperty("vorname")
    @JsonPropertyDescription("Vorname der Person")
    private String vorname;
    /**
     * Nachname der Person
     * (Required)
     * 
     */
    @JsonProperty("nachname")
    @JsonPropertyDescription("Nachname der Person")
    private String nachname;
    /**
     * WDSF-MIN der Person
     * (Required)
     * 
     */
    @JsonProperty("wdsfMin")
    @JsonPropertyDescription("WDSF-MIN der Person")
    private String wdsfMin;
    private final static long serialVersionUID = -3888509071061522886L;

    /**
     * DTV-Nummer der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * DTV-Nummer der Person sofern vorhanden
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ErgebnisPersonModel withId(String id) {
        this.id = id;
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

    public ErgebnisPersonModel withVorname(String vorname) {
        this.vorname = vorname;
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

    public ErgebnisPersonModel withNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * WDSF-MIN der Person
     * (Required)
     * 
     */
    @JsonProperty("wdsfMin")
    public String getWdsfMin() {
        return wdsfMin;
    }

    /**
     * WDSF-MIN der Person
     * (Required)
     * 
     */
    @JsonProperty("wdsfMin")
    public void setWdsfMin(String wdsfMin) {
        this.wdsfMin = wdsfMin;
    }

    public ErgebnisPersonModel withWdsfMin(String wdsfMin) {
        this.wdsfMin = wdsfMin;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("vorname", vorname).append("nachname", nachname).append("wdsfMin", wdsfMin).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nachname).append(id).append(wdsfMin).append(vorname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErgebnisPersonModel) == false) {
            return false;
        }
        ErgebnisPersonModel rhs = ((ErgebnisPersonModel) other);
        return new EqualsBuilder().append(nachname, rhs.nachname).append(id, rhs.id).append(wdsfMin, rhs.wdsfMin).append(vorname, rhs.vorname).isEquals();
    }

}
