/** 
getOrderKey不同实现，会影响速度吗？
*/
public List<List<String>> groupAnagrams(String[] words) {
    HashMap<String, List<String>> map = new HashMap<>();
    for(String word : words) {
        String key = getKey(word);
        if(map.containsKey(key)){
            map.get(key).add(word);
        }else{
            map.put(key, new ArrayList<>(Arrays.asList(word)));
        }
    }
    return new ArrayList<>(map.values());
}

private String getKey(String word) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}

//TODO: will this be quicker than getKey?
private String getHashKey(String word) {
    //https://stackoverflow.com/questions/18781106/generate-same-unique-hash-code-for-all-anagrams
}