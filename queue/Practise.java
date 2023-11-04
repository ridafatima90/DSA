package queue;

import java.util.Stack;

public class Practise {
    public static Stack<Integer> reverse(Stack<Integer> s){
//        Stack<Integer> s2 = new Stack<>();
//            while(!s.isEmpty()) {
//                s2.push(s.pop());
//            }
//        return s2;

        if(!s.isEmpty()) {
            int temp = s.pop();
            reverse(s);

            insertAtBootom(s, temp);
        }
        return s;
    }

    public static void insertAtBootom(Stack<Integer> s, int value){
        if(s.isEmpty()) {
            s.push(value);
        }else {
            int temp = s.pop();
            insertAtBootom(s, value);
            s.push(temp);
        }

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(44);
        s.push(3);
        s.push(19);
        System.out.println(s);
        System.out.println(reverse(s));
    }
}
