class Solution {
    public int maxProfit(int[] prices) {
        int cureent = prices[0];
        int max = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<cureent){
                cureent = prices[i];
            }
            max = Math.max(max,prices[i]-cureent);
        }
        return max;
    }
}