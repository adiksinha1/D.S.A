/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int missingNumber(int[] arr) {
        // code here
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
            
        }
        int i;
        for(i=1;i<1000000;i++)
        {
            if(h.contains(i))
            continue;
            else
            break;
        }
        return i;
    }
}

