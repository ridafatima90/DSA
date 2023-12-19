package leetcode;

import java.util.*;

public class KthLargestElement {
    public static int kthLargestHeap(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kthLargestHeap(nums, k));
    }
}
