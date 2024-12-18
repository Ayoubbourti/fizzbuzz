package nombres;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicRomanNumeralstest {

        @Test
        public void convert_1_into_I() {

            int i = 1;
            String expected = "I";
            ArabicRomanNumerals converter = new ArabicRomanNumerals();
            String result = converter.convert(i);
            assertThat(result).isEqualTo(expected);
        }

}
