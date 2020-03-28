package kyu7.OopTasks.InteractiveDictionary;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 4/30/2017.
 * In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:
 Dictionary d = new Dictionary();
 d.newEntry("Apple", "A fruit that grows on trees");
 System.out.println(d.look("Apple"));
 >>> A fruit that grows on trees
 System.out.println(d.look("Banana"));
 >>> Cant find entry for Banana
 */
public class Dictionary {

    Map<String, String> dict = new HashMap<String, String>();

    public void newEntry(String str1, String str2){
        dict.put(str1, str2);
    }

    public String look(String str){
        String result = "";

        try
        {
            result = dict.get(str);
        }catch(Exception e){}

        if(result!=null){
            return result;
        }

        return "Cant find entry for " + str;
    }

    // Second variant
    public void newEntry2(String key, String value) {
        dict.put(key, value);
    }

    public String look2(String key) {
        return dict.getOrDefault(key, "Cant find entry for " + key);
    }
}
