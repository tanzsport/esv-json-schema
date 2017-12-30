
package de.tanzsport.esv.api.v1.model.ergebnis;

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
 * Skatingtabelle in einem Ergebnis
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "regel10",
    "regel11"
})
public class SkatingTabelleModel implements Serializable
{

    /**
     * Ausrechnung Regel 10
     * <p>
     * Array über alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("regel10")
    @JsonPropertyDescription("Array \u00fcber alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis")
    private List<List<Object>> regel10 = new ArrayList<List<Object>>();
    /**
     * Ausrechnung Regel 11
     * <p>
     * Array über alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("regel11")
    @JsonPropertyDescription("Array \u00fcber alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis")
    private List<List<Object>> regel11 = new ArrayList<List<Object>>();
    private final static long serialVersionUID = -7407029736726521020L;

    /**
     * Ausrechnung Regel 10
     * <p>
     * Array über alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("regel10")
    public List<List<Object>> getRegel10() {
        return regel10;
    }

    /**
     * Ausrechnung Regel 10
     * <p>
     * Array über alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("regel10")
    public void setRegel10(List<List<Object>> regel10) {
        this.regel10 = regel10;
    }

    public SkatingTabelleModel withRegel10(List<List<Object>> regel10) {
        this.regel10 = regel10;
        return this;
    }

    /**
     * Ausrechnung Regel 11
     * <p>
     * Array über alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("regel11")
    public List<List<Object>> getRegel11() {
        return regel11;
    }

    /**
     * Ausrechnung Regel 11
     * <p>
     * Array über alle Starter der Runde in der Reihenfolge der Nennung im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("regel11")
    public void setRegel11(List<List<Object>> regel11) {
        this.regel11 = regel11;
    }

    public SkatingTabelleModel withRegel11(List<List<Object>> regel11) {
        this.regel11 = regel11;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("regel10", regel10).append("regel11", regel11).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(regel10).append(regel11).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SkatingTabelleModel) == false) {
            return false;
        }
        SkatingTabelleModel rhs = ((SkatingTabelleModel) other);
        return new EqualsBuilder().append(regel10, rhs.regel10).append(regel11, rhs.regel11).isEquals();
    }

}
