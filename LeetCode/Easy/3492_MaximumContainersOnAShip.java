/**
 * Problem Link : https://leetcode.com/problems/maximum-containers-on-a-ship/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
       return (n*n > maxWeight/w) ? maxWeight / w : n*n;
        
    }
}
