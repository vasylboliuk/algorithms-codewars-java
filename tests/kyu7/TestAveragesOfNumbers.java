package kyu7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;


/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestAveragesOfNumbers {

    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(AveragesOfNumbers.averages(new int[] { 2, 2, 2, 2, 2 })));
        assertEquals(Arrays.toString(new double[] { 0, 0, 0, 0 }), Arrays.toString(AveragesOfNumbers.averages(new int[] { 2, -2, 2, -2, 2 })));
        assertEquals(Arrays.toString(new double[] { 2, 4, 3, -4.5 }), Arrays.toString(AveragesOfNumbers.averages(new int[] { 1, 3, 5, 1, -10 })));
    }

    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array", 0, AveragesOfNumbers.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, AveragesOfNumbers.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array", 0, AveragesOfNumbers.averages(new int[] { 2 }).length);
    }

    @Test
    public void randomTests() {

        for(int r = 0; r < 100; r++)
        {
            int len = (int)Math.floor(Math.random() * 20);
            int[] numbers = new int[len];
            for(int k = 0; k < len; k++)
            {
                numbers[k] = (int)Math.floor(Math.random() * 41) - 20;
            }

            double[] expected = new double[0];

            if(numbers.length > 1)
            {
                expected = new double[numbers.length - 1];
                for(int i=0;i<numbers.length-1;i++)
                {
                    expected[i] = ((double)numbers[i] + numbers[i+1]) / 2;
                }
            }

            assertArrayEquals("Should work for random input", expected, AveragesOfNumbers.averages(numbers), 0.001);
        }
    }
}
