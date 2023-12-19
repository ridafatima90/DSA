package leetcode.binarytreegeneral;
import java.util.*;
//https://leetcode.com/problems/same-tree/submissions/?envType=study-plan-v2&envId=top-interview-150
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
 }
public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println(isSameTree(p,q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()){
            TreeNode nodeP = queue.poll();
            TreeNode nodeQ = queue.poll();

            if(nodeP == null && nodeQ == null){
                continue;
            }
            if(nodeP == null || nodeQ == null || nodeP.val != nodeQ.val){
                return false;
            }
            queue.add(nodeP.left);
            queue.add(nodeQ.left);
            queue.add(nodeP.right);
            queue.add(nodeQ.right);
        }
        return true;
    }
}
