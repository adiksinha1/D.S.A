/**
 * Problem Link : https://leetcode.com/problems/balanced-binary-tree/
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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int leftmax = height(root.left);

        if (leftmax == -1)
            return -1;

        int rightmax = height(root.right);

        if (rightmax == -1)
            return -1;

        if (Math.abs(leftmax - rightmax) > 1)
            return -1;

        return Math.max(leftmax, rightmax) + 1;
    }
}
