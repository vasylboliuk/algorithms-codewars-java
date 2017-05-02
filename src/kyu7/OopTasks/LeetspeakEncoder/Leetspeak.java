package kyu7.OopTasks.LeetspeakEncoder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 5/2/2017.
 */
public class Leetspeak {

    Map<Character, String> dict = new HashMap<Character, String>();

    public String encode(String source){

        dict.put('a', "4");
        dict.put('e', "3");
        dict.put('l', "1");
        dict.put('m', "/^^\\");
        dict.put('o', "0");
        dict.put('u', "(_)");

        if(source == null){
            return "";
        }

        char[] array = source.toCharArray();
        StringBuilder result = new StringBuilder();

        for(char ch : array){
            String item = Character.toString(ch).toLowerCase();
            String dictItem = dict.get(item.charAt(0));
            result = (dictItem!=null) ? result.append(dictItem) : result.append(ch);
       }
        return result.toString();
    }

    public String encode2Variant(String source){
        if(source == null || source == "") {
            return "";
        }

        source = source.replaceAll("(?i)a", "4");
        source = source.replaceAll("(?i)e", "3");
        source = source.replaceAll("(?i)l", "1");
        source = source.replaceAll("(?i)m", "/^^\\\\");
        source = source.replaceAll("(?i)o", "0");
        source = source.replaceAll("(?i)u", "(_)");

        return source;
    }
}

