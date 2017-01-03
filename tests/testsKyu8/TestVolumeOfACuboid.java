package testsKyu8;
import kyu8.VolumeOfACuboid;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestVolumeOfACuboid {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, VolumeOfACuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfACuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }

    @Test
    public void other() {
        // assertEquals("expected", "actual");
        assertEquals(60, VolumeOfACuboid.getVolumeOfCuboid(2, 5, 6), delta);
        assertEquals(94.5, VolumeOfACuboid.getVolumeOfCuboid(6.3, 3, 5), delta);
    }

    @Test
    public void random() {
        final Random rand = new Random();
        for (int r=0; r<10; r++) {
            final double l = rand.nextDouble() * 100.;
            final double w = rand.nextDouble() * 100.;
            final double h = rand.nextDouble() * 100.;
            //System.out.println(String.format("length=%f, width=%f, height=%f", l, w, h));
            assertEquals(l*w*h, VolumeOfACuboid.getVolumeOfCuboid(l, w, h), delta);
        }
    }
}
