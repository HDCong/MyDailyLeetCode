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
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversalPreorder(root, res);
        return res;
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<>();
        while(!st.empty()|| root!=null){
            if(root!=null){
                st.push(root);
                res.add(root.val);
                root=root.left;
            }else{
                root=st.pop();
                root=root.right;
            }
        }
        return res;
        
    }
    private void traversalPreorder(TreeNode root, List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        traversalPreorder(root.left,res);
        traversalPreorder(root.right, res);
    }
}