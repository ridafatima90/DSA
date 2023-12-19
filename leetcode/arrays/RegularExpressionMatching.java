package leetcode.arrays;
//https://leetcode.com/problems/regular-expression-matching/
public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        System.out.println(isMatch(s,p));
    }
    public static boolean isMatch(String s, String p) {
        if(p.equals(".*")){
            return true;
        }
        if(s.isEmpty()){
            return p.isEmpty();
        }
        boolean firstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        }else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}