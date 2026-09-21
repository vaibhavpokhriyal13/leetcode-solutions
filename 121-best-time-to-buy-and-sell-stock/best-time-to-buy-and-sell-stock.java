class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=Integer.MAX_VALUE;
        int maxP=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int currP=prices[i]-buy;
            maxP=Math.max(currP,maxP);
        }

        return maxP;

        
    }
}