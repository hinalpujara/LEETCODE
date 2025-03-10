class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++)
        {
            int sellPrice = prices[i];
            if(sellPrice < buyPrice)
            {
                buyPrice = sellPrice;
            }
            else if(sellPrice > buyPrice)
            {
                profit  += (sellPrice - buyPrice);
                buyPrice = sellPrice;
            }
        }
        return profit;
    }
}
