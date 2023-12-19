package hackerrank.stringmanipulation;

import java.util.*;

public class Sherlock {
    public static String isValid(String s) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);

        }

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int freq: map.values()){
            freqMap.put(freq, freqMap.getOrDefault(freq, 0)+1);
        }
        System.out.println(freqMap);
        Set<Integer> frequencies = freqMap.keySet();

        if(frequencies.size() == 1){
            return "YES";
        }

        if(frequencies.size() == 2){
             int minFreq = freqMap.keySet().stream().min(Integer::compare).orElse(0);
             int maxFreq = freqMap.keySet().stream().max(Integer::compare).orElse(0);
             System.out.println(minFreq);
             System.out.println(maxFreq);

                if((freqMap.get(minFreq) == 1 &&(minFreq ==1 || minFreq == maxFreq + 1)) || (freqMap.get(maxFreq) ==1 && maxFreq ==1) ||(freqMap.get(maxFreq) ==1 && maxFreq ==3) ){
                 return "YES";
             }

//            Iterator<Integer>iterator = frequencies.iterator();
//            int freq1 = iterator.next();
//            int freq2 = iterator.next();
//            if((freqMap.get(freq1) == 1 &&(freq1 ==1 || freq1 == freq2 +1 )) || (freqMap.get(freq2) == 1 && freq2 == 1)){
//                return "YES";
//            }
        }


        return "NO";
    }
    public static void main(String[] args) {
//
//        System.out.println(isValid("abc"));
//        System.out.println(isValid("aabbccddeefghi"));

        System.out.println(isValid("abcdefghhgfedecba"));

    }
}
