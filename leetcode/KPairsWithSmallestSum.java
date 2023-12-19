package leetcode;
import java.util.*;

public class KPairsWithSmallestSum {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return result;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]));

        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            pq.offer(new int[]{i, 0});
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int[] current = pq.poll();
            result.add(Arrays.asList(nums1[current[0]], nums2[current[1]]));

            if (current[1] < nums2.length - 1) {
                pq.offer(new int[]{current[0], current[1] + 1});
            }
        }

        return result;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3};
        int k = 2;
        System.out.println(kSmallestPairs(nums1, nums2, k));
    }
}
