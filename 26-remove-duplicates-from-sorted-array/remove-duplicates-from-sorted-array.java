class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int count=0;
        int a=0;
        for(int i:nums)
        {
            if(!h.contains(i))
            {
                h.add(i);
                count++;
                nums[a++]=i;
            }
        }
        return count;
        
    }
}