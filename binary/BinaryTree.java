package binary;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static int preorder(Node root){
        if(root == null) {
            System.out.print("-1" + " ");
            return -1;
        }
        System.out.print(root.data + " ");
        int leftSum = preorder(root.left);
        int rightSum = preorder(root.right);
        return root.data + leftSum + rightSum;
    }

    public static void inorder(Node root){
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root){
        if(root == null) {
            return 0;
        }
        int leftSubTreeCount = countOfNodes(root.left);
        int rightSubTreeCount = countOfNodes(root.right);
        return leftSubTreeCount + rightSubTreeCount +1;

    }

    public static int sumOfNodes(Node root){
        if(root == null) {
            return 0;
        }
        int leftSubTreeSum = sumOfNodes(root.left);
        int rightSubTreeSum = sumOfNodes(root.right);
        return leftSubTreeSum + rightSubTreeSum + root.data;

    }

    public static int height(Node root){
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    public static int diameter(Node root){
        if(root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;
        return Math.max(dia3, Math.max(dia1, dia2));
    }

    static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht, int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
         int myHeight = Math.max(left.ht, right.ht) + 1;
         int dia1 = left.dia;
         int dia2 = right.dia;
         int dia3 = left.ht + right.ht;
         int myDia = Math.max(Math.max(dia1, dia2), dia3) + 1;
         TreeInfo myInfo = new TreeInfo(myDia, myHeight);
         return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = buildTree(nodes);

//        preorder(root);
//        inorder(root);
//        postorder(root);
//        levelorder(root);
//        System.out.println(countOfNodes(root));
//        System.out.println(sumOfNodes(root));
//        System.out.println(height(root));
//        System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);

    }
}
