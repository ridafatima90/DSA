package leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/wildcard-matching/
public class WildCard {
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "m??*ss*?i*pi";
        System.out.println(isMatch(s,p));
    }
    public static boolean isMatch(String s, String p) {
        final Map<String, Boolean> memo = new HashMap<>();

        if(s.isEmpty()){
            return p.isEmpty();
        }
        if(p.isEmpty() || p.equals("*")){
            return true;
        }
        if(p.length()> 1 && p.charAt(0) == '*'){
            return true;
        }

        String key = s + "," + p;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        boolean firstMatch = (!s.isEmpty() && (!p.isEmpty()) && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?'));

        boolean result;

        if (p.length() >= 2 && p.charAt(1) == '*') {
            if(s.charAt(0) == p.charAt(0)) {
                result= isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
            }else {
                result= isMatch(s.substring(1), p);
            }
        }else {
            result = firstMatch && isMatch(s.substring(1), p.substring(1));
        }
        return result;
    }
}