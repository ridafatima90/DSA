package stack;

import java.util.Stack;

public class FindDuplicateParenthesis {
    static boolean findDuplicates(String s){
        Stack<Character> stack = new Stack<>();

        char[] str = s.toCharArray();
        for(char ch: str) {
            if(ch == ')') {
                char top = stack.peek();
                stack.pop();

                int elementInside = 0;
                while(top != '(') {
                    elementInside++;
                    top = stack.peek();
                    stack.pop();
                }
                if(elementInside < 1) {
                    return true;
                }
            }else {
                stack.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";

        if(findDuplicates(str)) {
            System.out.println("Duplicates found");
        }else {
            System.out.println("Duplicates not found");
        }
    }
}
