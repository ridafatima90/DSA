package recursion;

//public class PrintKeyPadCombination {
//    public static String[] keypad = {".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//
//    public static void printComb(String str, int idx, String combination){
//        if(idx == str.length()) {
//            System.out.println(combination);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        String mapping = keypad[currChar - '0'];
//
//
//        for(int i = 0; i < mapping.length(); i++) {
//            printComb(str, idx+1, combination+mapping.charAt(i));
//        }
//    }
//    public static void main(String[] args) {
//        String str = "2";
//        printComb(str, 0, "");
//    }
//}

import java.util.LinkedList;
import java.util.Queue;

public class PrintKeyPadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombIterative(String str) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String mapping = keypad[currChar - '0'];

            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String partialCombination = queue.poll();

                for (int k = 0; k < mapping.length(); k++) {
                    queue.offer(partialCombination + mapping.charAt(k));
                }
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        String str = "2";
        printCombIterative(str);
    }
}
