class Solution {
    public int helper(int[] coins, int amount,int[] dp) {
        if(amount==0){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount-coins[i]>=0){
                int SubAns=0;
                if(dp[amount-coins[i]]!=-1){
                    SubAns=dp[amount-coins[i]];
                }else{
                SubAns=helper(coins,amount-coins[i],dp);
                }
                if(SubAns!=Integer.MAX_VALUE && SubAns+1<ans){
                    ans=SubAns+1;
                }
                
            }
        }
        return dp[amount]=ans;
    }


    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
    int ans=helper(coins,amount,dp);
        return ans==Integer.MAX_VALUE? -1:ans;
        
        
    }
}