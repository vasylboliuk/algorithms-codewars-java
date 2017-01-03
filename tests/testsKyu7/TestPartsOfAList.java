package testsKyu7;
import static org.junit.Assert.*;
import java.util.Arrays;
import kyu7.PartsOfAList;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

/**
 * Created by vboliuk on 30.12.2016.
 */
public class TestPartsOfAList {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    private static int randInt(int min, int max) {
        return (int)(min + Math.random() * ((max - min) + 1));
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests partlist");
        String[] s1 = new String[] {"cdIw", "tzIy", "xDu", "rThG"};
        String a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[] {"I", "wish", "I", "hadn't", "come"};
        a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[] {"vJQ", "anj", "mQDq", "sOZ"};
        a = "[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[] {"mkC", "WoiP", "pCHh", "mkv"};
        a = "[[mkC, WoiP pCHh mkv], [mkC WoiP, pCHh mkv], [mkC WoiP pCHh, mkv]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[] {"vHW", "bPq", "pme", "jJr", "HGHV"};
        a = "[[vHW, bPq pme jJr HGHV], [vHW bPq, pme jJr HGHV], [vHW bPq pme, jJr HGHV], [vHW bPq pme jJr, HGHV]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[] {"YZd", "ptUD", "IXr"};
        a = "[[YZd, ptUD IXr], [YZd ptUD, IXr]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[] {"UQB", "aIfC", "eVB", "aCL", "bWoU"};
        a = "[[UQB, aIfC eVB aCL bWoU], [UQB aIfC, eVB aCL bWoU], [UQB aIfC eVB, aCL bWoU], [UQB aIfC eVB aCL, bWoU]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);
    }
    //...................
    private static String[][] partlistSol(String[] arr) {
        String[][] bigres = new String[arr.length - 1][2];
        int i = 0;
        while (i < arr.length - 1) {
            String[] res = new String[2];
            String s = "";
            for (int u = 0; u < i + 1; u++)
                s += arr[u] + " ";
            res[0] = s.trim();
            s = "";
            for (int u = i+1; u < arr.length; u++)
                s += arr[u] + " ";
            res[1] = s.trim();
            bigres[i] = res;
            i++;
        }
        return bigres;
    }
    //...................
    private static String[] doEx(int k) {
        int j = 0; String[] res = new String[k]; int u = randInt(3, 7);
        while (j < k) {
            String s = ""; int i = 0;
            while (i < u) {
                if (randInt(0, 100) % 2 == 0) s += (char)randInt(97, 122);
                else s += (char)randInt(65, 90);
                i++;
            }
            res[j] = s;
            j += 1;
        }
        return res;
    }
    @Test
    public void test1() {
        System.out.println("Random Tests **** partlist");
        for (int i = 0; i < 200; i++) {
            int k = randInt(6, 12);
            String[] s1 = doEx(k);
            String ans = Arrays.deepToString(partlistSol(s1));
            //System.out.println(ans);
            testing(Arrays.deepToString(PartsOfAList.partlist(s1)), ans);
        }
    }
}
