class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], maxProfit = 0;
        for(int x: prices) {
            min = Math.min(min, x);
            maxProfit = Math.max(maxProfit, x-min);
        }
        return maxProfit;
    }
}