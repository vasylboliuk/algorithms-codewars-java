package kyu7;


import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import org.testng.annotations.Test;


/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestPokerhandStraightOrNot {
    @Test
    public void test1IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(2);
        hand.add(3);
        hand.add(4);
        hand.add(5);
        hand.add(6);
        assertTrue("2, 3, 4, 5, 6", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test2IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(14);
        hand.add(5);
        hand.add(4);
        hand.add(2);
        hand.add(3);
        assertTrue("14, 5, 4 ,2, 3", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test3IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(2);
        hand.add(3);
        assertFalse("2, 3", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test4IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(7);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        assertFalse("7, 7, 12 ,11, 3, 4, 14", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test5IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(2);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        assertFalse("2, 7, 12 ,11, 3, 4, 14", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test6IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(10);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(13);
        hand.add(4);
        hand.add(14);
        assertTrue("10, 7, 12 ,11, 13, 4, 14", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test7IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(10);
        hand.add(14);
        hand.add(14);
        hand.add(13);
        hand.add(12);
        hand.add(10);
        hand.add(11);
        assertTrue("10, 14, 14 ,13, 12, 10, 11", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test8IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(2);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(10);
        hand.add(13);
        hand.add(14);
        assertTrue("2, 7, 12 ,11, 10, 13, 14", PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void test9IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(3);
        hand.add(4);
        hand.add(5);
        hand.add(6);
        hand.add(8);
        hand.add(9);
        hand.add(10);
        assertFalse(PokerhandStraightOrNot.IsStraight(hand));
    }

    @Test
    public void testIsStraightAllVariationsrRandomized() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        for(int i = 1; i < 11; i++) {
            hand.add(i == 1 ? 14 : i);
            for (int j = i+1; j < i+5; j++) {
                hand.add(j);
            }
            hand.add(ThreadLocalRandom.current().nextInt(2, 15));
            hand.add(ThreadLocalRandom.current().nextInt(2, 15));
            Collections.shuffle(hand);
            assertTrue(String.join(", ", hand.toString()), PokerhandStraightOrNot.IsStraight(hand));
        }
    }

}
