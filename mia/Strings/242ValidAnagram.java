class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t== null || s.length() != t.length()) return false;
        Map<Character, Integer> s1 = toMap(s.toCharArray());
        Map<Character, Integer> t1 = toMap(t.toCharArray());
        for(int i = 0; i < s.length(); i++){
            if(!s1.get(s.charAt(i)).equals(t1.get(s.charAt(i)))) return false;
        }
        return true;
    }

    private Map<Character,Integer> toMap(char[] str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str) {
           if(map.containsKey(c)) {
               map.put(c, map.get(c) + 1);
           }else{
               map.put(c, 1);
           }
        }
        return map;
    }
}
