class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        char[] nums = str.toCharArray();
        boolean signOccurs = false;
        boolean digitOccurs = false;
        boolean isPos = true;
        int res = 0;
        for(char c : nums){
            int result = isPos ? res : (-1)*res;
            if(c == ' ') {
                if(signOccurs || digitOccurs) return result;
            }
            else if(c == '+' || c == '-'){
                if(signOccurs || digitOccurs) return result;
                else signOccurs = true;
                isPos = c != '-';
            }
            else if(isValidDigit(c)){
                if(!digitOccurs) digitOccurs = true;
                int digit = c - '0';
                if(isPos && res > (Integer.MAX_VALUE - digit)/10) return Integer.MAX_VALUE;
                if(!isPos && res > (Integer.MIN_VALUE + digit)/(-10)) return Integer.MIN_VALUE;
                res = res * 10 + digit;
            }
            else{
                return result;
            }
        }
        return isPos ? res : (-1)*res;
    }

    private boolean isValidDigit(char c) {
        return c >= '0' && c <= '9';
    }

}
