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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        // traversalTwoTree(root1, root2, res);
        traversalTree(root1, res);
        traversalTree(root2, res);
        Collections.sort(res);
        return res;
    }
    public void traversalTree(TreeNode root, List<Integer> res){
        if(root==null) return;
        traversalTree(root.left, res);
        res.add(root.val);
        traversalTree(root.right,res);
    }

}