package org.tasks.kyu7;

import java.util.Arrays;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class PartsOfAList {

    /**
     * Description:
     Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
     Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
     Each part will be in a string
     Elements of a pair must be in the same order as in the original array.
     Example:
     a = ["az", "toto", "picaro", "zone", "kiwi"] -->
     [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
     or
     a = {"az", "toto", "picaro", "zone", "kiwi"} -->
     {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}
     or
     a = ["az", "toto", "picaro", "zone", "kiwi"] -->
     [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
     or
     a = [|"az", "toto", "picaro", "zone", "kiwi"|] -->
     [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
     You can see other examples for each language in "Your test cases"
     */
    public static String[][] partlist(String[] arr) {

        String part1 = "";
        String part2 = "";

        String[][] doubleList = new String[arr.length-1][1];
        String[] listStr = new String[1];

        for(int i=0; i<arr.length; i++) {

            part2 = "";
            part1 = part1 + arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                part2 = part2 + arr[j] + " ";
            }
            part1 = part1.trim();
            part2 = part2.trim();
            listStr[0] = part1 + ", " + part2;
            part1 = part1 + " ";
            if(i!=arr.length-1){
                doubleList[i][0] = listStr[0];
            }

            System.out.println("Part1: " + part1);
            System.out.println("Part2: " + part2);
        }
        return doubleList;
    }

    public static String[][] partlist2(String[] arr) {
        String[][] returnArray = new String[arr.length-1][2];
        for(int i = 0; i < arr.length-1; ++i) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i+1, arr.length));
        }
        return returnArray;
    }
}
