class Solution {
    public String mergeAlternately(String word1, String word2) {
        String r="";
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        while(i<n||j<m)
        {
            if(i<n)
            r=r+word1.charAt(i++);
            if(j<m)
            r=r+word2.charAt(j++);
        }

        
        return r;
    }
}