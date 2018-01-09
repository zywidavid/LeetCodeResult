//The idea is really similar to 40 Combination Sum II
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(k < 0 || n < 0) return res;
        helper(n, k, 1, new ArrayList<Integer>(), res);
        return res;
    }

    private void helper(int n, int k, int pos, List<Integer> item, List<List<Integer>> res) {
        if(n == 0 && item.size() == k) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        if(n < 0 || item.size() > k) return;
        for(int i = pos; i <= 9; i++){
            item.add(i);
            helper(n - i, k, i+1, item, res);
            item.remove(item.size() - 1);
        }
    }
}
