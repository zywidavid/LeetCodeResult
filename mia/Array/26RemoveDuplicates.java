class Solution {
    public int removeDuplicates(int[] nums) {
        int tail = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[tail] != nums[i]) {
                nums[++tail] = nums[i];
            }
        }
        return tail + 1;
    }
}
