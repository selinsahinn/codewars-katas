package Kyu8;

import java.sql.Array;
import java.util.Arrays;

public class highAndLow {

    public static String highAndLow(String numbers) {
        String[] arrOfStr = numbers.split(" ", 0);
        int[] arr= new int[arrOfStr.length];
        for (int i=0; i<arrOfStr.length;i++){
            arr[i]=Integer.parseInt(arrOfStr[i]);
        }
        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length-1];
    }
}
