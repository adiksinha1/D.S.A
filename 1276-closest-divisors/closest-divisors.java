class Solution {
    public int[] closestDivisors(int num) {
        int g=num+1;
        int g1=num+2;
        int n=(int)Math.sqrt(num+1);
        int m=(int)Math.sqrt(num+2);
        int l=0;
        int k=0;
        int a[]=new int[2];
        while(n>0)
        {
            if(g%n==0)
            {
                l=g/n;
                break;

            }
             n--;

        }
        int diff1=Math.abs(l-n);
         while(m>0)
        {
            if(g1%m==0)
            {
                k=g1/m;
                break;                

            }
             m--;

        }
        int diff2=Math.abs(k-m);
        if(diff1<diff2)
        {
            a[0]=l;
            a[1]=n;
        }
        else
        {
            a[0]=k;
            a[1]=m;
        }
        return a;
        
    }
}