class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        for(int i =1;i<prices.length;i++){
            if(min_price>prices[i]){
                min_price = prices[i];
            }
            else if(prices[i]-min_price>max_profit){
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
        
    }
}