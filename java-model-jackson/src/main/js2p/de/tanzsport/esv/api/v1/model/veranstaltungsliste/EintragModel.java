
package de.tanzsport.esv.api.v1.model.veranstaltungsliste;

import java.io.Serializable;
import java.time.ZonedDateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Eintrag in der Veranstaltungsliste
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "datumVon",
    "datumBis",
    "ort",
    "titel"
})
public class EintragModel implements Serializable
{

    /**
     * ID der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID der Veranstaltung")
    private Integer id;
    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumVon")
    @JsonPropertyDescription("ISO8601 Datum/Zeit")
    private ZonedDateTime datumVon;
    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumBis")
    @JsonPropertyDescription("ISO8601 Datum/Zeit")
    private ZonedDateTime datumBis;
    /**
     * Veranstaltungsort
     * (Required)
     * 
     */
    @JsonProperty("ort")
    @JsonPropertyDescription("Veranstaltungsort")
    private String ort;
    /**
     * Titel der Veranstaltung
     * 
     */
    @JsonProperty("titel")
    @JsonPropertyDescription("Titel der Veranstaltung")
    private String titel;
    private final static long serialVersionUID = 540220042145824260L;

    /**
     * ID der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public EintragModel withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumVon")
    public ZonedDateTime getDatumVon() {
        return datumVon;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumVon")
    public void setDatumVon(ZonedDateTime datumVon) {
        this.datumVon = datumVon;
    }

    public EintragModel withDatumVon(ZonedDateTime datumVon) {
        this.datumVon = datumVon;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumBis")
    public ZonedDateTime getDatumBis() {
        return datumBis;
    }

    /**
     * ISO8601 Datum/Zeit
     * (Required)
     * 
     */
    @JsonProperty("datumBis")
    public void setDatumBis(ZonedDateTime datumBis) {
        this.datumBis = datumBis;
    }

    public EintragModel withDatumBis(ZonedDateTime datumBis) {
        this.datumBis = datumBis;
        return this;
    }

    /**
     * Veranstaltungsort
     * (Required)
     * 
     */
    @JsonProperty("ort")
    public String getOrt() {
        return ort;
    }

    /**
     * Veranstaltungsort
     * (Required)
     * 
     */
    @JsonProperty("ort")
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public EintragModel withOrt(String ort) {
        this.ort = ort;
        return this;
    }

    /**
     * Titel der Veranstaltung
     * 
     */
    @JsonProperty("titel")
    public String getTitel() {
        return titel;
    }

    /**
     * Titel der Veranstaltung
     * 
     */
    @JsonProperty("titel")
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public EintragModel withTitel(String titel) {
        this.titel = titel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("datumVon", datumVon).append("datumBis", datumBis).append("ort", ort).append("titel", titel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ort).append(datumVon).append(datumBis).append(titel).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EintragModel) == false) {
            return false;
        }
        EintragModel rhs = ((EintragModel) other);
        return new EqualsBuilder().append(ort, rhs.ort).append(datumVon, rhs.datumVon).append(datumBis, rhs.datumBis).append(titel, rhs.titel).append(id, rhs.id).isEquals();
    }

}
