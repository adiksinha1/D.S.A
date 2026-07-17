/**
 * Problem Link : https://leetcode.com/problems/remove-element/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
                
            }
        }
        return count;
        
    }
}
