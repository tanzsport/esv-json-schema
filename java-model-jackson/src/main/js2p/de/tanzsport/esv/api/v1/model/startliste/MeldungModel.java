
package de.tanzsport.esv.api.v1.model.startliste;

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
 * Meldung in einer Startliste
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "turnierId",
    "meldung",
    "bestaetigt",
    "startNr",
    "startsperre"
})
public class MeldungModel implements Serializable
{

    /**
     * ID des Turniers
     * (Required)
     * 
     */
    @JsonProperty("turnierId")
    @JsonPropertyDescription("ID des Turniers")
    private Integer turnierId;
    /**
     * Flag für Meldung (true = Meldung, false = Abmeldung)
     * (Required)
     * 
     */
    @JsonProperty("meldung")
    @JsonPropertyDescription("Flag f\u00fcr Meldung (true = Meldung, false = Abmeldung)")
    private Boolean meldung;
    /**
     * ISO8601 Datum/Zeit
     * 
     */
    @JsonProperty("bestaetigt")
    @JsonPropertyDescription("ISO8601 Datum/Zeit")
    private ZonedDateTime bestaetigt;
    /**
     * Von der ESV vergebene Start-Nr., relevant nur für Formationen und Gruppen
     * (Required)
     * 
     */
    @JsonProperty("startNr")
    @JsonPropertyDescription("Von der ESV vergebene Start-Nr., relevant nur f\u00fcr Formationen und Gruppen")
    private Integer startNr;
    /**
     * Flag für Startsperre (true = gesperrt, false = nicht gesperrt)
     * (Required)
     * 
     */
    @JsonProperty("startsperre")
    @JsonPropertyDescription("Flag f\u00fcr Startsperre (true = gesperrt, false = nicht gesperrt)")
    private Boolean startsperre;
    private final static long serialVersionUID = -2937732116998269088L;

    /**
     * ID des Turniers
     * (Required)
     * 
     */
    @JsonProperty("turnierId")
    public Integer getTurnierId() {
        return turnierId;
    }

    /**
     * ID des Turniers
     * (Required)
     * 
     */
    @JsonProperty("turnierId")
    public void setTurnierId(Integer turnierId) {
        this.turnierId = turnierId;
    }

    public MeldungModel withTurnierId(Integer turnierId) {
        this.turnierId = turnierId;
        return this;
    }

    /**
     * Flag für Meldung (true = Meldung, false = Abmeldung)
     * (Required)
     * 
     */
    @JsonProperty("meldung")
    public Boolean getMeldung() {
        return meldung;
    }

    /**
     * Flag für Meldung (true = Meldung, false = Abmeldung)
     * (Required)
     * 
     */
    @JsonProperty("meldung")
    public void setMeldung(Boolean meldung) {
        this.meldung = meldung;
    }

    public MeldungModel withMeldung(Boolean meldung) {
        this.meldung = meldung;
        return this;
    }

    /**
     * ISO8601 Datum/Zeit
     * 
     */
    @JsonProperty("bestaetigt")
    public ZonedDateTime getBestaetigt() {
        return bestaetigt;
    }

    /**
     * ISO8601 Datum/Zeit
     * 
     */
    @JsonProperty("bestaetigt")
    public void setBestaetigt(ZonedDateTime bestaetigt) {
        this.bestaetigt = bestaetigt;
    }

    public MeldungModel withBestaetigt(ZonedDateTime bestaetigt) {
        this.bestaetigt = bestaetigt;
        return this;
    }

    /**
     * Von der ESV vergebene Start-Nr., relevant nur für Formationen und Gruppen
     * (Required)
     * 
     */
    @JsonProperty("startNr")
    public Integer getStartNr() {
        return startNr;
    }

    /**
     * Von der ESV vergebene Start-Nr., relevant nur für Formationen und Gruppen
     * (Required)
     * 
     */
    @JsonProperty("startNr")
    public void setStartNr(Integer startNr) {
        this.startNr = startNr;
    }

    public MeldungModel withStartNr(Integer startNr) {
        this.startNr = startNr;
        return this;
    }

    /**
     * Flag für Startsperre (true = gesperrt, false = nicht gesperrt)
     * (Required)
     * 
     */
    @JsonProperty("startsperre")
    public Boolean getStartsperre() {
        return startsperre;
    }

    /**
     * Flag für Startsperre (true = gesperrt, false = nicht gesperrt)
     * (Required)
     * 
     */
    @JsonProperty("startsperre")
    public void setStartsperre(Boolean startsperre) {
        this.startsperre = startsperre;
    }

    public MeldungModel withStartsperre(Boolean startsperre) {
        this.startsperre = startsperre;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("turnierId", turnierId).append("meldung", meldung).append("bestaetigt", bestaetigt).append("startNr", startNr).append("startsperre", startsperre).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bestaetigt).append(turnierId).append(startNr).append(startsperre).append(meldung).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeldungModel) == false) {
            return false;
        }
        MeldungModel rhs = ((MeldungModel) other);
        return new EqualsBuilder().append(bestaetigt, rhs.bestaetigt).append(turnierId, rhs.turnierId).append(startNr, rhs.startNr).append(startsperre, rhs.startsperre).append(meldung, rhs.meldung).isEquals();
    }

}
