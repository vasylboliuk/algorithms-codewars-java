package org.tasks.kyu6;

import java.util.HashMap;
import java.util.Map;



/**
 * Created by vboliuk on 03.01.2017.
 */
public class DecodeTheMorseCode {

    /**
     In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superceded
     by voice and digital data communication channels, it still has its use in some applications around the world.
     The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−.
     The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to
     separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−− ·−−− ··− −·· ·.
     NOTE: Extra spaces before or after the code have no meaning and should be ignored.
     In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS
     (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.
     Your task is to implement a function decodeMorse(morseCode), that would take the morse code as input and return a decoded human-readable string.

     For example:
     MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
     //should return "HEY JUDE"
     The Morse code table is preloaded for you as a dictionary, feel free to use it. In CoffeeScript, C++, JavaScript, PHP, Python, Ruby and TypeScript, the table can be accessed like this: MORSE_CODE['.--'], in Java it is MorseCode.get('.--'), in C# it is MorseCode.Get('.--'), in Haskell the codes are in a Map String String and can be accessed like this: morseCodes ! ".--".
     All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions. In C#, tests will fail if the solution code throws an exception, please keep that in mind. This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.
     Good luck!
     *
     */
    public static String decode(String morseCode) {

        Map<String, String> MorseCode = getMorseCodeDict();

        String result = "";
        morseCode = morseCode.replaceAll("   ", "@");
        String[] list = morseCode.split("@");

        for(String str: list){
            String[] wordList = str.split(" ");
            for(String s: wordList){
                if(MorseCode.get(s)==null){
                    result = result;
                }
                else if(MorseCode.get(s).matches("[a-zA-Z]+")){
                    result = result + MorseCode.get(s).toUpperCase();
                }
                else{
                    result = result + MorseCode.get(s);
                }
            }
            result = result + " ";
        }
        return result.trim();
    }

    //Solution from CodeWars
    public static String decode3(String morseCode) {

        Map<String, String> MorseCode = getMorseCodeDict();

        String[] words = morseCode.trim().split("   ");
        StringBuilder sb = new StringBuilder();
        for (String word: words){
            String[] scode = word.split(" ");
            for (String sc: scode){
                sb.append(MorseCode.get(sc));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    //Solution from CodeWars
    public static String decode2(String morseCode) {

        Map<String, String> MorseCode = getMorseCodeDict();

        String result = "";
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
                result += MorseCode.get(letter);
            }
            result += ' ';
        }
        return result.trim();
    }

    private static Map<String, String> getMorseCodeDict(){
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--..", " " };
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", " "};

        Map<String, String> MorseCode = new HashMap<>();
        for(int i=0; i<morse.length; i++){
            MorseCode.put(morse[i], alphabet[i]);
        }
        return MorseCode;
    }
}
