package kunalkushwaha.cyclicsort;
import java.util.*;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbers {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result  = new ArrayList<>();
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index]  != index+1){
                result.add(index+1);
            }
        }
        return result;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}