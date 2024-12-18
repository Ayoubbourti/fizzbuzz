package nbromain;
import com.pantxi.nbromain.RomanConverter;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class RomanConvetertest {

    @Test
    public void convert_1_into_I() {

        int i = 1;
        String expected = "I";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void convert_2_into_II() {

        int i = 2;
        String expected = "II";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_3_into_III() {

        int i = 3;
        String expected = "III";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_10_into_X() {

        int i = 10;
        String expected = "X";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_20_into_XX() {

        int i = 20;
        String expected = "XX";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_30_into_XXX() {

        int i = 30;
        String expected = "XXX";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_11_into_XI() {

        int i = 11;
        String expected = "XI";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_5_into_V() {

        int i = 5;
        String expected = "VSSS";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_4_into_IV() {

        int i =4 ;
        String expected = "IV";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_9_into_IX() {

        int i =9 ;
        String expected = "IX";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_40_into_XL() {

        int i =40;
        String expected = "XL";
        RomanConverter converter = new RomanConverter();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }




}

