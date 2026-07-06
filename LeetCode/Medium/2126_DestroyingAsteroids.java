/**
 * Problem Link : https://leetcode.com/problems/destroying-asteroids/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long max=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++)
        {
            if(max>=asteroids[i])
            max=max+asteroids[i];
            else
            return false;
        }
        return true;
        
    }
}
