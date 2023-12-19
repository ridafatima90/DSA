package leetcode.recursion;
//https://leetcode.com/problems/permutation-sequence/
import java.util.*;

class PermutationSequence {
    public static void main(String[] args) {
        int n = 9;
        int k = 161191;
        System.out.println(getPermutation(n,k));
    }
    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        StringBuilder result= new StringBuilder();
        int[] factorial = new int[n+1];


//        List<String> result = new ArrayList<>();
        int i = 1;
        while(i <= n){
            nums.add(i);
            factorial[i] = (i==1)? 1: i * factorial[i-1];
            i++;
        }
//        generatePermutations(nums, "", result);
//
//        return result.get(k -1);

        k--;
        for(int j = 1; j<= n; j++){
            int index = (factorial[n-j] != 0)? k/factorial[n-j]: 0 ;
            result.append(nums.get(index));
            nums.remove(index);
            k =( factorial[n-j] != 0) ? k%factorial[n-j]: 0;
        }
        return result.toString();
    }

//    public static void generatePermutations(List<Integer>nums, String current, List<String> result){
//        if(nums.isEmpty()){
//            result.add(current);
//            return;
//        }
//        for(int i = 0; i < nums.size(); i++){
//            int num = nums.get(i);
//            List<Integer> newNums = new ArrayList<>(nums);
//            newNums.remove(i);
//            generatePermutations(newNums, current+num, result);
//        }
//    }
}