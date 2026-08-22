class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
      int s=0,p=1;
      while(n>0)
      {
        s+=n%10;
        p=p*(n%10);
        n=n/10;
      }
      if(m%(s+p)==0)
      return true;
      return false;
        
    }
}