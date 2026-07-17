/**
 * Problem Link : https://leetcode.com/problems/length-of-last-word/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();            
        int a = s.lastIndexOf(' ');
        return s.length() - a - 1;
        
    }
}
