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
        @Test
        public void convert_2_into_II() {

            int i = 2;
            String expected = "II";
            ArabicRomanNumerals converter = new ArabicRomanNumerals();
            String result = converter.convert(i);
            assertThat(result).isEqualTo(expected);
        }
    @Test
    public void convert_3_into_III() {

        int i = 3;
        String expected = "III";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_10_into_X() {

        int i = 10;
        String expected = "X";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_20_into_XX() {

        int i = 20;
        String expected = "XX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_300_into_XXX() {

        int i = 30;
        String expected = "XXX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_30_into_XXX() {

        int i = 30;
        String expected = "XXX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_11_into_XI() {

        int i = 11;
        String expected = "XI";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_12_into_XII() {

        int i = 12;
        String expected = "XII";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_13_into_XIII() {

        int i = 13;
        String expected = "XIII";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_5_into_V() {

        int i = 5;
        String expected = "V";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_4_into_IV() {

        int i = 4;
        String expected = "IV";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_9_into_IX() {

        int i = 9;
        String expected = "IX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_40_into_LX() {

        int i = 40;
        String expected = "LX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_45_into_XLV() {

        int i = 45;
        String expected = "XLV";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_49_into_XLIX() {

        int i = 49;
        String expected = "XLIX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_50_into_L() {

        int i = 50;
        String expected = "L";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

}
