package leetcode.weeklycontest;

import java.util.*;

class CommonElement {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};
        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            list.add(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++){
           if(list.contains(nums1[i])){
               set.add(nums1[i]);
           }
        }
        System.out.println(set);
        for(int num: set){
            for(int i = 0; i < nums1.length; i++){
                if(nums1[i] == num){
                    count1++;
                }
            }
            for(int i = 0; i < nums2.length; i++){
                if(nums2[i] == num){
                    count2++;
                }
            }
        }
        return new int[]{count1, count2};
    }
}