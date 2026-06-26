/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}

