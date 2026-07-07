/**
 * Problem Link : https://leetcode.com/problems/binary-tree-right-side-view/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

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
    public List<Integer> rightSideView(TreeNode root) {

     List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> o = new LinkedList<>();
        o.add(root);


        while (!o.isEmpty()) {
            int s = o.size();
            int m=0;
            

            for (int i = 0; i < s; i++) {
                TreeNode curr = o.remove();
                m=curr.val;

                if (curr.left != null)
                    o.add(curr.left);

                if (curr.right != null)
                    o.add(curr.right);
            }
            ans.add(m);

        
        }

        return ans;
        
        
    }
}
