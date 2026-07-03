/**
 * Problem Link : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i:weights)
        {
         low=Math.max(low,i);
         high+=i;
        }
        int middle;
        while(low<high)
        {
             middle=low+(high-low)/2;
             int sum=0;
             int c=1;
            
             for(int i:weights)
             {
                if(sum+i>middle)
                {
                    c++;
                    sum=i;
                }
                else
                sum+=i;

             }
             if(c>days)
             low=middle+1;
             else
             high=middle;

        }
        return low;
        
    }
}
