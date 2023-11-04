package stack;

import java.util.ArrayList;

public class StackImplUsingArrayList {
    static class Node{
        int data;
        Node next;
        public Node(int d){
            this.data = d;
            this.next= null;
        }
    }

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(int data){
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() -1);
            return top;
        }

        public static int peek(int data){
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size() -1);
        }
    }

    public static void main(String[] args) {
        StackImplUsingLinkedList.Stack s = new StackImplUsingLinkedList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
