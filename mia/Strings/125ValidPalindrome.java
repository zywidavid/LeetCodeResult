class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end){
            if(!isValidLetter(s.charAt(start))) {
                start ++;
                continue;
            }
            if(!isValidLetter(s.charAt(end))) {
                end --;
                continue;
            }
            if(!isSameChar(s.charAt(start), s.charAt(end))) return false;
            start ++;
            end --;
        }
        return true;
    }
    private boolean isValidLetter(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
    private boolean isSameChar(char s, char t){
        return Character.toLowerCase(s) == Character.toLowerCase(t);
    }
}
