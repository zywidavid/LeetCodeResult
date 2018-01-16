/**
* tail表示当前的最后一个非重复元素的坐标，（tail+1) 为可以摆放新的非重复元素的位置
如果发现了一个新的不同的元素，则把他拷贝到tail＋1位置，同时更新tail。
题眼： Sorted Array
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int tail = 0;
        for(int n: nums){
          if(nums[tail] != n) {
            nums[++tail] = n;
          }
        }
        return tail + 1;
    }
}
