/*class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int n=coins.length;
        if(amount<coins[0])
        return -1;
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            if(sum>)
        }

        
        
    }*/
    class Solution {
    public int coinChange(int[] coins, int amount) {
       /* Arrays.sort(coins);
        int k=coins.length-1;
        int count=0;
       while(k>=0){
        if(amount==0){
            return count;
        }
        if(amount>=coins[k]){
        amount=amount-coins[k];
        count++;
        }
        else{
            k--;
        }
        
       }
       return -1;
    */
    if(amount < 0)return 0;
    int dp[]=new int[amount+1];
    for(int i=1;i<=amount;i++){
        dp[i]=Integer.MAX_VALUE;
        for(int coin:coins){
            if(coin<=i && dp[i-coin]!=Integer.MAX_VALUE)
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
        }

    }
    return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
