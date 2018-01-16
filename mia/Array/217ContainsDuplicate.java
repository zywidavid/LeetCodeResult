/**
* 没啥好说的。先排序 （时间换空间）
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
