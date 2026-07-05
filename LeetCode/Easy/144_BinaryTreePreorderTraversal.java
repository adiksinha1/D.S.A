/**
 * Problem Link : https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> h=new ArrayList<>();
        preOrder(h,root);
        return h;
        
    }
    void preOrder(List<Integer> li,TreeNode root)
    {
        if(root==null)
        return;

        li.add(root.val);
        preOrder(li,root.left);
        preOrder(li,root.right);
    }
}
