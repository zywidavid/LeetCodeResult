//TODO: Iterative?
//Order matters here, so [1,2,3] and [3,2,1] os dofferemt
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return res;
        helper(nums, new boolean[nums.length], new ArrayList<Integer>(), res);
        return res;
    }
    private static void helper(int[] nums, boolean[] isUsed, List<Integer> item, List<List<Integer>> res){
        if(item.size() == nums.length) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(isUsed[i] == true) continue;
            item.add(nums[i]);
            isUsed[i] = true;
            helper(nums, isUsed, item, res);
            isUsed[i] = false;
            item.remove(item.size() - 1);
        }
    }
}
