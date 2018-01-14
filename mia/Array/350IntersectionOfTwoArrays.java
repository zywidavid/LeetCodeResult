class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map2 = toMap(nums2);
        List<Integer> res = new ArrayList<Integer>();
        for(int i : nums1) {
            if(map2.containsKey(i) && map2.get(i) > 0){
                map2.put(i, map2.get(i) - 1);
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);;
        }
        return result;
    }

    private HashMap<Integer,Integer> toMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
           if(map.containsKey(i)) {
               map.put(i, map.get(i) + 1);
           }else{
               map.put(i, 1);
           }
        }
        return map;
    }
}
