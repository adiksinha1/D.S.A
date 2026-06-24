/**
 * Problem Link : https://leetcode.com/problems/valid-palindrome/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public boolean isPalindrome(String s) {
      String a="";
      s=s.toLowerCase();
      
      for(char i:s.toCharArray())
      {
       if(Character.isLetterOrDigit(i))
       a+=i;
      }
      StringBuilder sb=new StringBuilder(a);
      sb.reverse();
      if(a.equals(sb.toString()))
      return true;
      else
      return false;


      
        
    }
}
