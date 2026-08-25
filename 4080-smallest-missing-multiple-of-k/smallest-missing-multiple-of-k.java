class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        int max=0;
        for(int i:nums)
        {
        h.add(i);
        max=Math.max(i,max);
        }
        int i;
        for(i=1;i*k<=max;i++)
        {
            int l=i*k;
            if(h.contains(l))
            continue;
            else
            break;
        } 
        int l=i*k;
        return l;        
        
    }
}