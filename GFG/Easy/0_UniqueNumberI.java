/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-unique-number/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int findUnique(int[] arr) {
        // code here
        int a=0;
        for(int i:arr)
        a^=i;
        return a;
        
    }
}
