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
    public ArrayList<Integer> traversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return list;
        traversal(root.left, list);
        list.add(root.val);
        traversal(root.right, list);
        return list;
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = traversal(root, new ArrayList<Integer>());
        return arr.get(k - 1);
    }
}