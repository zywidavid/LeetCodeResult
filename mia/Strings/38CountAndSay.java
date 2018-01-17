class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder();
        res.append("1");
        while(n > 1){
            res = countString(res);
            n--;
        }
        return res.toString();
    }
    private StringBuilder countString(StringBuilder s){
        StringBuilder res = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(i == s.length() - 1){
                res.append(count);
                res.append(s.charAt(i));
            }else if(s.charAt(i) == s.charAt(i+1)){
                count ++;
            }else{
                res.append(count);
                res.append(s.charAt(i));
                count = 1;
            }
        }
        return res;
    }
}
