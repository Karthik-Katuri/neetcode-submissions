class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        int minBuy = prices[0];

        for(int sell:prices){
            maxProfit = Math.max(maxProfit,sell-minBuy);
            minBuy = Math.min(sell,minBuy);
        }
        return maxProfit;
    }
}
