/**
* 两个相同的数 xor 的结果是 0
5 ^ 5 = 0
5 ^ 0 = 5
*/
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n : nums){
            res ^= n;
        }
        return res;
    }
}
