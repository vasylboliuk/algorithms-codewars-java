package org.tasks.kyu7;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class CompareStringsBySumOfChars {

    /**
     * Description:
     Compare two strings by comparing the sum of their values (ASCII character code).
     For comparing treat all letters as UpperCase.

     Null-Strings should be treated as if they are empty strings.
     If the string contains other characters than letters, treat the whole string as it would be empty.

     Examples:
     "AD","BC" -> equal
     "AD","DD" -> not equal
     "gf","FG" -> equal
     "zz1","" -> equal
     "ZzZz", "ffPFF" -> equal
     "kl", "lz" -> not equal
     null, "" -> equal

     Your method should return true, if the strings are equal and false if they are not equal.
     */
    public static Boolean compare(String s1, String s2)
    {
        int sumS1 = 0;
        int sumS2 = 0;

        if(s1==null || !s1.matches("[a-zA-Z]+")) s1 = "";
        if(s2==null || !s2.matches("[a-zA-Z]+")) s2 = "";

        if(!s1.isEmpty()){
            for(char ch : s1.toUpperCase().toCharArray()){
                int ascii = (int) ch;
                sumS1 = sumS1+ascii;
            }
        }
        if(!s2.isEmpty()){
            for(char ch : s2.toUpperCase().toCharArray()){
                int ascii = (int) ch;
                sumS2 = sumS2+ascii;
            }
        }
        return sumS1==sumS2;
    }
}
