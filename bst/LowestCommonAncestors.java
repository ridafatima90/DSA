//package bst;
//
//import java.util.*;
//
//public class LowestCommonAncestors {
//    Node lca(Node root, int n1, int n2){
//        Map<Node, Node> parent = new HashMap<>();
//
//        Stack<Node> stack = new Stack<>();
//
//        stack.push(root);
//        parent.put(root, null);
//
//        while(!parent.containsKey(root.left) || !parent.containsKey(root.right)){
//            Node currentNode = stack.pop();
//
//            if(currentNode.left != null){
//                stack.push(currentNode.left);
//                parent.put(currentNode.left, currentNode);
//            }
//            if(currentNode.right != null){
//                stack.push(currentNode.left);
//                parent.put(currentNode.right, currentNode);
//            }
//        }
////        Set<Node> ancestors = new HashSet<>();
////        while(n1 != null){
////            ancestors.add(n1);
////            n1 = parent.get(n1);
////        }
////
////        while(n2 != null){
////            n2 = parent.get(n2);
////        }
//
////        return n2;
//    }
//    public static void main(String[] args) {
//
//    }
//}
