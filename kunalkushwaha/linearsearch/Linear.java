package kunalkushwaha.linearsearch;

public class Linear {
    public static void main(String[] args) {
        int[] nums = {22,33, 1,4,-1, 5,77,99,10};
        System.out.println(linearSearch3(nums, 22));
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        int n = arr.length;

        for(int num : arr){
            if(num == target){
                return true;
            }
        }

        return false;
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int n = arr.length;

        for(int num : arr){
            if(num == target){
                return num;
            }
        }

        return -1;
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
