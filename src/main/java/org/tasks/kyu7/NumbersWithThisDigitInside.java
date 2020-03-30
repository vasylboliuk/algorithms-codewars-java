package org.tasks.kyu7;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class NumbersWithThisDigitInside {


    /**
     Description:

     You have to search all numbers from inclusive 1 to inclusive a given number x, that have the given digit d in it.
     The value of d will always be 0 - 9.
     The value of x will always be greater than 0.

     You have to return as an array
     the count of these numbers,
     their sum
     and their product.


     For example:

     x = 11
     d = 1
     ->
     Numbers: 1, 10, 11
     Return: [3, 22, 110]


     If there are no numbers, which include the digit, return [0,0,0].

     Have fun coding it and please don't forget to vote and rank this kata! :-)

     I have created other katas. Have a look if you like coding and challenges.
     */
    public static long[] NumbersWithDigitInside(long x, long d)  {
        long count = 0, sum = 0, prod = 0;

        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count++;
                sum += i;
                prod = prod == 0 ? i : prod * i;
            }
        }

        return new long[]{count, sum, prod};
    }
}
