package kyu6;



import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

/**
 * Created by Dell on 1/2/2017.
 */
public class TestCalculateStringRotation {

    @Test
    public void test() {
        assertThat(-1).isEqualTo(CalculateStringRotation.shiftedDiff("hoop","pooh"));
        assertThat(2).isEqualTo(CalculateStringRotation.shiftedDiff("coffee","eecoff"));
        assertThat(4).isEqualTo(CalculateStringRotation.shiftedDiff("eecoff","coffee"));
    }
}
