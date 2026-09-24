class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int maxp=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int currp=prices[i]-buy;
            maxp=Math.max(currp,maxp);
        }
        return maxp;
    }
}