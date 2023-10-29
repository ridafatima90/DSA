package map.questions;

import java.util.*;

public class SherlockAnagrams {

    public static int countAnagrams(String s){
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = sortString(s.substring(i,j));

                map.put(sub, map.getOrDefault(sub, 0)+1);
            }
        }

        //count
        for(int value: map.values()) {
            count += value * (value - 1)/2;
        }

        return count;
    }

    private static String sortString(String substring) {
        char[] charArray = substring.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(countAnagrams("abcd"));
    }
}
