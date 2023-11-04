package bst;

import java.util.*;
class Node2 {
    int data;
    bst.Node2 left;
    bst.Node2 right;
    Node2(int d){
        this.data = d;
        left = right = null;
    }
}

class ZigZagTreeTraversal {

    public static ArrayList<Integer> zigzagTraversal(Node2 root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node2> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();

            List<Integer> levelNodes = new ArrayList<>();

            for(int i = 0; i< levelSize; i++){
                Node2 current = queue.poll();

                if(leftToRight){
                    levelNodes.add(current.data);
                }else {
                    levelNodes.add(0, current.data);
                }

                if(current.left != null){
                    queue.offer(current.left);
                }

                if(current.right != null){
                    queue.offer(current.right);
                }
            }

            for(int i = 0; i < levelNodes.size();i++){
                result.add(levelNodes.get(i));
            }
            leftToRight = !leftToRight;
        }
        return result;
    }

    public static void main(String[] args) {
        Node2 root1 = new Node2(1);
        root1.left = new Node2(2);
        root1.right = new Node2(4);
        root1.left.left = new Node2(5);
        root1.right = new Node2(3);
        root1.right = new Node2(6);
        root1.right = new Node2(7);


        System.out.println(zigzagTraversal(root1));
    }
}
