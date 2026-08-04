class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        List<Integer> h=new ArrayList<>();
        for(int i:nums)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int a[]=new int[max+1];
        for(int i:nums)
        {
            a[i]++;
        }
        for(int i=min;i<max;i++)
        {
            if(a[i]==0)
            h.add(i);

        }
        return h;


    }
}