package leetcode.math;
//https://leetcode.com/problems/palindrome-number/submissions/?envType=study-plan-v2&envId=top-interview-150
class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if( x< 0 || x%10 == 0 && x != 0){
            return false;
        }

        int reversed = 0;
        int original = x;

        while(x > 0){
            int digit = x % 10;
            x /= 10;

            if(reversed > Integer.MAX_VALUE /10 || (reversed == Integer.MAX_VALUE/10 && digit > 7)){
                return false;
            }

            reversed = reversed * 10 + digit;
        }

        return original == reversed;
    }
}