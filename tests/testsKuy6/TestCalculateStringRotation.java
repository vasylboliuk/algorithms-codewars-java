package testsKuy6;
import kyu6.CalculateStringRotation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

/**
 * Created by Dell on 1/2/2017.
 */
public class TestCalculateStringRotation {

    @Test
    public void test() {
        assertEquals(-1, CalculateStringRotation.shiftedDiff("hoop","pooh"));
        assertEquals(2, CalculateStringRotation.shiftedDiff("coffee", "eecoff"));
        assertEquals(4, CalculateStringRotation.shiftedDiff("eecoff","coffee"));
    }
}
