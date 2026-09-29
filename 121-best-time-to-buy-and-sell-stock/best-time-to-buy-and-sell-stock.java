class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=Integer.MAX_VALUE;
        int maxp=0;

        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int currp=prices[i]-buy;
            maxp=Math.max(maxp,currp);
        }
        return maxp;
    }
}