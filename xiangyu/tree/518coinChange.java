// You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
//
// Note: You can assume that
//
// 0 <= amount <= 5000
// 1 <= coin <= 5000
// the number of coins is less than 500
// the answer is guaranteed to fit into signed 32-bit integer
// Example 1:
//
// Input: amount = 5, coins = [1, 2, 5]
// Output: 4
// Explanation: there are four ways to make up the amount:
// 5=5
// 5=2+2+1
// 5=2+1+1+1
// 5=1+1+1+1+1
// Example 2:
//
// Input: amount = 3, coins = [2]
// Output: 0
// Explanation: the amount of 3 cannot be made up just with coins of 2.
// Example 3:
//
// Input: amount = 10, coins = [10]
// Output: 1

//DP是更好的方法

class Solution {
    public int change(int amount, int[] coins) {
        List<List<Integer>> res = new ArrayList<>();
        if (coins == null) {
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        combination(amount, coins, 0, list, res);
        return res.size();
    }

    private void combination(int amount, int[] coins, int index, List<Integer> list, List<List<Integer>> res) {
        // terminate condition
        if (index == coins.length - 1) {
            if (amount % coins[0] == 0) {
                list.add(amount / coins[0]);
                res.add(list);
                list.remove(list.size() - 1);
            }
            return;
        }
        // n 叉树情况
        for (int i = 0; i * coins[coins.length - index - 1] <= amount; i++) {
            list.add(i);
            combination(amount - i * coins[coins.length - index - 1], coins, index + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
