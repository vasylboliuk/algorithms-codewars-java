package org.tasks.kyu6;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MultiplesOf3Or5 {

    private static final Logger LOGGER = LogManager.getLogger();

    public int solution(int number) {
        List<Integer> listOfNum = new ArrayList<>(); // list of number divided on 3 or 5
        for(int i=1; i<number; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                listOfNum.add(i);
            }
        }
        LOGGER.info("List of Numbers dived on 3 or 5: {}", listOfNum.toString());
        return listOfNum.stream().mapToInt(num -> num).sum();
    }

    public static void main(String[] args) {

        System.out.println(new MultiplesOf3Or5().solution(10));

    }

}
