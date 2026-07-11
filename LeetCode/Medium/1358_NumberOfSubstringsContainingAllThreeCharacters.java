/**
 * Problem Link : https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0;
        int[] a = {-1, -1, -1};

        for (int i = 0; i < s.length(); i++) {
            a[(s.charAt(i) & 31) - 1] = i;
            res += Math.min(a[0], Math.min(a[1], a[2])) + 1;
        }

        return res;
    }
}
