
package de.tanzsport.esv.api.v1.model.startliste;

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
 * Starter in einer Startliste (Schema-Level 1)
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "team",
    "personen",
    "club",
    "staat",
    "meldungen",
    "startbuch"
})
public class StarterLevel1Model implements Serializable
{

    /**
     * ID des Starters (Solist, Paar, Duo, Formation, Small Group)
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID des Starters (Solist, Paar, Duo, Formation, Small Group)")
    private Integer id;
    /**
     * Daten eines Teams in der Startliste (Level 1) [wurde nicht verwendet]
     * (Required)
     * 
     */
    @JsonProperty("team")
    @JsonPropertyDescription("Daten eines Teams in der Startliste (Level 1) [wurde nicht verwendet]")
    private TeamLevel1Model team;
    /**
     * Zum Starter zugehörige Personen; enthält bei Formations- und Gruppenwettbewerben alle Tänzer inkl. Ersatztänzer, bei Paaren und Duos die beiden Partner und bei Solisten die jeweilige Person.
     * (Required)
     * 
     */
    @JsonProperty("personen")
    @JsonPropertyDescription("Zum Starter zugeh\u00f6rige Personen; enth\u00e4lt bei Formations- und Gruppenwettbewerben alle T\u00e4nzer inkl. Ersatzt\u00e4nzer, bei Paaren und Duos die beiden Partner und bei Solisten die jeweilige Person.")
    private List<PersonLevel1Model> personen = new ArrayList<PersonLevel1Model>();
    /**
     * Daten eines Vereins
     * (Required)
     * 
     */
    @JsonProperty("club")
    @JsonPropertyDescription("Daten eines Vereins")
    private VereinModel club;
    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    @JsonPropertyDescription("dreibuchstabiger IOC-Code, repr\u00e4sentiert das Land, f\u00fcr das ein Starter startet oder die Staatsangeh\u00f6rigkeit einer Person")
    private String staat;
    /**
     * Alle Meldungen dieses Starters in der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("meldungen")
    @JsonPropertyDescription("Alle Meldungen dieses Starters in der Veranstaltung")
    private List<MeldungModel> meldungen = new ArrayList<MeldungModel>();
    /**
     * Startbücher des Starters
     * (Required)
     * 
     */
    @JsonProperty("startbuch")
    @JsonPropertyDescription("Startb\u00fccher des Starters")
    private List<StartbuchLevel1Model> startbuch = new ArrayList<StartbuchLevel1Model>();
    private final static long serialVersionUID = 5133844476991826909L;

    /**
     * ID des Starters (Solist, Paar, Duo, Formation, Small Group)
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID des Starters (Solist, Paar, Duo, Formation, Small Group)
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public StarterLevel1Model withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Daten eines Teams in der Startliste (Level 1) [wurde nicht verwendet]
     * (Required)
     * 
     */
    @JsonProperty("team")
    public TeamLevel1Model getTeam() {
        return team;
    }

    /**
     * Daten eines Teams in der Startliste (Level 1) [wurde nicht verwendet]
     * (Required)
     * 
     */
    @JsonProperty("team")
    public void setTeam(TeamLevel1Model team) {
        this.team = team;
    }

    public StarterLevel1Model withTeam(TeamLevel1Model team) {
        this.team = team;
        return this;
    }

    /**
     * Zum Starter zugehörige Personen; enthält bei Formations- und Gruppenwettbewerben alle Tänzer inkl. Ersatztänzer, bei Paaren und Duos die beiden Partner und bei Solisten die jeweilige Person.
     * (Required)
     * 
     */
    @JsonProperty("personen")
    public List<PersonLevel1Model> getPersonen() {
        return personen;
    }

    /**
     * Zum Starter zugehörige Personen; enthält bei Formations- und Gruppenwettbewerben alle Tänzer inkl. Ersatztänzer, bei Paaren und Duos die beiden Partner und bei Solisten die jeweilige Person.
     * (Required)
     * 
     */
    @JsonProperty("personen")
    public void setPersonen(List<PersonLevel1Model> personen) {
        this.personen = personen;
    }

    public StarterLevel1Model withPersonen(List<PersonLevel1Model> personen) {
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

    public StarterLevel1Model withClub(VereinModel club) {
        this.club = club;
        return this;
    }

    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    public String getStaat() {
        return staat;
    }

    /**
     * dreibuchstabiger IOC-Code, repräsentiert das Land, für das ein Starter startet oder die Staatsangehörigkeit einer Person
     * (Required)
     * 
     */
    @JsonProperty("staat")
    public void setStaat(String staat) {
        this.staat = staat;
    }

    public StarterLevel1Model withStaat(String staat) {
        this.staat = staat;
        return this;
    }

    /**
     * Alle Meldungen dieses Starters in der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("meldungen")
    public List<MeldungModel> getMeldungen() {
        return meldungen;
    }

    /**
     * Alle Meldungen dieses Starters in der Veranstaltung
     * (Required)
     * 
     */
    @JsonProperty("meldungen")
    public void setMeldungen(List<MeldungModel> meldungen) {
        this.meldungen = meldungen;
    }

    public StarterLevel1Model withMeldungen(List<MeldungModel> meldungen) {
        this.meldungen = meldungen;
        return this;
    }

    /**
     * Startbücher des Starters
     * (Required)
     * 
     */
    @JsonProperty("startbuch")
    public List<StartbuchLevel1Model> getStartbuch() {
        return startbuch;
    }

    /**
     * Startbücher des Starters
     * (Required)
     * 
     */
    @JsonProperty("startbuch")
    public void setStartbuch(List<StartbuchLevel1Model> startbuch) {
        this.startbuch = startbuch;
    }

    public StarterLevel1Model withStartbuch(List<StartbuchLevel1Model> startbuch) {
        this.startbuch = startbuch;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("team", team).append("personen", personen).append("club", club).append("staat", staat).append("meldungen", meldungen).append("startbuch", startbuch).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personen).append(meldungen).append(startbuch).append(club).append(staat).append(id).append(team).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StarterLevel1Model) == false) {
            return false;
        }
        StarterLevel1Model rhs = ((StarterLevel1Model) other);
        return new EqualsBuilder().append(personen, rhs.personen).append(meldungen, rhs.meldungen).append(startbuch, rhs.startbuch).append(club, rhs.club).append(staat, rhs.staat).append(id, rhs.id).append(team, rhs.team).isEquals();
    }

}
