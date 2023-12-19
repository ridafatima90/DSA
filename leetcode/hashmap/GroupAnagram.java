package leetcode.hashmap;
import java.util.*;
public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
//            char[] charArray = str.toCharArray();
//            Arrays.sort(charArray);
//            String sortedStr = new String(charArray);
//            if(map.containsKey(sortedStr)){
//                map.get(sortedStr).add(str);
//            }else {
//                List<String> list = new ArrayList<>();
//                list.add(str);
//                map.put(sortedStr, list);
//            }
            int[] charCount = new int[26];
            for(char c: str.toCharArray()){
                charCount[c -'a']++;
            }

            String key = Arrays.toString(charCount);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
