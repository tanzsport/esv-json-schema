package de.tanzsport.esv.api.v1.model.ergebnis;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Collections;
import java.util.List;

public class KreuzWertungWrModel {

    private final List<Number> einzelwertungen;
    private final Number summe;

    public KreuzWertungWrModel(List<Number> einzelwertungen, Number summe) {
        if (einzelwertungen == null) {
            this.einzelwertungen = Collections.emptyList();
        }
        else {
            this.einzelwertungen = einzelwertungen;
        }
        if (summe == null) {
            this.summe = 0;
        }
        else {
            this.summe = summe;
        }
    }

    public List<Number> getEinzelwertungen() {
        return Collections.unmodifiableList(einzelwertungen);
    }

    public Number getSumme() {
        return summe;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
