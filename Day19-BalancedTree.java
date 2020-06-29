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
    private int calcHeight(TreeNode root){
        if(root==null) return 0;
        return Math.max(calcHeight(root.left), calcHeight(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        // System.out.println(calcHeight(root.left));
        // System.out.println(calcHeight(root.right));
        if(Math.abs(calcHeight(root.left)-calcHeight(root.right))>1) return false;
        if(isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
    }
}