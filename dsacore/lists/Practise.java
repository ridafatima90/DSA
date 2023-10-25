package dsacore.lists;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Arrays.sort(nums);

//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] == -5) {
//                System.out.print(i);
//            }
//        }
//        int[] maxSubArray = findMaxSubArray(nums);
//        for(int num: maxSubArray) {
//            System.out.print(num);
//        }

        System.out.println(kthSmallest(new int[]{7, 10, 4, 3, 20, 15}, 3));
    }

    public static int[] findMaxSubArray(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return new int[]{};
        }

        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i = 1; i < n; i++){
            if(nums[i]> maxEndingHere+ nums[i]) {
                maxEndingHere = nums[i];
                tempStart = i;
            }else {
                maxEndingHere = maxEndingHere + nums[i];
            }

            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        int[] result = new int[end -start +1];
        System.arraycopy(nums,start, result, 0, result.length);
        return result;
    }

    public static int kthSmallest(int[] arr, int k)
    {
        //Your code here
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[k]){
                return arr[k];
            }
        }
        return -1;
    }
}
