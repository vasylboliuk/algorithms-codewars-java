package org.tasks.kyu7;


import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import org.testng.annotations.Test;


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

}
