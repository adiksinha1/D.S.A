class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int x=26;
        int sum=0;
        for(char c='a';c<='z';c++)
        {
            h.put(c,x--);
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
           sum+=((i+1)* h.get(c));


        }
        return sum;
    }
}