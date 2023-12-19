package leetcode.mock;
import java.util.*;
public class Q2 {
    public static int arrayPairSum(int[] nums) {
//        Map<Integer, Integer>map = new HashMap<>();

        Arrays.sort(nums);
        int sum = 0;


        for(int i = 0; i< nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
}
