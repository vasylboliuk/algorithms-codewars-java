package testsKyu7;
import kyu7.ShowMultiplesOf2NumbersWithinARange;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;


/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestShowMultiplesOf2NumbersWithinARange {
    @Test
    public void testSomeValues14() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(2,4,40);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16, 20, 24, 28, 32, 36));
        System.out.println(list1+"\n"+list2);
        assertEquals(true, list2.equals(list1));
    }
    @Test
    public void testSomeValues() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(5,13,800);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780));
        System.out.println(list1+"\n"+list2);
        assertEquals(true, list2.equals(list1));
    }
    @Test
    public void testSomeValues2() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(27,29,2000);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(783, 1566));
        System.out.println(list1+"\n"+list2);
        assertEquals(true, list2.equals(list1));
    }
    @Test
    public void testSomeValues3() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(20,16,1000);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(80, 160, 240, 320, 400, 480, 560, 640, 720, 800, 880, 960));
        System.out.println(list1+"\n"+list2);
        assertEquals(true, list2.equals(list1));
    }
    @Test
    public void testSomeValues4() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(7,16,1000);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(112, 224, 336, 448, 560, 672, 784, 896));
        System.out.println(list1+"\n"+list2);
        assertEquals(true, list2.equals(list1));
    }
    public static List<Integer> myfindMultiples(int s1, int s2, int s3) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=2;i<s3;i++){
            if((i%s1==0) && (i%s2==0)){
                arr.add(i);
            }
        }
        return arr;
    }
    @Test
    public void testRandomValues() {
        Random rand = new Random();
        for(int i=0;i<40;i++){
            int s1 = rand.nextInt(48) + 2;
            int s2 = rand.nextInt(48) + 2;
            int s3 = rand.nextInt(4000) + 10;
            List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(s1,s1,s3);
            List<Integer> list2 = myfindMultiples(s1,s1,s3);
            System.out.println("random values: "+s1+" "+s2+" "+s3);
            assertEquals(true, list2.equals(list1));}
    }

}
