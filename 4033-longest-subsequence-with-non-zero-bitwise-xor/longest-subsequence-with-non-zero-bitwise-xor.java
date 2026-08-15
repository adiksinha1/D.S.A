class Solution {
    public int longestSubsequence(int[] nums) {
        int a = 0;
        int c = 0;

        for (int i :nums) {
            a = a ^ i;

            if (i!=0)
                c++;
        }

        if (a != 0)
            return nums.length;

        if (c == 0)
            return 0;

        return nums.length - 1;
    }
}