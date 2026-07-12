/**
 * Problem Link : https://leetcode.com/problems/rank-transform-of-an-array/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] a = Arrays.copyOf(arr, arr.length);

        Arrays.sort(a);

        HashMap<Integer, Integer> h = new HashMap<>();

        int rank = 1;

        for (int i = 0; i < a.length; i++) {

            if (!h.containsKey(a[i])) {
                h.put(a[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = h.get(arr[i]);
        }

        return arr;
    }
}
