//Order doesn't matter in the result set.
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n <= 0 || n < k) return res;
        helper(n, k, 1, new ArrayList<Integer>(), res);
        return res;
    }
    private void helper(int n, int k, int pos, List<Integer> item, List<List<Integer>> res) {
        if(item.size() == k){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = pos; i <= n; i++){
            item.add(i);
            helper(n, k, i + 1, item, res);
            item.remove(item.size() - 1);
        }
    }
}
