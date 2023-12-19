package leetcode.binarytreegeneral;
class TreeNode2 {
  int val;
  TreeNode2 left;
  TreeNode2 right;
  TreeNode2() {}
  TreeNode2(int val) { this.val = val; }
  TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}
public class InvertTree {

    public static void main(String[] args) {

    }

    public static TreeNode2 invertTree(TreeNode2 root) {
        if(root == null){
            return  null;
        }

        while(root!= null){
            TreeNode2 temp = root.left;
            root.left = root.right;
        }
        return root;
    }
}
