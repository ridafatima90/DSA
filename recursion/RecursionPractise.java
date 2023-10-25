package recursion;

import java.text.DecimalFormat;
import java.util.*;

public class RecursionPractise {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, -2, 0, 3, -4, 0, 5);
        int n = arr.size();
        int[] counts = countPlusMinus(arr, 0,0,0,0);

        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format((float) counts[0] / n));
        System.out.println(df.format((float) counts[1] / n));
        System.out.println(df.format((float) counts[2] / n));
    }

    public static int[] countPlusMinus(List<Integer> arr, int index, int positiveCount, int negativeCount,
                                       int zeroCount){
        if(index == arr.size()) {
            return new int[]{positiveCount, negativeCount, zeroCount};
        }

        int currNum = arr.get(index);
        if(currNum > 0) {
            positiveCount++;
        }else if(currNum < 0) {
            negativeCount--;
        }else {
            zeroCount++;
        }

        return countPlusMinus(arr, index +1, positiveCount, negativeCount, zeroCount);
    }
}
