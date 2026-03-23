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
    ArrayList<Integer> res = new ArrayList<>();
    void inOrder(TreeNode root){
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return res.get(k-1);
    }
}