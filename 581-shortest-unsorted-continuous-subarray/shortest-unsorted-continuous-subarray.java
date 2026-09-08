class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int s[]=new int[n];
        int st=n;
        int e=0;
        for(int i=0;i<n;i++)
        s[i]=nums[i];
        Arrays.sort(s);
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=s[i])
            {
                st=Math.min(i,st);
                e=Math.max(i,e);
            }
        }
        return e-st>0?e-st+1:0;


        
    }
}