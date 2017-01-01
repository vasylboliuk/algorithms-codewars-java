package kyu7;

import java.util.Arrays;

/**
 * Created by Dell on 12/27/2016.
 */
public class HelpSuzukiCompleteHisChores {

    public static int[] choreAssignments(int[] chores)
    {
        int[] est = new int[chores.length/2];
        Arrays.sort(chores);
        int sum = 0;
        for(int i=0; i<chores.length/2; i++){
            sum = chores[i] + chores[chores.length-1-i];
            est[i] = sum;
        }
        Arrays.sort(est);
        return est;
    }
}
