package testsKyu6;

import kyu6.TheSupermarketQueue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dell on 12/26/2016.
 */

public class TestTheSupermarketQueue {

    @Test()
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(22, TheSupermarketQueue.solveSuperMarketQueue(new int[]{4,7,7,5,6,5,7,4,2,1,1,4,7,6,7,6,3,1,6,3}, 5));
        assertEquals(13, TheSupermarketQueue.solveSuperMarketQueue(new int[]{3,2,3,4,2,7,2,4,5,5,5}, 4));
        assertEquals(9, TheSupermarketQueue.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
        assertEquals(15, TheSupermarketQueue.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
        assertEquals(0, TheSupermarketQueue.solveSuperMarketQueue(new int[]{}, 1));
        assertEquals(5, TheSupermarketQueue.solveSuperMarketQueue(new int[]{2, 2, 2, 3, 3, 3}, 3));
        assertEquals(5, TheSupermarketQueue.solveSuperMarketQueue(new int[]{2,1,4,5}, 5));
    }


}
