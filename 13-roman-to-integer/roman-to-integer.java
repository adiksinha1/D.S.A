class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int cur=val(s.charAt(i));
            if(i+1<s.length()&&cur<val(s.charAt(i+1)))
            ans-=cur;
            else
            ans+=cur;
        }
        return ans;
        
    }
    private int val(char a)
    {
        return switch(a)
        {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            default -> 1000;
        };
    }
}