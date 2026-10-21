class Solution {
    public int maxProfit(int[] prices) {

        int buyp=Integer.MAX_VALUE;
        int maxp=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyp){
                buyp=prices[i];
            }
            int currp=prices[i]-buyp;
            maxp=Math.max(maxp,currp);
        }
        return maxp;
        
    }
}