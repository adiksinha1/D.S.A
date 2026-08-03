class Solution {
    public String stoneGameIII(int[] stoneValue) {
       int n = stoneValue.length;
        int[] p = new int[n + 1];

      

        for (int i = n - 1; i >= 0; i--) {

            p[i] = Integer.MIN_VALUE;
            int sum = 0;

            for (int k = 0; k < 3 && i + k < n; k++) {

                sum += stoneValue[i + k];

                p[i] = Math.max(p[i], sum - p[i + k + 1]);
            }
        }

        if (p[0] > 0)
            return "Alice";
        else if (p[0] < 0)
            return "Bob";
        else
            return "Tie";
    }
}