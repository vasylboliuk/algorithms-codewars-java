package org.tasks.kyu7;
import java.util.*;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class ShowMultiplesOf2NumbersWithinARange {

    /**
     * Description:
     print all numbers up to 3rd parameter which are multiple of both 1st and 2nd parameter.
     Python, Javascript, Java versions: return results in a list/array

     NOTICE:
     Do NOT worry about checking zeros or negative values.
     To find out if 3rd parameter (the upper limit) is inclusive or not, check the tests, it differs in each translation
     */
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> arr = new ArrayList<Integer>();

        for(int i=1;i<s3;i++) {
            if( (i%s1 == 0) && (i%s2 == 0)) {
                arr.add(i);
            }
        }
        return arr;
        }
}
