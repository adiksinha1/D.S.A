class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> h=new TreeMap<>();
         for(int i=0;i<nums1.length;i++)
        {
                h.put(nums1[i][0],nums1[i][1]);
            
        }
         for(int i=0;i<nums2.length;i++)
        {
            
                h.put(nums2[i][0],h.getOrDefault(nums2[i][0],0)+nums2[i][1]);
            
        }
        int a[][]=new int[h.size()][2];
        int id = 0;

         for (Map.Entry<Integer, Integer> entry : h.entrySet())
        {
            a[id][0] = entry.getKey();
            a[id][1] = entry.getValue();
            id++;
        }
        return a;
        
    }
}