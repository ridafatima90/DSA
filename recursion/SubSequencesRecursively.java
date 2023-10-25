package recursion;

import java.util.HashSet;

public class SubSequencesRecursively {

    public static void findSubSequences(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            }else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be
        findSubSequences(str, idx+1, newStr+currChar, set);

        //not to be
        findSubSequences(str, idx+1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "abc";
        HashSet<String>set = new HashSet<>();
        findSubSequences(str, 0, "", set);
    }
}
