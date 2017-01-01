package testsKuy7;
import kyu7.DontGiveMeFive;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestDontGiveMeFive {

    @Test
    public void exampleTests() {
        assertEquals(8, DontGiveMeFive.dontGiveMeFive(1,9));
        assertEquals(12, DontGiveMeFive.dontGiveMeFive(4,17));
    }

    @Test
    public void moreTests() {
        assertEquals(72, DontGiveMeFive.dontGiveMeFive(1,90));
        assertEquals(20, DontGiveMeFive.dontGiveMeFive(-4,17));
        assertEquals(38, DontGiveMeFive.dontGiveMeFive(-4,37));
        assertEquals(13, DontGiveMeFive.dontGiveMeFive(-14,-1));
        assertEquals(9, DontGiveMeFive.dontGiveMeFive(-14,-6));
    }

    @Test
    public void randomTests() {

        for(int r=0;r<30;r++)
        {
            int start = (int)(Math.random() * 110) - 50;
            int end = (int)(Math.random() * (80 - start - 1)) + start + 1;

            int expectedCount = 0;
            for(int i=start;i<=end;i++)
            {
                if(!(i + "").contains("5"))
                {
                    expectedCount++;
                }
            }

            assertEquals(expectedCount, DontGiveMeFive.dontGiveMeFive(start, end));
        }
    }
}
