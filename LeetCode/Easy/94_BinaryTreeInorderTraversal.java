/**
 * Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        inOrder(l,root);
        return l;
        
    }
    public void inOrder(List<Integer> li,TreeNode root)
    {
        if(root==null)
        return;
        
        inOrder(li,root.left);
        li.add(root.val);
        inOrder(li,root.right);
    }
}
