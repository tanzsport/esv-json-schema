package de.tanzsport.esv.api.v1.model.ergebnis;

import de.tanzsport.esv.api.v1.model.WertungsTyp;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Collections;
import java.util.List;

public class PlatzWertungModel extends WertungModel {

    private final List<PlatzWertungTanzModel> taenze;

    public PlatzWertungModel(List<PlatzWertungTanzModel> taenze) {
        if (taenze == null) {
            this.taenze = Collections.emptyList();
        }
        else {
            this.taenze = taenze;
        }
    }

    public List<PlatzWertungTanzModel> getTaenze() {
        return taenze;
    }

    @Override
    public WertungsTyp getTyp() {
        return WertungsTyp.PLATZ;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
