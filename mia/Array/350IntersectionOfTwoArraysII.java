/**
* 这个题有几个牛逼的follow up还没有看。抽空搞
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = toMap(nums2);
        List<Integer> res = new ArrayList<Integer>();
        for(int i : nums1) {
            if(map.containsKey(i) && map.get(i) > 0){
                map.put(i, map.get(i) - 1);
                res.add(i);
            }
        }
        return toArray(res);
    }
    private Map<Integer,Integer> toMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
           if(map.containsKey(i)) {
               map.put(i, map.get(i) + 1);
           }else{
               map.put(i, 1);
           }
        }
        return map;
    }
    private int[] toArray(List<Integer> res){
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);;
        }
        return result;
    }
}
