/**
 * Problem Link : https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        
        for(String a:patterns)
        {
            if(word.indexOf(a)!=-1)
            count++;
            
        }
        return count;
    }
}
