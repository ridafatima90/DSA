package stack;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Stack;

public class BalanceChecker {
    static final HashMap<Character, Character> bracketMapping = new HashMap<>();
    static {
        bracketMapping.put('(', ')');
        bracketMapping.put('[', ']');
        bracketMapping.put('{', '}');
    }
    public static String isBalanced(String s){
        Stack<Character>charStack = new Stack<>();

        for(char currChar: s.toCharArray()) {
            if(bracketMapping.containsKey(currChar)) {
                charStack.push(currChar);
            }else if(bracketMapping.containsValue(currChar)) {
                if(charStack.isEmpty() || bracketMapping.get(charStack.pop()) != currChar) {
                    return "NO";
                }
            }
        }
        return charStack.isEmpty() ? "Yes": "NO";
    }

    public static void main(String[] args) {
        String input = "{{[[(())]]}}";
        System.out.println(isBalanced(input));
    }
}
