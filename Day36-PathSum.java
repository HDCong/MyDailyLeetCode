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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        return check(root,0,sum);
    }
    public boolean check(TreeNode root, int sum, int target){
        // if leaf node
        sum = sum + root.val;
        // System.out.println(root.val);
        if(root.left==null && root.right==null){
            if(sum ==target) return true;
            return false;
        }
        if(root.left!=null && root.right!=null)
            return check(root.left,sum,target) || check(root.right,sum,target);
        if(root.left!=null)
            return check(root.left,sum,target);
        return check(root.right,sum,target);
        
    }
}