public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(pairs.containsKey(nums[i])){
                res[0] = pairs.get(nums[i]);
                res[1] = i;
            }else{
                pairs.put(target - nums[i], i);
            }
        }
        return res;
    }
}
