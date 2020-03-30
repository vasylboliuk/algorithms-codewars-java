package org.tasks.kyu7;


import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import org.testng.annotations.Test;

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

}
