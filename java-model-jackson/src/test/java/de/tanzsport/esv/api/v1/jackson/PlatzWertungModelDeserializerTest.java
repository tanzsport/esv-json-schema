package de.tanzsport.esv.api.v1.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import de.tanzsport.esv.api.v1.model.ergebnis.PlatzWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.StarterStichrundenWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.WertungModel;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlatzWertungModelDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void before() {
        mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(PlatzWertungModel.class, new PlatzWertungModelDeserializer());
        mapper.registerModule(module);
    }

    @Test
    public void deserializesNull() throws Exception {
        WertungModel w = mapper.readValue("null", WertungModel.class);
        assertThat(w).isNull();
    }

    @Test
    public void deserializesStichrundenWertung() throws Exception {
        StarterStichrundenWertungModel w = mapper.readValue(getClass().getResourceAsStream("stichrunde.json"), StarterStichrundenWertungModel.class);
        assertThat(w).isNotNull();
        assertThat(w.getStichrunde()).isEqualTo(0);
        assertThat(w.getWertung()).isNotNull();
        assertThat(w.getWertung().getTaenze()).hasSize(2);

        List<List<Number>> expected = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5, 77.0, 88.0),
                Arrays.asList(6, 7, 8, 9, 10, 99.5, 11.5)
        );

        w.getWertung().getTaenze().forEach(it -> {
            List<Number> e = expected.get(w.getWertung().getTaenze().indexOf(it));
            assertThat(it.getWertungen()).isEqualTo(e.subList(0, 5));
            assertThat(it.getPlatzzifferTanz()).isEqualTo(e.get(5));
            assertThat(it.getPlatzzifferSumme()).isEqualTo(e.get(6));
        });
    }
}
