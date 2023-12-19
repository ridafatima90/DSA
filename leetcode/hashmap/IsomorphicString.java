package leetcode.hashmap;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int num1[] = new int[256];
        int num2[] = new int[256];

        int n = s.length();

        for(int i = 0; i < n; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(num1[c1] != num2[c2]){
                return false;
            }
            num1[c1] = i+1;
            num2[c2] = i+1;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "egggg";
        String t = "adddd";
        System.out.println(isIsomorphic(s,t));

    }
}
