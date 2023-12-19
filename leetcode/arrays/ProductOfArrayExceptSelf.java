package leetcode.arrays;

import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftproduct = 1;
        for(int i = 0; i < n; i++){
            result[i] = leftproduct;
            leftproduct *= nums[i];
        }
        int rightProduct = 1;
        for(int i = n-1; i>=0; i--){
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}