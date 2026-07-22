/**
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int j=0;
        int a;
        for(int i=0;i<nums.length;i++)
        {
            if(map.getOrDefault(nums[i],0)>=2)
            {
            a=map.getOrDefault(nums[i],0);
            nums[j++]=nums[i];
            nums[j++]=nums[i];
            i+=a-1;
            }
            else
            nums[j++]=nums[i];

        }
        return j;

    }
}
