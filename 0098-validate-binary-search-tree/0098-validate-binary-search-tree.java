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
    public boolean isValidBST(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorder(root,in);
        boolean f = true;
        int mid = in.size();
        for(int i=1;i<in.size();i++){
            if(in.get(i)<=in.get(i-1)) return false;
        }
        return f;
    }
    private void inorder(TreeNode root,List<Integer> in){
        if(root==null) return;
        inorder(root.left,in);
        in.add(root.val);
        inorder(root.right,in);
    }
}