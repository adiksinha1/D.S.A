/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int majorityElement(int arr[]) {
        int n=arr.length;
        // code here
        Arrays.sort(arr);
        
        int candidate = arr[n / 2];

        int count = 0;
        for (int num : arr) {
            if (num == candidate)
                count++;
        }

        return (count > n / 2) ? candidate : -1;
    }
}
