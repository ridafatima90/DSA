package recursion;

import java.util.HashSet;
import java.util.Set;

public class SubSequenceGenIter {
    public static void generateSubsequences(String str) {
        Set<String> set = new HashSet<>();
        int n = str.length();
        int totalSubSequences = 1 << n;
        for (int i = 0; i < totalSubSequences; i++) {
            StringBuilder result = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    result.append(str.charAt(j));
                }
            }
            set.add(result.toString());
        }
        System.out.println(set);
    }

    public static void main(String[] args) {

        generateSubsequences("abc");

    }
}
