package testsKuy7;
import kyu7.NumbersWithThisDigitInside;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestNumbersWithThisDigitInside {
    @Test
    public void BasicTests() {
        assertArrayEquals(new long[] { 0, 0, 0 }, NumbersWithThisDigitInside.NumbersWithDigitInside(5, 6));
        assertArrayEquals(new long[] { 1, 6, 6 }, NumbersWithThisDigitInside.NumbersWithDigitInside(7, 6));
        assertArrayEquals(new long[] { 3, 22, 110 }, NumbersWithThisDigitInside.NumbersWithDigitInside(11, 1));
        assertArrayEquals(new long[] { 2, 30, 200 }, NumbersWithThisDigitInside.NumbersWithDigitInside(20, 0));
        assertArrayEquals(new long[] { 9, 286, 5955146588160L }, NumbersWithThisDigitInside.NumbersWithDigitInside(44, 4));
    }

    /*@Test
    public void RandomTests() {
        for(int r = 0; r < 40; r++)
        {
            long x = (long)Math.floor(Math.random() * 49 + 1);

            long d = (long)Math.floor(Math.random() * 8 + 1);

            long[] expected = null;

            // Solution
            List<Long> numbers = new ArrayList<Long>();

            for(long i=1;i<=x;i++)
            {
                if((i + "").contains(d + ""))
                {
                    numbers.add(i);
                }
            }
            if(numbers.size() == 0)
            {
                expected = new long[] { 0, 0, 0 };
            }
            else
            {
               expected = new long[] {
                        numbers.size(),
                        numbers.stream().mapToLong(Long::longValue).sum(),
                        numbers.stream().mapToLong(Long::longValue).reduce(
                                1,
                                (a, b) -> a * b)
                };
            }
            assertArrayEquals("Should work for x=" + x + ", d=" + d, expected, NumbersWithThisDigitInside.NumbersWithDigitInside(x, d));
        }
    }*/
}
