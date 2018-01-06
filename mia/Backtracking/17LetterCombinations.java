class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits == null || digits.length() == 0) return res;
        res.add("");
        Map<Character, String> map = getDigitLetterMap();
        for(int i = 0; i < digits.length(); i++){
            String letters = map.get(digits.charAt(i));
            ArrayList<String> tmp = new ArrayList<String>();
            for(int j = 0; j < res.size(); j++){
                for(int k = 0; k < letters.length(); k++){
                    tmp.add(res.get(j) + Character.toString(letters.charAt(k)));
                }
            }
            res = tmp;
        }
        return res;
    }

    private Map<Character, String> getDigitLetterMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('0', " ");
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}
