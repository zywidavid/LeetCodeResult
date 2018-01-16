/**
* 只要有利润 就先买后卖。类似于 只要有递增序列 就加到结果里。
*/
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i < prices.length; i ++){
            if(prices[i] > prices[i-1]) {
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }
}
