package recursion;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesIteratively {
    public static String removeDuplicates(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> seenCharacters = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if(!seenCharacters.contains(currChar)) {
                result.append(currChar);
                seenCharacters.add(currChar);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbcccdef"));
    }
}
