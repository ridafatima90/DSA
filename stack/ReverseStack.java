package stack;

import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer>reverse(Stack<Integer> s){
        Stack<Integer> s2 = new Stack<>();

        while(!s.isEmpty()) {
            s2.push(s.pop());
        }

        return s2;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println("after reverse------------");

        Stack<Integer> reverseStack = reverse(s);

        while(!reverseStack.isEmpty()) {
            System.out.println(reverseStack.peek());
            reverseStack.pop();
        }

    }
}
