package bst;

import java.util.Stack;

class Node {
    int data;
    Node left, right;
    Node(int d){
        this.data = d;
        left = right= null;
    }
}

public class Practise {
    public static int countPairs(Node root1, Node root2, int x){
        if(root1 == null || root2 == null) {
            return 0;
        }
        int count = 0;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node curr1, curr2;

        while(true) {
            while(root1 != null){
                stack1.push(root1);
                root1 = root1.left;
            }

            while(root2 != null){
                stack2.push(root2);
                root2 = root2.right;
            }

            if(stack1.isEmpty() || stack2.isEmpty()){
                break;
            }

            curr1 = stack1.peek();
            curr2 = stack2.peek();

            if(curr1.data + curr2.data == x){
                count++;
                stack1.pop();
                stack2.pop();

                root1 = curr1.right;
                root2 = root2.left;
            }
            else if(curr1.data + curr2.data < x){
                stack1.pop();
                root1 = root1.right;
            }else {
                stack2.pop();
                root2 = root2.left;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(5);
        root2.left.right = new Node(8);

        System.out.println(countPairs(root1, root2, 12));
    }
}
