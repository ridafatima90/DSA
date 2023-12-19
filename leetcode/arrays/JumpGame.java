package leetcode.arrays;
//https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        System.out.println(canJump2(nums));
    }
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i = 0; i< nums.length-1; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+ nums[i]);
            if(maxReach >= nums.length -1){
                return true;
            }
        }
        return false;
    }

    public static int canJump2(int[] nums) {
        int n = nums.length-1;
        int count = 0;
        int end = 0;
        int maxReach = 0;
        for(int i = 0; i< n; i++){
            maxReach = Math.max(maxReach, i+ nums[i]);

            if(i == end){
                end = maxReach;
                count++;
            }
        }
        return count;
    }
}