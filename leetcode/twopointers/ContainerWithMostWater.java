package leetcode.twopointers;

import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
//        if(height.length == 0){
//            return 0;
//        }
//        Map<Integer, Integer> sp = new HashMap<>();
//        for(int i = 0; i< height.length; i++){
//            int fp = height[i];
//            sp.put(fp, i);
//        }
//        int maxKey = Integer.MIN_VALUE;
//        int maxValue = Integer.MIN_VALUE;
//
//        int maxArea = 0;
//        for(Map.Entry<Integer, Integer> entry: sp.entrySet()){
//            if(entry.getValue() > maxValue){
//                maxValue = entry.getValue();
//                maxKey = entry.getKey();
//                maxArea = Math.max(maxArea, maxKey * maxValue);
//            }
//        }
//
//        return maxArea;

        int maxArea = 0;
        int left = 0;
        int right = height.length -1;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right-left;

            maxArea = Math.max(maxArea, h*w);

            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
