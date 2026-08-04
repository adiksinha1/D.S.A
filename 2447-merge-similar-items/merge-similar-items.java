class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<items1.length;i++)
        {
                h.put(items1[i][0],items1[i][1]);
            
        }
         for(int i=0;i<items2.length;i++)
        {
            
                h.put(items2[i][0],h.getOrDefault(items2[i][0],0)+items2[i][1]);
            
        }
        for (Map.Entry<Integer, Integer> entry : h.entrySet())
         {
                l.add(Arrays.asList(entry.getKey(), entry.getValue()));
         }
     return l;

        
    }
}