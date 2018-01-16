/**
* tail表示 当前可以 用于 摆放 一个 非零 元素的位置。
  想明白tail在不同题目里的含义
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
