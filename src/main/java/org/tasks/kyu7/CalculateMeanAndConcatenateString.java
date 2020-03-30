package org.tasks.kyu7;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class CalculateMeanAndConcatenateString {
    /**
     * Description:

     You will be given an array which will include both integers and characters.

     Return an array of length 2 with a[0] representing the mean of the ten integers as a floating point number. There will always be 10 integers and 10 characters. Create a single string with the characters and return it as a[1] while maintaining the original order.

     lst = ['u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0']

     Here is an example of your return

     [3.6, "udiwstagwo"]
     * @param lst
     */
    public static Object[] mean(char[] lst)
    {
        double sumNum = 0;
        String str = "";

        for(char s : lst){
            if (Character.isDigit(s)){
                sumNum = sumNum+Character.getNumericValue(s);
            }else{
                str=str+s;
            }
        }
        sumNum = sumNum/10;
        return new Object[]{sumNum, str};
    }
}
