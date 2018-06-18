package de.tanzsport.esv.api.v1.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.tanzsport.esv.api.v1.model.ergebnis.PlatzWertungModel;
import de.tanzsport.esv.api.v1.model.ergebnis.PlatzWertungTanzModel;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlatzWertungModelDeserializer extends StdDeserializer<PlatzWertungModel> {

    public PlatzWertungModelDeserializer() {
        super(PlatzWertungModel.class);
    }

    @Override
    public PlatzWertungModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (p.currentToken().equals(JsonToken.VALUE_NULL)) {
            return null;
        }
        else if (p.currentToken().equals(JsonToken.START_ARRAY)) {
            final List<?> values = Arrays.asList(p.readValueAs(Object[].class));

            if (values.isEmpty()) {
                throw new JsonParseException(p, "Array mit Wertungen enthält keine Werte.");
            }

            try {
                return new PlatzWertungModel(readPlatzwertungenTaenze(values));
            }
            catch (RuntimeException e) {
                throw new JsonParseException(p, e.getMessage());
            }
        }
        else {
            throw new JsonParseException(p, "Array mit Wertungen darf nur null, eine Zahl oder ein Array enthalten.");
        }
    }

    List<PlatzWertungTanzModel> readPlatzwertungenTaenze(final List<?> values) {
        return values.stream()
                .map(tanz -> {
                    if (!(tanz instanceof List)) {
                        throw new RuntimeException("Platzwertungen müssen als Liste vorliegen.");
                    }

                    final List<?> raw = (List) tanz;
                    raw.forEach(wertung -> {
                        if (wertung == null || !Number.class.isAssignableFrom(wertung.getClass())) {
                            throw new RuntimeException("Platzwertungen dürfen nur Zahlen enthalten.");
                        }
                    });

                    final List<Number> wertungen = raw.stream().map(w -> (Number) w).collect(Collectors.toList());
                    return new PlatzWertungTanzModel(wertungen.subList(0, wertungen.size() - 2),
                            wertungen.get(wertungen.size() - 2), wertungen.get(wertungen.size() - 1));
                })
                .collect(Collectors.toList());
    }
}
