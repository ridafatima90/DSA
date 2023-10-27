package map.questions;

import java.util.HashMap;

public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer, Integer> subArray = new HashMap<>();  //sum && frequency
        subArray.put(0, 1);
        int ans = 0;
        int sum = 0;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if(subArray.containsKey(sum - k)) {
                ans += subArray.get(sum-k);
            }

            if(subArray.containsKey(sum)) {
                subArray.put(sum, subArray.get(sum) + 1);
            }else {
                subArray.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
