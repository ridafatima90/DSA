package kunalkushwaha.linearsearch;

public class FindNumbers {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int i = 0;
        while(num > 0){
            num = num/10;
            i++;
        }
        if(i%2 == 0){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
