package hackerrank.stringmanipulation;

public class SpecialString {

    static int subCount(int n, String s) {
        int count = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < n-1; i++) {
            for(int k = i+1; k < n; k++){
                if(arr[i] == arr[k]) count++;
                if(arr[i] != arr[k]){
                    int lastIndex = k*2 -i;
                    if(lastIndex < n ) {
                        boolean isPalindrome = false;

                        for (int j = i, l = k + 1; j <= k && l <= lastIndex; j++, k++) {
                            if (arr[j] != arr[l]) {
                                isPalindrome = false;
                                break;
                            }
                        }
                        if(isPalindrome){
                            count++;
                        }
                    }

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subCount(7, "abcbaba"));
    }
}
