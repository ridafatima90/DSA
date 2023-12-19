package leetcode.twopointers;


public class IsaSubSequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }

        int sIndex = 0;
        int tIndex = 0;

        while(tIndex < t.length()){
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if(s.length() == t.length()){
                    return true;
                }
                return true;
            }
            tIndex++;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
