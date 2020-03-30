package org.tasks.kyu8;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class CountOfPositivesSumOfNegatives {

    /**
     * Description:

     Given an array of integers.

     Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

     If the input array is empty or null, return an empty array:

     C#/Java: new int[] {} / new int[0];
     C++: std::vector<int>();
     JavaScript/CoffeeScript/PHP/Haskell: [];

     ATTENTION!

     The passed array should NOT be changed. Read more here.
     For example:

     input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}
     return int[] {10, -65}.

     ```haskell
     */
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input==null || input.length<1) return new int[]{};
        int count = 0;
        int sum = 0;
        for(int i : input){
            if(i>0) count++;
            if(i<0) sum=sum+i;
        }
        return new int[]{count, sum};
    }
}
