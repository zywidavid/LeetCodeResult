/**
* 假设 X 是第一次选中的购买位， X‘比X小，是下一次选中的购买位：
那么对于任何一个 在 X’之后出现的抛售位 Y, (Y- X') 注定要 大于 （Y－X）所以可以用X‘来代替X。
而对于 (X, X')中间这个range， 即使存在 有的数 大于 X'很多 也无法使用，
因为必须  先买后卖。
*/
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int profit = 0;
        int oneTransaction = 0;
        int buyPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            oneTransaction = prices[i] - buyPrice;
            profit = Math.max(oneTransaction, profit);
            if(prices[i] < buyPrice) buyPrice = prices[i];
        }
        return profit;
    }
}
