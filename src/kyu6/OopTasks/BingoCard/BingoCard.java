package kyu6.OopTasks.BingoCard;

import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Dell on 5/2/2017.
 */
public class BingoCard {

    public static String[] getCard() {
        // Start your coding here...
        String[] array;

        String[] arrayB = generateArray(5, "B");
        String[] arrayI = generateArray(5, "I");
        String[] arrayN = generateArray(4, "N");
        String[] arrayG = generateArray(5, "G");
        String[] arrayO = generateArray(5, "O");

        array = arrayB;
        array = concat(array, arrayI);
        array = concat(array, arrayN);
        array = concat(array, arrayG);
        array = concat(array, arrayO);

        return array;
    }

    public static String[] generateArray(int numbers, String columnName)
    {
        String[] array;
        int minRange = getRangeByColumn(columnName)[0];
        int maxRange = getRangeByColumn(columnName)[1];

        int columnSize = 5;
        if(columnName=="N"){columnSize=4;}

        HashSet<String> set = new HashSet<>();
        while(set.size()<columnSize){
            int randomNum = ThreadLocalRandom.current().nextInt(minRange, maxRange + 1);
            set.add(columnName+randomNum);
        }
        array = set.toArray(new String[numbers]);
        return array;
    }

    public static int[] getRangeByColumn(String columnName)
    {
        int[] range;
        switch (columnName) {
            case "B":
                range = new int[]{1, 15};
                break;
            case "I":
                range = new int[]{16, 30};
                break;
            case "N":
                range = new int[]{31, 45};
                break;
            case "G":
                range = new int[]{46, 60};
                break;
            case "O":
                range = new int[]{61, 75};
                break;
            default:
                range = new int[]{0, 0};
                break;
        }
            return range;
    }

        public static String[] concat(String[] a, String[] b)
        {
            int aLen = a.length;
            int bLen = b.length;
            String[] c= new String[aLen+bLen];
            System.arraycopy(a, 0, c, 0, aLen);
            System.arraycopy(b, 0, c, aLen, bLen);
            return c;
        }
}
