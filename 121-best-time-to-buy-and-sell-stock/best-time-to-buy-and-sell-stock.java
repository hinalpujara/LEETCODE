class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            // Update minPrice if current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate profit if selling at current price
            int profit = prices[i] - minPrice;
            if(maxProfit < profit){
                maxProfit = profit;
            }
            // maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
}
