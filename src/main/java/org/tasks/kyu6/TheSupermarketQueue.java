package org.tasks.kyu6;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class TheSupermarketQueue {

    /**
     * Description:
     There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!
     The function has two input variables:
     customers: an array (list in python) of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
     n: a positive integer, the number of checkout tills.

     The function should return an integer, the total time required.

     Assume that the front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free. So, for example:

     N.B. You should assume that all the test input will be valid, as specified above.

     P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool, with relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool
     */
    public static int solveSuperMarketQueue(int[] customers, int n) {
        if(customers.length<1) return 0;
        //int sum = customers[0];
        if(customers.length<2) return customers[0];
        if(customers.length<n) return customers[customers.length-1];

        int[] list = new int[n];
        for (int j=0; j<n; j++) {
            int sum = customers[j];
            for (int i = j; i < customers.length - n; i = i + n) {
                sum = sum + customers[i + n];
            }
            list[j]=sum;
        }

        int maxSum = list[0];

        for(int i = 0; i < list.length; i++){
            if(maxSum<list[i]){
                maxSum=list[i];
            }
        }
        return maxSum;
    }
}
