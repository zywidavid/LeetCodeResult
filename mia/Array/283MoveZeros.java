/**
*
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int tail = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[tail++] = nums[i];
            }
        }
        for(int i = tail; i < nums.length; i++) {
            nums[i] = 0;
        }
        return;
    }
}
