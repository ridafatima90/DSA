package bst;

class Node3 {
    int data;
    Node3 left;
    Node3 right;
}
public class MirrorNode {

    static Node3 createNode(int data){
        Node3 newNode = new Node3();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    static void inorder(Node3 root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    static Node3 mirrorify(Node3 root){
        if(root == null){
            return null;
        }
//        Node3 mirror = createNode(root.data);
//        mirror.left = mirrorify(root.right);
//        mirror.right = mirrorify(root.left);
//        return mirror;

        Node3 left = mirrorify(root.left);
        Node3 right = mirrorify(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        Node3 tree = createNode(5);
        tree.left = createNode(3);
        tree.right = createNode(6);
        tree.left.left = createNode(2);
        tree.left.right = createNode(4);

        inorder(tree);

        Node3 mirror = null;
        mirror = mirrorify(tree);
        System.out.println();
        inorder(mirror);
    }

}
