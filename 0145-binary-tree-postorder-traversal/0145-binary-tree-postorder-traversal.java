/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        postorder(root,in);
        return in;
    }
    public void postorder(TreeNode root,List<Integer> in){
        TreeNode temp = root;
        if(temp==null) return;
        postorder(temp.left,in);
        postorder(temp.right,in);
        in.add(temp.val);
    }
}