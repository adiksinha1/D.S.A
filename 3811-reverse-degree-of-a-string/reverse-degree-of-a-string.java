class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int pro=1;
       for(int i=0;i<s.length();i++)
       {
        int ind=s.charAt(i)-'a';
        int rev=26-ind;
        pro=(i+1)*rev;
        sum=sum+pro;
       }
       return sum;
    }
}