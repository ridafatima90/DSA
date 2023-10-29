package map.questions;

import java.util.*;

public class Practise {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        HashMap<Character, Integer> map1 = getCharacterString(s1);
        HashMap<Character, Integer> map2 = getCharacterString(s2);

        for(char c: map1.keySet()) {
            if(map2.containsKey(c)) {
                return "Yes";
            }
        }
        return "No";
    }

    public static HashMap<Character, Integer> getCharacterString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.merge(c, 1, Integer:: sum);
        }
        return map;
    }


    public static void main(String[] args) {

        List<String> str1 = new ArrayList<>();
        str1.add("give");
        str1.add("one");
        str1.add("grand");
        str1.add("today");
        str1.add("night");
//        str1.add("four");

        List<String> str2 = new ArrayList<>();
        str2.add("give");
        str2.add("grand");
        str2.add("one");
        str2.add("today");
//        str2.add("four");

        twoStrings("Hello", "world");
    }
}
