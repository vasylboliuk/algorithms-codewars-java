package org.tasks.kyu7;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class HowManyTimesDoesItContain {

    /**
     * Description:

     Your task is to return how many times a string contains a given character.

     The function takes a string(inputS) as a paremeter and a char(charS) which is the character that you will have to find and count.

     For example, if you get an input string "Hello world" and the character to find is "o", return 2.
     */
    public static int stringCounter(String inputS, char charS){
        int count = 0;
        char[] list = inputS.toCharArray();
        for( char s : list){
            if(s==charS) count++;
        }
        return count;
    }
}
