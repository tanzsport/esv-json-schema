
package de.tanzsport.esv.api.v1.model.rangliste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.VereinModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Starter in einer Rangliste
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "rang",
    "personen",
    "club",
    "punkte",
    "anzahlTurniere"
})
public class RanglisteStarterModel implements Serializable
{

    /**
     * ID des Starters
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID des Starters")
    private Integer id;
    /**
     * Rang eines Starters in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("rang")
    @JsonPropertyDescription("Rang eines Starters in der Rangliste")
    private RanglisteRangModel rang;
    /**
     * Personen bei Einzelwettbewerben Standard/Latein/JMD, leer bei Formationen und Gruppen
     * (Required)
     * 
     */
    @JsonProperty("personen")
    @JsonPropertyDescription("Personen bei Einzelwettbewerben Standard/Latein/JMD, leer bei Formationen und Gruppen")
    private List<RanglistePersonModel> personen = new ArrayList<RanglistePersonModel>();
    /**
     * Daten eines Vereins
     * (Required)
     * 
     */
    @JsonProperty("club")
    @JsonPropertyDescription("Daten eines Vereins")
    private VereinModel club;
    /**
     * Ranglisten-Punkte
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    @JsonPropertyDescription("Ranglisten-Punkte")
    private Integer punkte;
    /**
     * Anzahl der teilgenommenen Turniere in der Ranglistenwertung
     * (Required)
     * 
     */
    @JsonProperty("anzahlTurniere")
    @JsonPropertyDescription("Anzahl der teilgenommenen Turniere in der Ranglistenwertung")
    private Integer anzahlTurniere;
    private final static long serialVersionUID = -1070698738202932995L;

    /**
     * ID des Starters
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID des Starters
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public RanglisteStarterModel withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Rang eines Starters in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("rang")
    public RanglisteRangModel getRang() {
        return rang;
    }

    /**
     * Rang eines Starters in der Rangliste
     * (Required)
     * 
     */
    @JsonProperty("rang")
    public void setRang(RanglisteRangModel rang) {
        this.rang = rang;
    }

    public RanglisteStarterModel withRang(RanglisteRangModel rang) {
        this.rang = rang;
        return this;
    }

    /**
     * Personen bei Einzelwettbewerben Standard/Latein/JMD, leer bei Formationen und Gruppen
     * (Required)
     * 
     */
    @JsonProperty("personen")
    public List<RanglistePersonModel> getPersonen() {
        return personen;
    }

    /**
     * Personen bei Einzelwettbewerben Standard/Latein/JMD, leer bei Formationen und Gruppen
     * (Required)
     * 
     */
    @JsonProperty("personen")
    public void setPersonen(List<RanglistePersonModel> personen) {
        this.personen = personen;
    }

    public RanglisteStarterModel withPersonen(List<RanglistePersonModel> personen) {
        this.personen = personen;
        return this;
    }

    /**
     * Daten eines Vereins
     * (Required)
     * 
     */
    @JsonProperty("club")
    public VereinModel getClub() {
        return club;
    }

    /**
     * Daten eines Vereins
     * (Required)
     * 
     */
    @JsonProperty("club")
    public void setClub(VereinModel club) {
        this.club = club;
    }

    public RanglisteStarterModel withClub(VereinModel club) {
        this.club = club;
        return this;
    }

    /**
     * Ranglisten-Punkte
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public Integer getPunkte() {
        return punkte;
    }

    /**
     * Ranglisten-Punkte
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public void setPunkte(Integer punkte) {
        this.punkte = punkte;
    }

    public RanglisteStarterModel withPunkte(Integer punkte) {
        this.punkte = punkte;
        return this;
    }

    /**
     * Anzahl der teilgenommenen Turniere in der Ranglistenwertung
     * (Required)
     * 
     */
    @JsonProperty("anzahlTurniere")
    public Integer getAnzahlTurniere() {
        return anzahlTurniere;
    }

    /**
     * Anzahl der teilgenommenen Turniere in der Ranglistenwertung
     * (Required)
     * 
     */
    @JsonProperty("anzahlTurniere")
    public void setAnzahlTurniere(Integer anzahlTurniere) {
        this.anzahlTurniere = anzahlTurniere;
    }

    public RanglisteStarterModel withAnzahlTurniere(Integer anzahlTurniere) {
        this.anzahlTurniere = anzahlTurniere;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("rang", rang).append("personen", personen).append("club", club).append("punkte", punkte).append("anzahlTurniere", anzahlTurniere).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(punkte).append(personen).append(club).append(id).append(anzahlTurniere).append(rang).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RanglisteStarterModel) == false) {
            return false;
        }
        RanglisteStarterModel rhs = ((RanglisteStarterModel) other);
        return new EqualsBuilder().append(punkte, rhs.punkte).append(personen, rhs.personen).append(club, rhs.club).append(id, rhs.id).append(anzahlTurniere, rhs.anzahlTurniere).append(rang, rhs.rang).isEquals();
    }

}
