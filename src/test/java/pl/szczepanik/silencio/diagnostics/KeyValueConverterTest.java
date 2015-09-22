package pl.szczepanik.silencio.diagnostics;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.szczepanik.silencio.api.Converter;
import pl.szczepanik.silencio.core.Key;
import pl.szczepanik.silencio.core.Value;

public class KeyValueConverterTest {

    @Test
    public void shouldReturnCorrectValue() {

        // given
        Value value = new Value("someValue");
        Key key = new Key("someKey");
        Converter converter = new KeyValueConverter();

        // when
        Value outputValue = converter.convert(key, value);

        // then
        assertThat(outputValue.getValue()).isEqualTo(key.getKey());
    }
}
