class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        for(int i = 0; i < strs[0].length(); i++){
            String prefix = strs[0].substring(0, i+1);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() < prefix.length() || !prefix.equals(strs[j].substring(0, i+1))) {
                    return strs[j].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
