class Solution {
    // - 2^31 ~ 2^31 - 1
    //−2,147,483,648 to 2,147,483,647
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) return 0;
        int res = 0;
        boolean isPos = x > 0;
        if(!isPos) x = Math.abs(x);
        while(x != 0){
            int tail = x % 10;
            if(isPos && res > (Integer.MAX_VALUE - tail)/10 || !isPos && res > (Integer.MIN_VALUE + tail)/(-10)){
              return 0;
            }else{
                res = res*10 + tail;
            }
            x = x/10;
        }
        return isPos ? res : (-1)*res;
    }
}
