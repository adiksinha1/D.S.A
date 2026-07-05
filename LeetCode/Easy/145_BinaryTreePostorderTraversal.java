/**
 * Problem Link : https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Platform     : LeetCode
 * Difficulty   : Easy
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> h=new ArrayList<>();
        inOrder(h,root);
        return h;
        
    }
    public void inOrder(List<Integer> li,TreeNode root)
    {
        if(root==null)
        return;
        
        inOrder(li,root.left);
        inOrder(li,root.right);
        li.add(root.val);
    }
}
