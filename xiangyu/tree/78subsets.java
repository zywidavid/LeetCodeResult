// Given a set of distinct integers, nums, return all possible subsets (the power set).
//
// Note: The solution set must not contain duplicate subsets.
//
// For example,
// If nums = [1,2,3], a solution is:
//
// [
//   [3],
//   [1],
//   [2],
//   [1,2,3],
//   [1,3],
//   [2,3],
//   [1,2],
//   []
// ]

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null) {
            return res;
        }
        List<Integer> list = new ArrayList<>();
        helper(nums, list, 0, res);
        return res;
    }
    private void helper(int[] nums, List<Integer> list, int index, List<List<Integer>> res) {
        // 每次触底时都加入到res中
        if (index == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        // not pick
        helper(nums, list, index + 1, res);
        // pick
        list.add(nums[index]);
        helper(nums, list, index + 1, res);
        list.remove(list.size() - 1);
    }
}
