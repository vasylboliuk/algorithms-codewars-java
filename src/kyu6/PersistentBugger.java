package kyu6;

/**
 * Created by Dell on 12/26/2016.
 */
public class PersistentBugger {

    /**
     Description:

     Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

     For example:

     persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
     // and 4 has only one digit

     persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
     // 1*2*6 = 12, and finally 1*2 = 2

     persistence(4) == 0 // because 4 is already a one-digit number
     */
    public static int persistence(long n) {
        // your code
        String str = String.valueOf(n);
        int strLen = str.length();
        if(strLen<2) return 0;
        long number = n;
        int count = 0;
        while(number > 9){
            long multiple = 1;
            while (number > 0) {
                multiple = multiple*(number%10);
                number = number / 10;
            }
            number = multiple;
            count++;
        }
        return count;
    }
}
