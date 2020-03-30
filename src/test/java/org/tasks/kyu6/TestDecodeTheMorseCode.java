package org.tasks.kyu6;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * Created by vboliuk on 03.01.2017.
 */
public class TestDecodeTheMorseCode {

    @Test
    public void testExampleFromDescription() {
        Assertions.assertThat(DecodeTheMorseCode.decode(".... . -.--   .--- ..- -.. ."))
            .isEqualTo("HEY JUDE");
        Assertions.assertThat(DecodeTheMorseCode.decode("... --- ..."))
            .isEqualTo("SOS");
        Assertions.assertThat(DecodeTheMorseCode.decode("...---..."))
            .isEqualTo("");

    }
}
