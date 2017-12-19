
package de.tanzsport.esv.api.v1.model.veranstaltung;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten einer Turnierstätte
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "ort",
    "name",
    "anschrift",
    "plz"
})
public class TurnierstaetteModel implements Serializable
{

    /**
     * Ort
     * (Required)
     * 
     */
    @JsonProperty("ort")
    @JsonPropertyDescription("Ort")
    private String ort;
    /**
     * Name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name")
    private String name;
    /**
     * Anschrift
     * (Required)
     * 
     */
    @JsonProperty("anschrift")
    @JsonPropertyDescription("Anschrift")
    private String anschrift;
    /**
     * PLZ
     * (Required)
     * 
     */
    @JsonProperty("plz")
    @JsonPropertyDescription("PLZ")
    private String plz;
    private final static long serialVersionUID = 3838660478757235648L;

    /**
     * Ort
     * (Required)
     * 
     */
    @JsonProperty("ort")
    public String getOrt() {
        return ort;
    }

    /**
     * Ort
     * (Required)
     * 
     */
    @JsonProperty("ort")
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public TurnierstaetteModel withOrt(String ort) {
        this.ort = ort;
        return this;
    }

    /**
     * Name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TurnierstaetteModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Anschrift
     * (Required)
     * 
     */
    @JsonProperty("anschrift")
    public String getAnschrift() {
        return anschrift;
    }

    /**
     * Anschrift
     * (Required)
     * 
     */
    @JsonProperty("anschrift")
    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public TurnierstaetteModel withAnschrift(String anschrift) {
        this.anschrift = anschrift;
        return this;
    }

    /**
     * PLZ
     * (Required)
     * 
     */
    @JsonProperty("plz")
    public String getPlz() {
        return plz;
    }

    /**
     * PLZ
     * (Required)
     * 
     */
    @JsonProperty("plz")
    public void setPlz(String plz) {
        this.plz = plz;
    }

    public TurnierstaetteModel withPlz(String plz) {
        this.plz = plz;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ort", ort).append("name", name).append("anschrift", anschrift).append("plz", plz).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ort).append(name).append(anschrift).append(plz).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TurnierstaetteModel) == false) {
            return false;
        }
        TurnierstaetteModel rhs = ((TurnierstaetteModel) other);
        return new EqualsBuilder().append(ort, rhs.ort).append(name, rhs.name).append(anschrift, rhs.anschrift).append(plz, rhs.plz).isEquals();
    }

}
