/**
 * Problem Link : https://leetcode.com/problems/search-a-2d-matrix/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int n=matrix.length;
     int m=matrix[0].length;
     int i=0;
     int j=m-1;
     int c=0;
     while(i<n&&j>=0)
     {
        if(matrix[i][j]==target)
        {
            c++;
           return true;
           
        }
        else if(matrix[i][j]>target)
           j--;
        else 
            i++;
        

     }
    
       return false;
        
    }
}
