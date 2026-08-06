class Solution {
    public long countSubstrings(String s, char c) {
        int count=0; 
        long ans=0;
        for(char i:s.toCharArray()){
            if(i==c){
                count++;
                ans+=count; 
            }
        }
        return ans;
        
    }
}