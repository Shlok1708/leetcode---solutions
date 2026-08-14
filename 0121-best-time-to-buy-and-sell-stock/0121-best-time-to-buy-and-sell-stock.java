class Solution {
    public int maxProfit(int[] prices) {
        // buy is first day to buy stock because brfor shell stock buy stock 
       int buy = prices[0];
       int max = 0;
       for(int i = 1;i<prices.length;i++){
        // compare to all array minimum value 
        if(prices[i]<buy){
            buy = prices[i];
        }
        max = Math.max(max,prices[i]-buy);

       
    }return max;
}
}