/**
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0],sum=0;
        for(int i:prices)
        {
        if(i<low)
        low=i;
        else if((i-low)>sum)
        sum=i-low;
       }
       return sum;

        
        
    }
}

