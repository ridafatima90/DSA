package leetcode.twopointers;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String newStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(newStr);
        if(newStr.length() == 0){
            return true;
        }
        for(int i = 0; i< newStr.length()/2; i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length() -i -1)){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
