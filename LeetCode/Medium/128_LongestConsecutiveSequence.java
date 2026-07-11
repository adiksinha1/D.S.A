/**
 * Problem Link : https://leetcode.com/problems/longest-consecutive-sequence/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int max = 1;
        int s = 1;

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1])
                continue;

            if(nums[i] + 1 == nums[i + 1]) {
                s++;
            } else {
                s = 1;
            }

            max = Math.max(max, s);
        }

        return max;
    }
}
