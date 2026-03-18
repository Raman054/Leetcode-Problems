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
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        backtrack(root,1,res);
        return res;
    }
        public void backtrack(TreeNode root,int level,List<Integer> res)
        {
            if(root == null)
            {
                return;
            }
            if(res.size() < level)
            {
                res.add(root.val);
            }
             backtrack(root.right,level+1,res);
            backtrack(root.left,level+1,res);
        }
    }