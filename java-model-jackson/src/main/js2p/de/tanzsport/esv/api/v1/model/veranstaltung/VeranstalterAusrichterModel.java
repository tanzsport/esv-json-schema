
package de.tanzsport.esv.api.v1.model.veranstaltung;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.LandesverbandModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten eines Veranstalters/Ausrichters
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "name",
    "ltv",
    "kontaktTelefon",
    "kontaktEmail"
})
public class VeranstalterAusrichterModel implements Serializable
{

    /**
     * ID des Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID des Veranstalters/Ausrichters")
    private Integer id;
    /**
     * Name des Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name des Veranstalters/Ausrichters")
    private String name;
    /**
     * Daten eines Landesverbandes
     * 
     */
    @JsonProperty("ltv")
    @JsonPropertyDescription("Daten eines Landesverbandes")
    private LandesverbandModel ltv;
    @JsonProperty("kontaktTelefon")
    private String kontaktTelefon;
    @JsonProperty("kontaktEmail")
    private String kontaktEmail;
    private final static long serialVersionUID = -1639235832309522839L;

    /**
     * ID des Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID des Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public VeranstalterAusrichterModel withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Name des Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name des Veranstalters/Ausrichters
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public VeranstalterAusrichterModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Daten eines Landesverbandes
     * 
     */
    @JsonProperty("ltv")
    public LandesverbandModel getLtv() {
        return ltv;
    }

    /**
     * Daten eines Landesverbandes
     * 
     */
    @JsonProperty("ltv")
    public void setLtv(LandesverbandModel ltv) {
        this.ltv = ltv;
    }

    public VeranstalterAusrichterModel withLtv(LandesverbandModel ltv) {
        this.ltv = ltv;
        return this;
    }

    @JsonProperty("kontaktTelefon")
    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    @JsonProperty("kontaktTelefon")
    public void setKontaktTelefon(String kontaktTelefon) {
        this.kontaktTelefon = kontaktTelefon;
    }

    public VeranstalterAusrichterModel withKontaktTelefon(String kontaktTelefon) {
        this.kontaktTelefon = kontaktTelefon;
        return this;
    }

    @JsonProperty("kontaktEmail")
    public String getKontaktEmail() {
        return kontaktEmail;
    }

    @JsonProperty("kontaktEmail")
    public void setKontaktEmail(String kontaktEmail) {
        this.kontaktEmail = kontaktEmail;
    }

    public VeranstalterAusrichterModel withKontaktEmail(String kontaktEmail) {
        this.kontaktEmail = kontaktEmail;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("ltv", ltv).append("kontaktTelefon", kontaktTelefon).append("kontaktEmail", kontaktEmail).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(kontaktEmail).append(kontaktTelefon).append(ltv).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VeranstalterAusrichterModel) == false) {
            return false;
        }
        VeranstalterAusrichterModel rhs = ((VeranstalterAusrichterModel) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(kontaktEmail, rhs.kontaktEmail).append(kontaktTelefon, rhs.kontaktTelefon).append(ltv, rhs.ltv).isEquals();
    }

}
