package testsKuy6;
import kyu6.DecodeTheMorseCode;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by vboliuk on 03.01.2017.
 */
public class TestDecodeTheMorseCode {

    @Test
    public void testExampleFromDescription() {
        assertThat(DecodeTheMorseCode.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
        assertThat(DecodeTheMorseCode.decode("... --- ..."), is("SOS"));
        assertThat(DecodeTheMorseCode.decode("...---..."), is(""));

    }
}
