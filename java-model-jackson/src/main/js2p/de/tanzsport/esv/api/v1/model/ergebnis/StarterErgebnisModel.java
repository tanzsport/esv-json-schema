
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
 * Ergebnis eines Starters
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "platzGesamtVon",
    "platzGesamtBis",
    "platzTurnierVon",
    "platzTurnierBis",
    "punkte",
    "platzierungenGesamt",
    "punkteGesamt",
    "aufstieg",
    "laufzettel",
    "vd"
})
public class StarterErgebnisModel implements Serializable
{

    /**
     * Platz Gesamtergebnis von
     * (Required)
     * 
     */
    @JsonProperty("platzGesamtVon")
    @JsonPropertyDescription("Platz Gesamtergebnis von")
    private Integer platzGesamtVon;
    /**
     * Platz Gesamtergebnis bis
     * (Required)
     * 
     */
    @JsonProperty("platzGesamtBis")
    @JsonPropertyDescription("Platz Gesamtergebnis bis")
    private Integer platzGesamtBis;
    /**
     * Platz eigenes Turnier bis sofern benötigt
     * (Required)
     * 
     */
    @JsonProperty("platzTurnierVon")
    @JsonPropertyDescription("Platz eigenes Turnier bis sofern ben\u00f6tigt")
    private Integer platzTurnierVon;
    /**
     * Platz eigenes Turnier bis sofern benötigt
     * 
     */
    @JsonProperty("platzTurnierBis")
    @JsonPropertyDescription("Platz eigenes Turnier bis sofern ben\u00f6tigt")
    private Integer platzTurnierBis;
    /**
     * Punkte
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    @JsonPropertyDescription("Punkte")
    private Integer punkte;
    /**
     * Platzierungen Gesamt nach Ausscheiden
     * (Required)
     * 
     */
    @JsonProperty("platzierungenGesamt")
    @JsonPropertyDescription("Platzierungen Gesamt nach Ausscheiden")
    private Integer platzierungenGesamt;
    /**
     * Punkte Gesamt nach Ausscheiden
     * (Required)
     * 
     */
    @JsonProperty("punkteGesamt")
    @JsonPropertyDescription("Punkte Gesamt nach Ausscheiden")
    private Integer punkteGesamt;
    /**
     * Typ eines Aufstiegs im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("aufstieg")
    @JsonPropertyDescription("Typ eines Aufstiegs im Ergebnis")
    private AufstiegsTyp aufstieg;
    /**
     * Flag Laufzettel
     * (Required)
     * 
     */
    @JsonProperty("laufzettel")
    @JsonPropertyDescription("Flag Laufzettel")
    private Boolean laufzettel;
    /**
     * Typ einer Verwarnung / Disqualifikation
     * (Required)
     * 
     */
    @JsonProperty("vd")
    @JsonPropertyDescription("Typ einer Verwarnung / Disqualifikation")
    private VerwarnungDisqualifikationsTyp vd;
    private final static long serialVersionUID = -9006313802475514406L;

    /**
     * Platz Gesamtergebnis von
     * (Required)
     * 
     */
    @JsonProperty("platzGesamtVon")
    public Integer getPlatzGesamtVon() {
        return platzGesamtVon;
    }

    /**
     * Platz Gesamtergebnis von
     * (Required)
     * 
     */
    @JsonProperty("platzGesamtVon")
    public void setPlatzGesamtVon(Integer platzGesamtVon) {
        this.platzGesamtVon = platzGesamtVon;
    }

    public StarterErgebnisModel withPlatzGesamtVon(Integer platzGesamtVon) {
        this.platzGesamtVon = platzGesamtVon;
        return this;
    }

    /**
     * Platz Gesamtergebnis bis
     * (Required)
     * 
     */
    @JsonProperty("platzGesamtBis")
    public Integer getPlatzGesamtBis() {
        return platzGesamtBis;
    }

    /**
     * Platz Gesamtergebnis bis
     * (Required)
     * 
     */
    @JsonProperty("platzGesamtBis")
    public void setPlatzGesamtBis(Integer platzGesamtBis) {
        this.platzGesamtBis = platzGesamtBis;
    }

    public StarterErgebnisModel withPlatzGesamtBis(Integer platzGesamtBis) {
        this.platzGesamtBis = platzGesamtBis;
        return this;
    }

    /**
     * Platz eigenes Turnier bis sofern benötigt
     * (Required)
     * 
     */
    @JsonProperty("platzTurnierVon")
    public Integer getPlatzTurnierVon() {
        return platzTurnierVon;
    }

    /**
     * Platz eigenes Turnier bis sofern benötigt
     * (Required)
     * 
     */
    @JsonProperty("platzTurnierVon")
    public void setPlatzTurnierVon(Integer platzTurnierVon) {
        this.platzTurnierVon = platzTurnierVon;
    }

    public StarterErgebnisModel withPlatzTurnierVon(Integer platzTurnierVon) {
        this.platzTurnierVon = platzTurnierVon;
        return this;
    }

    /**
     * Platz eigenes Turnier bis sofern benötigt
     * 
     */
    @JsonProperty("platzTurnierBis")
    public Integer getPlatzTurnierBis() {
        return platzTurnierBis;
    }

    /**
     * Platz eigenes Turnier bis sofern benötigt
     * 
     */
    @JsonProperty("platzTurnierBis")
    public void setPlatzTurnierBis(Integer platzTurnierBis) {
        this.platzTurnierBis = platzTurnierBis;
    }

    public StarterErgebnisModel withPlatzTurnierBis(Integer platzTurnierBis) {
        this.platzTurnierBis = platzTurnierBis;
        return this;
    }

    /**
     * Punkte
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public Integer getPunkte() {
        return punkte;
    }

    /**
     * Punkte
     * (Required)
     * 
     */
    @JsonProperty("punkte")
    public void setPunkte(Integer punkte) {
        this.punkte = punkte;
    }

    public StarterErgebnisModel withPunkte(Integer punkte) {
        this.punkte = punkte;
        return this;
    }

    /**
     * Platzierungen Gesamt nach Ausscheiden
     * (Required)
     * 
     */
    @JsonProperty("platzierungenGesamt")
    public Integer getPlatzierungenGesamt() {
        return platzierungenGesamt;
    }

    /**
     * Platzierungen Gesamt nach Ausscheiden
     * (Required)
     * 
     */
    @JsonProperty("platzierungenGesamt")
    public void setPlatzierungenGesamt(Integer platzierungenGesamt) {
        this.platzierungenGesamt = platzierungenGesamt;
    }

    public StarterErgebnisModel withPlatzierungenGesamt(Integer platzierungenGesamt) {
        this.platzierungenGesamt = platzierungenGesamt;
        return this;
    }

    /**
     * Punkte Gesamt nach Ausscheiden
     * (Required)
     * 
     */
    @JsonProperty("punkteGesamt")
    public Integer getPunkteGesamt() {
        return punkteGesamt;
    }

    /**
     * Punkte Gesamt nach Ausscheiden
     * (Required)
     * 
     */
    @JsonProperty("punkteGesamt")
    public void setPunkteGesamt(Integer punkteGesamt) {
        this.punkteGesamt = punkteGesamt;
    }

    public StarterErgebnisModel withPunkteGesamt(Integer punkteGesamt) {
        this.punkteGesamt = punkteGesamt;
        return this;
    }

    /**
     * Typ eines Aufstiegs im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("aufstieg")
    public AufstiegsTyp getAufstieg() {
        return aufstieg;
    }

    /**
     * Typ eines Aufstiegs im Ergebnis
     * (Required)
     * 
     */
    @JsonProperty("aufstieg")
    public void setAufstieg(AufstiegsTyp aufstieg) {
        this.aufstieg = aufstieg;
    }

    public StarterErgebnisModel withAufstieg(AufstiegsTyp aufstieg) {
        this.aufstieg = aufstieg;
        return this;
    }

    /**
     * Flag Laufzettel
     * (Required)
     * 
     */
    @JsonProperty("laufzettel")
    public Boolean getLaufzettel() {
        return laufzettel;
    }

    /**
     * Flag Laufzettel
     * (Required)
     * 
     */
    @JsonProperty("laufzettel")
    public void setLaufzettel(Boolean laufzettel) {
        this.laufzettel = laufzettel;
    }

    public StarterErgebnisModel withLaufzettel(Boolean laufzettel) {
        this.laufzettel = laufzettel;
        return this;
    }

    /**
     * Typ einer Verwarnung / Disqualifikation
     * (Required)
     * 
     */
    @JsonProperty("vd")
    public VerwarnungDisqualifikationsTyp getVd() {
        return vd;
    }

    /**
     * Typ einer Verwarnung / Disqualifikation
     * (Required)
     * 
     */
    @JsonProperty("vd")
    public void setVd(VerwarnungDisqualifikationsTyp vd) {
        this.vd = vd;
    }

    public StarterErgebnisModel withVd(VerwarnungDisqualifikationsTyp vd) {
        this.vd = vd;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("platzGesamtVon", platzGesamtVon).append("platzGesamtBis", platzGesamtBis).append("platzTurnierVon", platzTurnierVon).append("platzTurnierBis", platzTurnierBis).append("punkte", punkte).append("platzierungenGesamt", platzierungenGesamt).append("punkteGesamt", punkteGesamt).append("aufstieg", aufstieg).append("laufzettel", laufzettel).append("vd", vd).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(punkte).append(platzierungenGesamt).append(platzTurnierVon).append(platzGesamtBis).append(punkteGesamt).append(platzTurnierBis).append(laufzettel).append(aufstieg).append(platzGesamtVon).append(vd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StarterErgebnisModel) == false) {
            return false;
        }
        StarterErgebnisModel rhs = ((StarterErgebnisModel) other);
        return new EqualsBuilder().append(punkte, rhs.punkte).append(platzierungenGesamt, rhs.platzierungenGesamt).append(platzTurnierVon, rhs.platzTurnierVon).append(platzGesamtBis, rhs.platzGesamtBis).append(punkteGesamt, rhs.punkteGesamt).append(platzTurnierBis, rhs.platzTurnierBis).append(laufzettel, rhs.laufzettel).append(aufstieg, rhs.aufstieg).append(platzGesamtVon, rhs.platzGesamtVon).append(vd, rhs.vd).isEquals();
    }

}
