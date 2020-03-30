package org.tasks.kyu7;

import java.util.List;

/**
 * kata7. All Inclusive?
 * https://www.codewars.com/kata/5700c9acc1555755be00027e/java
 */
public class AllInclusive {

    public static boolean containAllRots(String strng, List<String> arr) {
        if(strng.isEmpty()) {return true;}
        int countOfStrInArray = 0;
        int stringSize = strng.length();
        for(int i=0; i < strng.length(); i++){

            String part1 = strng.substring(0, 1); // first character in string
            String part2 = strng.substring(1); // part without first character
            strng = part2 + part1; // create new str
            if(arr.contains(strng)){ countOfStrInArray++; }
        }
        return countOfStrInArray == stringSize;
    }



    public static void main(String[] args) {
        String result = "dkta";

        for(int i=0; i < result.toCharArray().length; i++){

            String part1 = result.substring(0, 1); // first character in string
            String part2 = result.substring(1); // part without first character
            result = part2 + part1; // create new str


        }

    }

}
