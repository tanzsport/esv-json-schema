package de.tanzsport.esv.api.v1.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.tanzsport.esv.api.v1.model.ergebnis.JudgingSystemWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.KreuzWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.KreuzWertungWrModel;
import de.tanzsport.esv.api.v1.model.ergebnis.PlatzWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.WertungModel;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WertungModelDeserializer extends StdDeserializer<WertungModel> {

    private PlatzWertungModelDeserializer platzWertungModelDeserializer = new PlatzWertungModelDeserializer();

    public WertungModelDeserializer() {
        super(WertungModel.class);
    }

    @Override
    public WertungModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (p.currentToken().equals(JsonToken.VALUE_NULL)) {
            return null;
        }
        else if (p.currentToken().equals(JsonToken.VALUE_NUMBER_INT)) {
            return new JudgingSystemWertungModel(p.getIntValue());
        }
        else if (p.currentToken().equals(JsonToken.VALUE_NUMBER_FLOAT)) {
            return new JudgingSystemWertungModel(p.getFloatValue());
        }
        else if (p.currentToken().equals(JsonToken.START_ARRAY)) {
            final List<?> values = Arrays.asList(p.readValueAs(Object[].class));

            if (values.isEmpty()) {
                throw new JsonParseException(p, "Array mit Wertungen enthält keine Werte.");
            }

            final Object lastValue = values.get(values.size() - 1);
            if (lastValue != null && Number.class.isAssignableFrom(lastValue.getClass())) {
                final Number lastNumber = (Number) lastValue;
                // Support für fehlerhafte Uploads
                // -------------------------------
                // Es gibt fehlerhafte Uploads aus den Anfangszeiten der ESV, in der die JS-Score nicht als einzelne
                // Zahl sondern als Array mit einem Element übertragen wurde. Dies entspricht nicht dem JSON-
                // Schema, wird hier aber unterstützt.
                if (values.size() == 1) {
                    return new JudgingSystemWertungModel(lastNumber);
                }
                else {
                    try {
                        return new KreuzWertungModel(readKreuzwertungWr(values), lastNumber);
                    }
                    catch (RuntimeException e) {
                        throw new JsonParseException(p, e.getMessage());
                    }
                }
            }
            else {
                try {
                    return new PlatzWertungModel(platzWertungModelDeserializer.readPlatzwertungenTaenze(values));
                }
                catch (RuntimeException e) {
                    throw new JsonParseException(p, e.getMessage());
                }
            }
        }
        else {
            throw new JsonParseException(p, "Array mit Wertungen darf nur null, eine Zahl oder ein Array enthalten.");
        }
    }

    private List<KreuzWertungWrModel> readKreuzwertungWr(final List<?> values) {
        return values.subList(0, values.size() - 1).stream()
                .map(wr -> {
                    if (!(wr instanceof List)) {
                        throw new RuntimeException("Kreuzwertungen müssen als Liste vorliegen.");
                    }

                    final List<?> raw = (List) wr;
                    raw.forEach(wertung -> {
                        if (wertung != null && !Number.class.isAssignableFrom(wertung.getClass())) {
                            throw new RuntimeException("Kreuzwertungen dürfen nur null und Zahlen enthalten.");
                        }
                    });

                    final List<Number> wertungen = raw.stream().map(w -> (Number) w).collect(Collectors.toList());
                    return new KreuzWertungWrModel(wertungen.subList(0, wertungen.size() - 1),
                            wertungen.get(wertungen.size() - 1));
                })
                .collect(Collectors.toList());
    }
}
