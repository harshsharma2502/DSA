class Solution {
    public int maxProfit(int[] prices) {
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(BuyPrice<prices[i]){
                int profit = prices[i] - BuyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else
            {
                BuyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}