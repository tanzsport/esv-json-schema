package de.tanzsport.esv.api.v1.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import de.tanzsport.esv.api.v1.model.ergebnis.JudgingSystemWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.KreuzWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.PlatzWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.WertungModel;
import de.tanzsport.esv.api.v1.model.WertungsTyp;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class WertungDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void before() {
        mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(WertungModel.class, new WertungModelDeserializer());
        mapper.registerModule(module);
    }

    @Test
    public void deserializesNull() throws Exception {
        WertungModel w = mapper.readValue("null", WertungModel.class);
        assertThat(w).isNull();
    }

    @Test
    public void deserializesJudgingSystem() throws Exception {
        WertungModel w = mapper.readValue("1.2", WertungModel.class);
        assertThat(w).isNotNull();
        assertThat(w.getTyp()).isEqualTo(WertungsTyp.JS);
        assertThat(w).isInstanceOf(JudgingSystemWertungModel.class);
    }

    @Test
    public void deserializesKreuzWertungMitEinzelwertung() throws Exception {
        WertungModel w = mapper.readValue(getClass().getResourceAsStream("vr-einzelkreuze.json"), WertungModel.class);
        assertThat(w).isNotNull();
        assertThat(w.getTyp()).isEqualTo(WertungsTyp.KREUZ);
        assertThat(w).isInstanceOf(KreuzWertungModel.class);

        KreuzWertungModel kw = (KreuzWertungModel) w;
        assertThat(kw.getSumme()).isEqualTo(6);
        assertThat(kw.getWertungsrichter()).hasSize(3);
        List<List<Number>> expected = Arrays.asList(
                Arrays.asList(1, 0, 0),
                Arrays.asList(1, 1, 0),
                Arrays.asList(1, 1, 1)
        );
        kw.getWertungsrichter().forEach(it -> {
            assertThat(it.getEinzelwertungen()).isEqualTo(expected.get(kw.getWertungsrichter().indexOf(it)));
            assertThat(it.getSumme()).isEqualTo(kw.getWertungsrichter().indexOf(it) + 1);
        });
    }

    @Test
    public void deserializesKreuzWertungOhneEinzelwertung() throws Exception {
        WertungModel w = mapper.readValue(getClass().getResourceAsStream("vr-summen.json"), WertungModel.class);
        assertThat(w).isNotNull();
        assertThat(w.getTyp()).isEqualTo(WertungsTyp.KREUZ);
        assertThat(w).isInstanceOf(KreuzWertungModel.class);

        KreuzWertungModel kw = (KreuzWertungModel) w;
        assertThat(kw.getSumme()).isEqualTo(6);
        assertThat(kw.getWertungsrichter()).hasSize(3);
        kw.getWertungsrichter().forEach(it -> {
            assertThat(it.getEinzelwertungen()).containsExactly(null, null, null);
            assertThat(it.getSumme()).isEqualTo(kw.getWertungsrichter().indexOf(it) + 1);
        });
    }

    @Test
    public void deserializesEndrunde() throws Exception {
        WertungModel w = mapper.readValue(getClass().getResourceAsStream("er.json"), WertungModel.class);
        assertThat(w).isNotNull();
        assertThat(w.getTyp()).isEqualTo(WertungsTyp.PLATZ);
        assertThat(w).isInstanceOf(PlatzWertungModel.class);

        List<List<Number>> expected = Arrays.asList(
                Arrays.asList(1, 1, 1, 1, 1),
                Arrays.asList(2, 2, 2, 2, 3),
                Arrays.asList(3, 3, 3, 3, 6)
        );
        PlatzWertungModel pw = (PlatzWertungModel) w;
        assertThat(pw.getTaenze()).hasSize(3);
        pw.getTaenze().forEach(it -> {
            List<Number> e = expected.get(pw.getTaenze().indexOf(it));
            assertThat(it.getWertungen()).isEqualTo(e.subList(0, 3));
            assertThat(it.getPlatzzifferTanz()).isEqualTo(e.get(3));
            assertThat(it.getPlatzzifferSumme()).isEqualTo(e.get(4));
        });
    }

    @Test
    public void deserializesTestPojo() throws Exception {
        TestPojoWertungen o = mapper.readValue(getClass().getResourceAsStream("test-pojo.json"), TestPojoWertungen.class);
        assertThat(o).isNotNull();
        assertThat(o.getWertungen()).isNotNull();
        assertThat(o.getWertungen()).hasSize(4);
        assertThat(o.getWertungen().get(0)).isNotNull();
        assertThat(o.getWertungen().get(0)).isInstanceOf(KreuzWertungModel.class);
        assertThat(o.getWertungen().get(1)).isNull();
        assertThat(o.getWertungen().get(2)).isNotNull();
        assertThat(o.getWertungen().get(2)).isInstanceOf(JudgingSystemWertungModel.class);
        assertThat(o.getWertungen().get(3)).isNotNull();
        assertThat(o.getWertungen().get(3)).isInstanceOf(PlatzWertungModel.class);
    }
}
