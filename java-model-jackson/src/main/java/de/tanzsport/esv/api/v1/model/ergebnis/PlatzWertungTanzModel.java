package de.tanzsport.esv.api.v1.model.ergebnis;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Collections;
import java.util.List;

public class PlatzWertungTanzModel {

    private final List<Number> wertungen;
    private final Number platzzifferTanz;
    private final Number platzzifferSumme;

    public PlatzWertungTanzModel(List<Number> wertungen, Number platzzifferTanz, Number platzzifferSumme) {
        if (wertungen == null) {
            this.wertungen = Collections.emptyList();
        }
        else {
            this.wertungen = wertungen;
        }
        if (platzzifferTanz == null) {
            this.platzzifferTanz = 0;
        }
        else {
            this.platzzifferTanz = platzzifferTanz;
        }
        if (platzzifferSumme == null) {
            this.platzzifferSumme = 0;
        }
        else {
            this.platzzifferSumme = platzzifferSumme;
        }
    }

    public List<Number> getWertungen() {
        return Collections.unmodifiableList(wertungen);
    }

    public Number getPlatzzifferTanz() {
        return platzzifferTanz;
    }

    public Number getPlatzzifferSumme() {
        return platzzifferSumme;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
