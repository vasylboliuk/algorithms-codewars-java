package org.tasks.kyu7;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class CountTheCharacters {

    /**
     * Description:
     The goal of this kata is to write a function that takes two inputs: a string and a character. The function will count the number of times that character appears in the string. The count is case insensitive.
     For example:
     The character can be any alphanumeric character.
     Good luck.
     */
    public static int charCount(String str, char c) {
        char[] list = str.toLowerCase().toCharArray();
        int count = 0;
        c = Character.toLowerCase(c);
        for(char ch : list){
            if(ch==c) {count++;}
        }
        return count;
    }
}
