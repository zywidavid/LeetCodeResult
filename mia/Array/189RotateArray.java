/**
* 12345678 -> 87654321 -> 876543 12 -> 345678 12
  123 -> 321 -> 231
  注意 k 可能 比 n 大， reverse()方法 需要能 快速手写出来
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
