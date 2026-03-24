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
    ArrayList<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false; 
        if(root == null)
        {
            return res;
        }
        q.add(root);
        while(!q.isEmpty())
        {
             ArrayList<Integer> level = new ArrayList<>();
             int size = q.size();
             for(int i=0;i<size;i++)
             {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
             }
             if(flag)
                {
                    Collections.reverse(level);
                }
                res.add(level);
                flag = !flag;
        }
        return res;
    }
}