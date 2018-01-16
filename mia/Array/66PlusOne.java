/**
* 从数组最末 从后往前 加，
注意就是如果最后carry还是1，比如出现999这种，
只能建立个新的result array。
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }
        if(carry == 0) {
            return digits;
        }else{
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}
