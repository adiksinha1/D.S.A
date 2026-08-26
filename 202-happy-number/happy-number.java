class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        
        while(n!=1)
        {
            if(h.contains(n))
            return false;
            h.add(n);
            int m=0;
            while(n>0)
            {
                m+=Math.pow(n%10,2);
                n=n/10;
            }
            n=m;

        }
        return true;
        
        
    }
}