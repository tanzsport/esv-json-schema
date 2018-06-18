package de.tanzsport.esv.api.v1.jackson;

import de.tanzsport.esv.api.v1.model.ergebnis.WertungModel;

import java.util.List;

public class TestPojoWertungen {

    private String property;
    private List<WertungModel> wertungen;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public List<WertungModel> getWertungen() {
        return wertungen;
    }

    public void setWertungen(List<WertungModel> wertungen) {
        this.wertungen = wertungen;
    }
}
