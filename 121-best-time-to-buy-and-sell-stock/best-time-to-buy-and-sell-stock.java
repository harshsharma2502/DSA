class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > buy){
                profit = prices[i] - buy;
                maxProfit = Integer.max(maxProfit,profit);
            }

            else{
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}