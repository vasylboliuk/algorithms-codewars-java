package org.tasks.kyu7;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class Spacify {

    /**
     * Description:
     Modify the spacify function so that it returns the given string with spaces between each letter. In this exercise, you can assume that only strings will be passed to your function.
     spacify('hello world') // h e l l o  w o r l d
     */
    public static String spacify(String str){
        char[] list = str.toCharArray();
        String s = "";
        for(int i=0; i<list.length; i++){
            if(i==list.length-1){
                s = s + list[i];
            }else{s = s + list[i] + " ";}
        }
        return s;
    }
}
