class Solution {
    public int coinChange(int[] coins, int amt) {
        int[] dp=new int[amt+1];
        dp[0]=0;
        for(int i=1;i<=amt;i++){
            dp[i]=amt+1;
        }
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amt;j++){
                int bal=j-coins[i];
                if(dp[bal]+1<dp[j]){
                    dp[j]=dp[bal]+1;
                }
            }
        }
        if(dp[amt]==amt+1){
            return -1;
        }
        return dp[amt];
    }
}