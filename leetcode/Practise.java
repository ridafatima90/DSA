package leetcode;

import java.util.Arrays;

public class Practise {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1, i2=n-1, k= m+n-1;
        while(i1 >= 0 && i2 >= 0){
            if(nums1[i1] >= nums2[i2]){
                nums1[k--] = nums1[i1--];
            }else{
                nums2[k--] = nums2[i2--];
            }
        }
        while(i2 >= 0){
            nums1[k--] = nums2[i2--];
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 0,0,0};
        int[] array2 = {4, 5, 6, 7};
//        System.out.println(Arrays.toString(merge(array1, 3, array2, 4)));
    }
}
