package de.tanzsport.esv.api.v1.model.ergebnis;

import de.tanzsport.esv.api.v1.model.WertungsTyp;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Collections;
import java.util.List;

public class KreuzWertungModel extends WertungModel {

    private final List<KreuzWertungWrModel> wertungsrichter;
    private final Number summe;

    public KreuzWertungModel(List<KreuzWertungWrModel> wertungsrichter, Number summe) {
        if (wertungsrichter == null) {
            this.wertungsrichter = Collections.emptyList();
        }
        else {
            this.wertungsrichter = wertungsrichter;
        }
        if (summe == null) {
            this.summe = 0;
        }
        else {
            this.summe = summe;
        }
    }

    public List<KreuzWertungWrModel> getWertungsrichter() {
        return Collections.unmodifiableList(wertungsrichter);
    }

    public Number getSumme() {
        return summe;
    }

    @Override
    public WertungsTyp getTyp() {
        return WertungsTyp.KREUZ;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
