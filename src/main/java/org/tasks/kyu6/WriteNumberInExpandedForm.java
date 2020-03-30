package org.tasks.kyu6;

import java.util.ArrayList;

/**
 * Created by Dell on 12/31/2016.
 */
public class WriteNumberInExpandedForm {

    /**
     * Description:
     Write Number in Expanded Form

     You will be given a number and you will need to return it as a string in Expanded Form. For example:

     Kata.expandedForm(12); # Should return "10 + 2"
     Kata.expandedForm(42); # Should return "40 + 2"
     Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

     NOTE: All numbers will be whole numbers greater than 0.
     */
    public static String expandedForm(int num)
    {
        char[] listNum = String.valueOf(num).toCharArray();
        int size = listNum.length;
        String result = "";

        for(int i=0; i<listNum.length; i++){
            int resNum = Integer.parseInt(String.valueOf(listNum[i]));

            if(resNum==0){
                size = size-1;
                continue;
            }
            for(int j=0; j<size-1; j++){
                resNum = resNum * 10;
            }
            size = size-1;
            result = result + resNum + " ";
        }
        result = result.trim().replaceAll(" ", " + ");
        return result;
    }

    //From CodeWars
    public static String expandedForm2(int num)
    {
        String intStr = Integer.toString(num);
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < intStr.length(); i++) {
            int size = intStr.length() - i;
            if(Character.getNumericValue(intStr.charAt(i)) > 0) {
                list.add(String.format("%0$-" + size + "s", intStr.charAt(i)).replace(" ","0"));
            }
        }
        return String.join(" + ", list);
    }

}
