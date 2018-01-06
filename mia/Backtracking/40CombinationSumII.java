class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        helper(nums, 0, target, new ArrayList<Integer>(), res);
        return res;
    }
    private void helper(int[] nums, int start, int target, List<Integer> item, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        if(target < 0 || start == nums.length) return;
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            item.add(nums[i]);
            helper(nums, i + 1, target - nums[i], item, res);
            item.remove(item.size() - 1);
        }
    }

} 
