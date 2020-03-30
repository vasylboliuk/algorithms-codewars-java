package org.tasks.kyu7;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Created by Dell on 12/31/2016.
 */
public class TestUnflattenAList {

    @Test
    public void basicTests() {

        int[] input = new int[] { 1, 4, 5, 2, 1, 2, 4, 5, 2, 6, 2, 3, 3 };
        Object[] expected = new Object[] { 1, new int[] { 4,5,2,1 }, 2, new int[] { 4,5,2,6 }, 2, new int[] { 3, 3 } };
        assertEquals(expected, UnflattenAList.unflatten(input));

        input = new int[] { 3, 5, 2, 1 };
        expected = new Object[] { new int[] { 3,5,2 }, 1 };
        assertEquals(expected, UnflattenAList.unflatten(input));



    }
}
