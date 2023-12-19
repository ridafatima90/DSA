package leetcode.hashmap;

import java.util.*;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        return Arrays.stream(nums).anyMatch(num -> !set.add(num) || (set.size()> k && !set.add(num)));
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
