/**
 * Problem Link : https://leetcode.com/problems/find-peak-element/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int findPeakElement(int[] nums) {
       /*int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }*/
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]>max)
        {
            max=nums[i];
            idx=i;
        }
        }
        return idx;
        
    }
}
