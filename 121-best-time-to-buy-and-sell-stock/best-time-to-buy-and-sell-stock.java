class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
        int firstday = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(firstday > prices[i]){
                firstday =  prices[i];
            }

            int n = prices[i] - firstday;
            
            if(profit < n){
                profit = n;
            }
        }

        return profit;
    }
}