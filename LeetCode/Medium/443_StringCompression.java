/**
 * Problem Link : https://leetcode.com/problems/string-compression/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int j = 0;
        int write = 0;

        while (j < chars.length) {

            int count = 0;

            while (j < chars.length && chars[i] == chars[j]) {
                count++;
                j++;
            }

            chars[write++] = chars[i];

            if (count > 1) {
                String s = Integer.toString(count);
                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                }
            }

            i = j;
        }

        return write;
    }
}
