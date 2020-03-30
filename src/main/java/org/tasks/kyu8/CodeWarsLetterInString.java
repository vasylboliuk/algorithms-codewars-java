package org.tasks.kyu8;

/**
 * kata8. Task All Star Code Challenge #18
 * https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
 */
public class CodeWarsLetterInString {

    public static int strCount(String str, char letter) {
        int count = 0;

        for(int i=0; i<str.toCharArray().length; i++){
            char ch = str.charAt(i);
            if(ch == letter){
                count++;
            }

        }
        return count;
    }
}
