class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxii = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            maxii = Integer.max(profit,maxii);
        }
        return maxii;
    }
}