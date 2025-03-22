class Solution {
    public int maxProfit(int[] prices) {
        int Buy = Integer.MAX_VALUE;
        int profit = 0;
        int MaxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(Buy<prices[i]){
                profit = prices[i] - Buy;
            MaxProfit = Math.max(MaxProfit,profit);
            }
            else{
                Buy = prices[i];
            }
        }
        return MaxProfit;
    }
}
// class Solution {
//     public int maxProfit(int[] prices) 
//     {
//         int BuyPrice = Integer.MAX_VALUE;
//         int MaxProfit = 0;

//         for(int i=0; i<prices.length; i++)
//         {
//             if(BuyPrice<prices[i])
//             {
//                 int profit = prices[i]-BuyPrice;
//                 MaxProfit = Math.max(MaxProfit, profit);
//             }

//             else
//             {
//                 BuyPrice = prices[i];
//             }
//         }
//         return MaxProfit;
//     }
// }