class Solution {
    public String mergeAlternately(String word1, String word2) {
        String r="";
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        while(i<n&&j<m)
        {
            r=r+word1.charAt(i++)+word2.charAt(j++);
        }
        while(i<n)
        {
            r=r+word1.charAt(i++);
        }
        while(j<m)
        {
            r=r+word2.charAt(j++);
        }


        
        return r;
    }
}