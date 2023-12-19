package leetcode.hashmap;
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        for(int i = 0; i< n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }

        for(int count: map.values()){
            if(count != 0){
                return false;
            }
        }

//        Set<Character> set1 = map.keySet();
//        Set<Character> set2 = map2.keySet();
//
//        for(char key: set1){
//            if(!set2.contains(key)){
//                return false;
//            }
//        }
//        return true;

//        boolean mapsAreEqual = map.equals(map2);
//        if(!mapsAreEqual){
//            return false;
//        }
//        return true;

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
