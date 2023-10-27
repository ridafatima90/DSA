package map.questions;

import java.util.*;
import java.util.stream.Collectors;

public class FindMajorityElementIteratively {

    public static String findMajorityElements(int[]nums){
        List<Integer> result = new ArrayList<>();

        if(nums == null || nums.length == 0) {
            return result.stream().map(String::valueOf).collect(Collectors.joining(","));
        }

        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        for(int num: nums) {
            if(num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 =1;
            }else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for(int num: nums) {
            if (num == candidate1) {
                count1++;
            } else if(num == candidate2) {
                count2++;
            }
        }

        if(count1 > nums.length/3) {
            result.add(candidate1);
        }
        if(count2 > nums.length/3) {
            result.add(candidate2);
        }

        return result.stream().map(String::valueOf).collect(Collectors.joining(","));
    }


    public static void main(String[] args) {
        int[] nums1 = {1,3,2,5,1,3,1,5,1};
        int[] nums2 = {1,2};

        System.out.println(findMajorityElements(nums1)); // Output: [1]
        System.out.println(findMajorityElements(nums2));
    }
}
