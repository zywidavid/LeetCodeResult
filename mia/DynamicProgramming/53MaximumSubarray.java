//local 如果直接set成0， 不include nums[i]，会出错。重点就是 local必须是包含当前元素的局部最优解
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int global = nums[0];
        int local = 0;
        for(int i = 0; i < nums.length; i++) {
            local = Math.max(local + nums[i], nums[i]);
            global = Math.max(local, global);
        }
        return global;
    }
}
