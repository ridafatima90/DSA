package kunalkushwaha.cyclicsort;
//https://leetcode.com/problems/set-mismatch/submissions/
class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        System.out.println(findErrorNums(nums));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                return new int[] {nums[j], j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}