package org.tasks.kyu7;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class PokerhandStraightOrNot {

    /**
     * Description:

     Texas Hold-em!

     Your task is to determine if the cards in the list makes up a straight (five cards of sequential rank) or not. The cards will always have values ranging from 2-14, where 14 is the ace.

     Be aware that the ace (14) also should count as value 1!

     The number of cards will vary, but will never be more than 7 (the board (5) + player hand (2))

     Examples:

     straight: 9-10-11-12-13
     straight: 14-2-3-4-5
     straight: 2-7-8-5-10-9-11
     not straight: 7-8-12-13-14
     */
    public static boolean IsStraight(ArrayList<Integer> cards) {
        //if(cards.size()>7) return false;

        //if(cards.contains(14)){
        //    cards.add(1);
        //}
        if(cards.get(0)==14){
            cards.remove(0);
            cards.add(0, 1);
        }

        Collections.sort(cards);

        int count = 0;
        for(int i=0; i<cards.size()-1; i++){
            if(cards.get(i+1) - cards.get(i)==1){
                count++;
            }
        }

        if(count==4 || (cards.contains(14) && count==5)) return true;
        if(cards.size()>7 && count>4) return true;
        return false;
    }
}
