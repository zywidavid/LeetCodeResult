class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++){
            if(map.containsKey(str[i])) {
                map.put(str[i], -1);
            }else{
                map.put(str[i], i);
            }
        }
        for(int i = 0; i < str.length; i++){
            if(map.get(str[i]) >= 0) return i;
        }
        return -1;
    }
}
