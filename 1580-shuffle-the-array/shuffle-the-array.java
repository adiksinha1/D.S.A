class Solution {
    public int[] shuffle(int[] nums, int n) {
     int len = nums.length;
        int[] a = new int[len];
        for (int i = 0; i < len; i++)
         {
            if (i % 2 == 0)
             {
                
                a[i] = nums[i / 2];
            }
             else 
            {
                
                a[i] = nums[n + (i / 2)];
            }
        }
        return a;
        
    }
}