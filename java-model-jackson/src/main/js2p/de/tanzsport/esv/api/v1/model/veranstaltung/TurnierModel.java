
package de.tanzsport.esv.api.v1.model.veranstaltung;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tanzsport.esv.api.v1.model.RanglistenId;
import de.tanzsport.esv.api.v1.model.StartgruppeTyp;
import de.tanzsport.esv.api.v1.model.StartklasseLigaTyp;
import de.tanzsport.esv.api.v1.model.TurnierartTyp;
import de.tanzsport.esv.api.v1.model.TurnierformTyp;
import de.tanzsport.esv.api.v1.model.WettbewerbsartTyp;
import de.tanzsport.esv.api.v1.model.ZulassungsbereichTyp;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Daten eines Turniers
 * 
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "id",
    "datumVon",
    "datumBis",
    "startzeitPlan",
    "startzeitPlanKorrigiert",
    "titel",
    "veranstalter",
    "ausrichter",
    "flaechenId",
    "wettbewerbsart",
    "turnierform",
    "startgruppe",
    "startklasseLiga",
    "turnierart",
    "zulassung",
    "wanderpokal",
    "turnierrang",
    "aufstiegsturnier",
    "ranglistenId",
    "wdsfTurnierId",
    "startgebuehr",
    "bemerkungen",
    "wertungsrichter",
    "turnierleiter",
    "beisitzer",
    "chairman"
})
public class TurnierModel implements Serializable
{

    /**
     * ID des Turniers
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID des Turniers")
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
     * Geplante Startzeit des Turniers (veröffentlicht im Tanzspiegel)
     * (Required)
     * 
     */
    @JsonProperty("startzeitPlan")
    @JsonPropertyDescription("Geplante Startzeit des Turniers (ver\u00f6ffentlicht im Tanzspiegel)")
    private String startzeitPlan;
    /**
     * Ggf. vom Veranstalter/Ausrichter korrigierte Startzeit
     * 
     */
    @JsonProperty("startzeitPlanKorrigiert")
    @JsonPropertyDescription("Ggf. vom Veranstalter/Ausrichter korrigierte Startzeit")
    private String startzeitPlanKorrigiert;
    /**
     * Titel des Turniers
     * 
     */
    @JsonProperty("titel")
    @JsonPropertyDescription("Titel des Turniers")
    private String titel;
    /**
     * Daten eines Veranstalters/Ausrichters
     * 
     */
    @JsonProperty("veranstalter")
    @JsonPropertyDescription("Daten eines Veranstalters/Ausrichters")
    private VeranstalterAusrichterModel veranstalter;
    /**
     * Daten eines Veranstalters/Ausrichters
     * 
     */
    @JsonProperty("ausrichter")
    @JsonPropertyDescription("Daten eines Veranstalters/Ausrichters")
    private VeranstalterAusrichterModel ausrichter;
    /**
     * ID der Fläche
     * 
     */
    @JsonProperty("flaechenId")
    @JsonPropertyDescription("ID der Fl\u00e4che")
    private String flaechenId;
    /**
     * Wettbewerbsart
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    @JsonPropertyDescription("Wettbewerbsart")
    private WettbewerbsartTyp wettbewerbsart;
    /**
     * Turnierform
     * (Required)
     * 
     */
    @JsonProperty("turnierform")
    @JsonPropertyDescription("Turnierform")
    private TurnierformTyp turnierform;
    /**
     * Startgruppe
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    @JsonPropertyDescription("Startgruppe")
    private StartgruppeTyp startgruppe;
    /**
     * Startklasse oder -liga
     * (Required)
     * 
     */
    @JsonProperty("startklasseLiga")
    @JsonPropertyDescription("Startklasse oder -liga")
    private StartklasseLigaTyp startklasseLiga;
    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    @JsonPropertyDescription("Turnierart")
    private TurnierartTyp turnierart;
    /**
     * Zulassungsbereiche des Turniers
     * (Required)
     * 
     */
    @JsonProperty("zulassung")
    @JsonPropertyDescription("Zulassungsbereiche des Turniers")
    private List<ZulassungsbereichTyp> zulassung = new ArrayList<ZulassungsbereichTyp>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wanderpokal")
    private Boolean wanderpokal;
    /**
     * Turnierrang (numerisch 1 oder 2)
     * (Required)
     * 
     */
    @JsonProperty("turnierrang")
    @JsonPropertyDescription("Turnierrang (numerisch 1 oder 2)")
    private Integer turnierrang;
    /**
     * Flag für Vergabe von Aufstiegspunkten
     * (Required)
     * 
     */
    @JsonProperty("aufstiegsturnier")
    @JsonPropertyDescription("Flag f\u00fcr Vergabe von Aufstiegspunkten")
    private Boolean aufstiegsturnier;
    /**
     * Ranglisten-ID
     * 
     */
    @JsonProperty("ranglistenId")
    @JsonPropertyDescription("Ranglisten-ID")
    private RanglistenId ranglistenId;
    /**
     * WDSF-ID des Turniers (sofern vorhanden)
     * 
     */
    @JsonProperty("wdsfTurnierId")
    @JsonPropertyDescription("WDSF-ID des Turniers (sofern vorhanden)")
    private Integer wdsfTurnierId;
    /**
     * Startgebühr (sofern vorhanden); Zahl in EUR oder Freitext
     * 
     */
    @JsonProperty("startgebuehr")
    @JsonPropertyDescription("Startgeb\u00fchr (sofern vorhanden); Zahl in EUR oder Freitext")
    private Double startgebuehr;
    /**
     * Bemerkungen zum Turnier (sofern vorhanden)
     * 
     */
    @JsonProperty("bemerkungen")
    @JsonPropertyDescription("Bemerkungen zum Turnier (sofern vorhanden)")
    private String bemerkungen;
    /**
     * DTV-Nummern der für dieses Turnier eingesetzten Wertungsrichter
     * 
     */
    @JsonProperty("wertungsrichter")
    @JsonPropertyDescription("DTV-Nummern der f\u00fcr dieses Turnier eingesetzten Wertungsrichter")
    private List<String> wertungsrichter = new ArrayList<String>();
    /**
     * DTV-Nummer des für dieses Turnier eingesetzten Turnierleiters
     * 
     */
    @JsonProperty("turnierleiter")
    @JsonPropertyDescription("DTV-Nummer des f\u00fcr dieses Turnier eingesetzten Turnierleiters")
    private String turnierleiter;
    /**
     * DTV-Nummer des für dieses Turnier eingesetzten Beisitzers
     * 
     */
    @JsonProperty("beisitzer")
    @JsonPropertyDescription("DTV-Nummer des f\u00fcr dieses Turnier eingesetzten Beisitzers")
    private String beisitzer;
    /**
     * DTV-Nummer der für dieses Turnier eingesetzten Chairperson
     * 
     */
    @JsonProperty("chairman")
    @JsonPropertyDescription("DTV-Nummer der f\u00fcr dieses Turnier eingesetzten Chairperson")
    private String chairman;
    private final static long serialVersionUID = -3164603672393247711L;

    /**
     * ID des Turniers
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * ID des Turniers
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public TurnierModel withId(Integer id) {
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

    public TurnierModel withDatumVon(ZonedDateTime datumVon) {
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

    public TurnierModel withDatumBis(ZonedDateTime datumBis) {
        this.datumBis = datumBis;
        return this;
    }

    /**
     * Geplante Startzeit des Turniers (veröffentlicht im Tanzspiegel)
     * (Required)
     * 
     */
    @JsonProperty("startzeitPlan")
    public String getStartzeitPlan() {
        return startzeitPlan;
    }

    /**
     * Geplante Startzeit des Turniers (veröffentlicht im Tanzspiegel)
     * (Required)
     * 
     */
    @JsonProperty("startzeitPlan")
    public void setStartzeitPlan(String startzeitPlan) {
        this.startzeitPlan = startzeitPlan;
    }

    public TurnierModel withStartzeitPlan(String startzeitPlan) {
        this.startzeitPlan = startzeitPlan;
        return this;
    }

    /**
     * Ggf. vom Veranstalter/Ausrichter korrigierte Startzeit
     * 
     */
    @JsonProperty("startzeitPlanKorrigiert")
    public String getStartzeitPlanKorrigiert() {
        return startzeitPlanKorrigiert;
    }

    /**
     * Ggf. vom Veranstalter/Ausrichter korrigierte Startzeit
     * 
     */
    @JsonProperty("startzeitPlanKorrigiert")
    public void setStartzeitPlanKorrigiert(String startzeitPlanKorrigiert) {
        this.startzeitPlanKorrigiert = startzeitPlanKorrigiert;
    }

    public TurnierModel withStartzeitPlanKorrigiert(String startzeitPlanKorrigiert) {
        this.startzeitPlanKorrigiert = startzeitPlanKorrigiert;
        return this;
    }

    /**
     * Titel des Turniers
     * 
     */
    @JsonProperty("titel")
    public String getTitel() {
        return titel;
    }

    /**
     * Titel des Turniers
     * 
     */
    @JsonProperty("titel")
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public TurnierModel withTitel(String titel) {
        this.titel = titel;
        return this;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * 
     */
    @JsonProperty("veranstalter")
    public VeranstalterAusrichterModel getVeranstalter() {
        return veranstalter;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * 
     */
    @JsonProperty("veranstalter")
    public void setVeranstalter(VeranstalterAusrichterModel veranstalter) {
        this.veranstalter = veranstalter;
    }

    public TurnierModel withVeranstalter(VeranstalterAusrichterModel veranstalter) {
        this.veranstalter = veranstalter;
        return this;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * 
     */
    @JsonProperty("ausrichter")
    public VeranstalterAusrichterModel getAusrichter() {
        return ausrichter;
    }

    /**
     * Daten eines Veranstalters/Ausrichters
     * 
     */
    @JsonProperty("ausrichter")
    public void setAusrichter(VeranstalterAusrichterModel ausrichter) {
        this.ausrichter = ausrichter;
    }

    public TurnierModel withAusrichter(VeranstalterAusrichterModel ausrichter) {
        this.ausrichter = ausrichter;
        return this;
    }

    /**
     * ID der Fläche
     * 
     */
    @JsonProperty("flaechenId")
    public String getFlaechenId() {
        return flaechenId;
    }

    /**
     * ID der Fläche
     * 
     */
    @JsonProperty("flaechenId")
    public void setFlaechenId(String flaechenId) {
        this.flaechenId = flaechenId;
    }

    public TurnierModel withFlaechenId(String flaechenId) {
        this.flaechenId = flaechenId;
        return this;
    }

    /**
     * Wettbewerbsart
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    public WettbewerbsartTyp getWettbewerbsart() {
        return wettbewerbsart;
    }

    /**
     * Wettbewerbsart
     * (Required)
     * 
     */
    @JsonProperty("wettbewerbsart")
    public void setWettbewerbsart(WettbewerbsartTyp wettbewerbsart) {
        this.wettbewerbsart = wettbewerbsart;
    }

    public TurnierModel withWettbewerbsart(WettbewerbsartTyp wettbewerbsart) {
        this.wettbewerbsart = wettbewerbsart;
        return this;
    }

    /**
     * Turnierform
     * (Required)
     * 
     */
    @JsonProperty("turnierform")
    public TurnierformTyp getTurnierform() {
        return turnierform;
    }

    /**
     * Turnierform
     * (Required)
     * 
     */
    @JsonProperty("turnierform")
    public void setTurnierform(TurnierformTyp turnierform) {
        this.turnierform = turnierform;
    }

    public TurnierModel withTurnierform(TurnierformTyp turnierform) {
        this.turnierform = turnierform;
        return this;
    }

    /**
     * Startgruppe
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    public StartgruppeTyp getStartgruppe() {
        return startgruppe;
    }

    /**
     * Startgruppe
     * (Required)
     * 
     */
    @JsonProperty("startgruppe")
    public void setStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
    }

    public TurnierModel withStartgruppe(StartgruppeTyp startgruppe) {
        this.startgruppe = startgruppe;
        return this;
    }

    /**
     * Startklasse oder -liga
     * (Required)
     * 
     */
    @JsonProperty("startklasseLiga")
    public StartklasseLigaTyp getStartklasseLiga() {
        return startklasseLiga;
    }

    /**
     * Startklasse oder -liga
     * (Required)
     * 
     */
    @JsonProperty("startklasseLiga")
    public void setStartklasseLiga(StartklasseLigaTyp startklasseLiga) {
        this.startklasseLiga = startklasseLiga;
    }

    public TurnierModel withStartklasseLiga(StartklasseLigaTyp startklasseLiga) {
        this.startklasseLiga = startklasseLiga;
        return this;
    }

    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    public TurnierartTyp getTurnierart() {
        return turnierart;
    }

    /**
     * Turnierart
     * (Required)
     * 
     */
    @JsonProperty("turnierart")
    public void setTurnierart(TurnierartTyp turnierart) {
        this.turnierart = turnierart;
    }

    public TurnierModel withTurnierart(TurnierartTyp turnierart) {
        this.turnierart = turnierart;
        return this;
    }

    /**
     * Zulassungsbereiche des Turniers
     * (Required)
     * 
     */
    @JsonProperty("zulassung")
    public List<ZulassungsbereichTyp> getZulassung() {
        return zulassung;
    }

    /**
     * Zulassungsbereiche des Turniers
     * (Required)
     * 
     */
    @JsonProperty("zulassung")
    public void setZulassung(List<ZulassungsbereichTyp> zulassung) {
        this.zulassung = zulassung;
    }

    public TurnierModel withZulassung(List<ZulassungsbereichTyp> zulassung) {
        this.zulassung = zulassung;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wanderpokal")
    public Boolean getWanderpokal() {
        return wanderpokal;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wanderpokal")
    public void setWanderpokal(Boolean wanderpokal) {
        this.wanderpokal = wanderpokal;
    }

    public TurnierModel withWanderpokal(Boolean wanderpokal) {
        this.wanderpokal = wanderpokal;
        return this;
    }

    /**
     * Turnierrang (numerisch 1 oder 2)
     * (Required)
     * 
     */
    @JsonProperty("turnierrang")
    public Integer getTurnierrang() {
        return turnierrang;
    }

    /**
     * Turnierrang (numerisch 1 oder 2)
     * (Required)
     * 
     */
    @JsonProperty("turnierrang")
    public void setTurnierrang(Integer turnierrang) {
        this.turnierrang = turnierrang;
    }

    public TurnierModel withTurnierrang(Integer turnierrang) {
        this.turnierrang = turnierrang;
        return this;
    }

    /**
     * Flag für Vergabe von Aufstiegspunkten
     * (Required)
     * 
     */
    @JsonProperty("aufstiegsturnier")
    public Boolean getAufstiegsturnier() {
        return aufstiegsturnier;
    }

    /**
     * Flag für Vergabe von Aufstiegspunkten
     * (Required)
     * 
     */
    @JsonProperty("aufstiegsturnier")
    public void setAufstiegsturnier(Boolean aufstiegsturnier) {
        this.aufstiegsturnier = aufstiegsturnier;
    }

    public TurnierModel withAufstiegsturnier(Boolean aufstiegsturnier) {
        this.aufstiegsturnier = aufstiegsturnier;
        return this;
    }

    /**
     * Ranglisten-ID
     * 
     */
    @JsonProperty("ranglistenId")
    public RanglistenId getRanglistenId() {
        return ranglistenId;
    }

    /**
     * Ranglisten-ID
     * 
     */
    @JsonProperty("ranglistenId")
    public void setRanglistenId(RanglistenId ranglistenId) {
        this.ranglistenId = ranglistenId;
    }

    public TurnierModel withRanglistenId(RanglistenId ranglistenId) {
        this.ranglistenId = ranglistenId;
        return this;
    }

    /**
     * WDSF-ID des Turniers (sofern vorhanden)
     * 
     */
    @JsonProperty("wdsfTurnierId")
    public Integer getWdsfTurnierId() {
        return wdsfTurnierId;
    }

    /**
     * WDSF-ID des Turniers (sofern vorhanden)
     * 
     */
    @JsonProperty("wdsfTurnierId")
    public void setWdsfTurnierId(Integer wdsfTurnierId) {
        this.wdsfTurnierId = wdsfTurnierId;
    }

    public TurnierModel withWdsfTurnierId(Integer wdsfTurnierId) {
        this.wdsfTurnierId = wdsfTurnierId;
        return this;
    }

    /**
     * Startgebühr (sofern vorhanden); Zahl in EUR oder Freitext
     * 
     */
    @JsonProperty("startgebuehr")
    public Double getStartgebuehr() {
        return startgebuehr;
    }

    /**
     * Startgebühr (sofern vorhanden); Zahl in EUR oder Freitext
     * 
     */
    @JsonProperty("startgebuehr")
    public void setStartgebuehr(Double startgebuehr) {
        this.startgebuehr = startgebuehr;
    }

    public TurnierModel withStartgebuehr(Double startgebuehr) {
        this.startgebuehr = startgebuehr;
        return this;
    }

    /**
     * Bemerkungen zum Turnier (sofern vorhanden)
     * 
     */
    @JsonProperty("bemerkungen")
    public String getBemerkungen() {
        return bemerkungen;
    }

    /**
     * Bemerkungen zum Turnier (sofern vorhanden)
     * 
     */
    @JsonProperty("bemerkungen")
    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public TurnierModel withBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
        return this;
    }

    /**
     * DTV-Nummern der für dieses Turnier eingesetzten Wertungsrichter
     * 
     */
    @JsonProperty("wertungsrichter")
    public List<String> getWertungsrichter() {
        return wertungsrichter;
    }

    /**
     * DTV-Nummern der für dieses Turnier eingesetzten Wertungsrichter
     * 
     */
    @JsonProperty("wertungsrichter")
    public void setWertungsrichter(List<String> wertungsrichter) {
        this.wertungsrichter = wertungsrichter;
    }

    public TurnierModel withWertungsrichter(List<String> wertungsrichter) {
        this.wertungsrichter = wertungsrichter;
        return this;
    }

    /**
     * DTV-Nummer des für dieses Turnier eingesetzten Turnierleiters
     * 
     */
    @JsonProperty("turnierleiter")
    public String getTurnierleiter() {
        return turnierleiter;
    }

    /**
     * DTV-Nummer des für dieses Turnier eingesetzten Turnierleiters
     * 
     */
    @JsonProperty("turnierleiter")
    public void setTurnierleiter(String turnierleiter) {
        this.turnierleiter = turnierleiter;
    }

    public TurnierModel withTurnierleiter(String turnierleiter) {
        this.turnierleiter = turnierleiter;
        return this;
    }

    /**
     * DTV-Nummer des für dieses Turnier eingesetzten Beisitzers
     * 
     */
    @JsonProperty("beisitzer")
    public String getBeisitzer() {
        return beisitzer;
    }

    /**
     * DTV-Nummer des für dieses Turnier eingesetzten Beisitzers
     * 
     */
    @JsonProperty("beisitzer")
    public void setBeisitzer(String beisitzer) {
        this.beisitzer = beisitzer;
    }

    public TurnierModel withBeisitzer(String beisitzer) {
        this.beisitzer = beisitzer;
        return this;
    }

    /**
     * DTV-Nummer der für dieses Turnier eingesetzten Chairperson
     * 
     */
    @JsonProperty("chairman")
    public String getChairman() {
        return chairman;
    }

    /**
     * DTV-Nummer der für dieses Turnier eingesetzten Chairperson
     * 
     */
    @JsonProperty("chairman")
    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public TurnierModel withChairman(String chairman) {
        this.chairman = chairman;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("datumVon", datumVon).append("datumBis", datumBis).append("startzeitPlan", startzeitPlan).append("startzeitPlanKorrigiert", startzeitPlanKorrigiert).append("titel", titel).append("veranstalter", veranstalter).append("ausrichter", ausrichter).append("flaechenId", flaechenId).append("wettbewerbsart", wettbewerbsart).append("turnierform", turnierform).append("startgruppe", startgruppe).append("startklasseLiga", startklasseLiga).append("turnierart", turnierart).append("zulassung", zulassung).append("wanderpokal", wanderpokal).append("turnierrang", turnierrang).append("aufstiegsturnier", aufstiegsturnier).append("ranglistenId", ranglistenId).append("wdsfTurnierId", wdsfTurnierId).append("startgebuehr", startgebuehr).append("bemerkungen", bemerkungen).append("wertungsrichter", wertungsrichter).append("turnierleiter", turnierleiter).append("beisitzer", beisitzer).append("chairman", chairman).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bemerkungen).append(startklasseLiga).append(turnierrang).append(aufstiegsturnier).append(flaechenId).append(startzeitPlan).append(titel).append(wanderpokal).append(startzeitPlanKorrigiert).append(turnierform).append(startgruppe).append(datumBis).append(id).append(datumVon).append(wertungsrichter).append(zulassung).append(startgebuehr).append(wdsfTurnierId).append(chairman).append(veranstalter).append(wettbewerbsart).append(turnierart).append(turnierleiter).append(beisitzer).append(ranglistenId).append(ausrichter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TurnierModel) == false) {
            return false;
        }
        TurnierModel rhs = ((TurnierModel) other);
        return new EqualsBuilder().append(bemerkungen, rhs.bemerkungen).append(startklasseLiga, rhs.startklasseLiga).append(turnierrang, rhs.turnierrang).append(aufstiegsturnier, rhs.aufstiegsturnier).append(flaechenId, rhs.flaechenId).append(startzeitPlan, rhs.startzeitPlan).append(titel, rhs.titel).append(wanderpokal, rhs.wanderpokal).append(startzeitPlanKorrigiert, rhs.startzeitPlanKorrigiert).append(turnierform, rhs.turnierform).append(startgruppe, rhs.startgruppe).append(datumBis, rhs.datumBis).append(id, rhs.id).append(datumVon, rhs.datumVon).append(wertungsrichter, rhs.wertungsrichter).append(zulassung, rhs.zulassung).append(startgebuehr, rhs.startgebuehr).append(wdsfTurnierId, rhs.wdsfTurnierId).append(chairman, rhs.chairman).append(veranstalter, rhs.veranstalter).append(wettbewerbsart, rhs.wettbewerbsart).append(turnierart, rhs.turnierart).append(turnierleiter, rhs.turnierleiter).append(beisitzer, rhs.beisitzer).append(ranglistenId, rhs.ranglistenId).append(ausrichter, rhs.ausrichter).isEquals();
    }

}
