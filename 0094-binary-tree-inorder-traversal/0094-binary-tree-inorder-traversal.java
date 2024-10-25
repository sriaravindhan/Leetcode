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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorder(root,in);
        return in;
    }
    public void inorder(TreeNode root, List<Integer> in){
        if(root==null) return;
        TreeNode temp = root;
        inorder(temp.left,in);
        in.add(temp.val);
        inorder(temp.right,in);
    }
}