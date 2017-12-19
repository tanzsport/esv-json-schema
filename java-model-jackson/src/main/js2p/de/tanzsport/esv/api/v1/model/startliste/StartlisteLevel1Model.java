
package de.tanzsport.esv.api.v1.model.startliste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Startliste Veranstaltung oder Wettbewerbsart (Level1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "status",
    "nachmeldungen",
    "starter"
})
public class StartlisteLevel1Model implements Serializable
{

    /**
     * Meldestand der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Meldestand der Veranstaltung")
    private Integer status;
    /**
     * IDs der Turniere mit Nachmeldeerlaubnis
     * (Required)
     * 
     */
    @JsonProperty("nachmeldungen")
    @JsonPropertyDescription("IDs der Turniere mit Nachmeldeerlaubnis")
    private List<Integer> nachmeldungen = new ArrayList<Integer>();
    /**
     * Starter der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("starter")
    @JsonPropertyDescription("Starter der Veranstaltung")
    private List<StarterLevel1Model> starter = new ArrayList<StarterLevel1Model>();
    private final static long serialVersionUID = -8019342710146695521L;

    /**
     * Meldestand der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * Meldestand der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    public StartlisteLevel1Model withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * IDs der Turniere mit Nachmeldeerlaubnis
     * (Required)
     * 
     */
    @JsonProperty("nachmeldungen")
    public List<Integer> getNachmeldungen() {
        return nachmeldungen;
    }

    /**
     * IDs der Turniere mit Nachmeldeerlaubnis
     * (Required)
     * 
     */
    @JsonProperty("nachmeldungen")
    public void setNachmeldungen(List<Integer> nachmeldungen) {
        this.nachmeldungen = nachmeldungen;
    }

    public StartlisteLevel1Model withNachmeldungen(List<Integer> nachmeldungen) {
        this.nachmeldungen = nachmeldungen;
        return this;
    }

    /**
     * Starter der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public List<StarterLevel1Model> getStarter() {
        return starter;
    }

    /**
     * Starter der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("starter")
    public void setStarter(List<StarterLevel1Model> starter) {
        this.starter = starter;
    }

    public StartlisteLevel1Model withStarter(List<StarterLevel1Model> starter) {
        this.starter = starter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("nachmeldungen", nachmeldungen).append("starter", starter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nachmeldungen).append(starter).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartlisteLevel1Model) == false) {
            return false;
        }
        StartlisteLevel1Model rhs = ((StartlisteLevel1Model) other);
        return new EqualsBuilder().append(nachmeldungen, rhs.nachmeldungen).append(starter, rhs.starter).append(status, rhs.status).isEquals();
    }

}
