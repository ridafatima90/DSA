package leetcode.hashmap;

import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        if(s.length() == 0 || pattern.length() == 0 ){
            return false;
        }

        HashMap<Character, String>map = new HashMap<>();
        int n = pattern.length();

        String[] words = s.split(" ");
        System.out.println(words.length);
        for(int i = 0; i< n; i++){
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if(map.containsKey(currentChar)){
                if(!map.get(currentChar).equals(currentWord)){
                    return false;
                }
            }else {
                if(map.containsValue(currentWord)){
                    return false;
                }
                map.put(currentChar, currentWord);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "aaa";
        String s = "aa aa aa aa";
        System.out.println(wordPattern(pattern, s));
    }
}
