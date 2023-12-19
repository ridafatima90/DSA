package kunalkushwaha.linearsearch;

public class SearchInRange {

    public static void main(String[] args) {
        int[] nums = {22, 33, 1, 4, -1, 5, 77, 99, 10};
        System.out.println(searchInRange(nums, 1,4,22));
    }

    private static boolean searchInRange(int[] nums, int i, int i1, int target) {
        if(nums.length == 0){
            return false;
        }
        for(int index = i; index<= i1; index++){
            if(nums[index] == target){
                return true;
            }
        }
        return false;
    }
}
