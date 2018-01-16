class Solution {
    public String reverseString(String s) {
        char[] str = s.toCharArray();
        reverse(str, 0, str.length - 1);
        return new String(str);
    }
    private void reverse(char[] str, int start, int end){
        while(start < end){
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
}
