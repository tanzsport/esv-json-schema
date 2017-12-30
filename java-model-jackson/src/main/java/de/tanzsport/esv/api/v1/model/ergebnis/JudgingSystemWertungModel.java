package de.tanzsport.esv.api.v1.model.ergebnis;

import de.tanzsport.esv.api.v1.model.WertungsTyp;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class JudgingSystemWertungModel extends WertungModel {

    public final Number score;

    public JudgingSystemWertungModel(Number score) {
        if (score == null) {
            this.score = 0;
        }
        else {
            this.score = score;
        }
    }

    @Override
    public WertungsTyp getTyp() {
        return WertungsTyp.JS;
    }

    public Number getScore() {
        return score;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
