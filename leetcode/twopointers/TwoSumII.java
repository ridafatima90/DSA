package leetcode.twopointers;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] list = new int[5];
        for(int i = 1; i <= numbers.length; i++){
            if(target == numbers[i]){
                list[i] = numbers[i];
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
