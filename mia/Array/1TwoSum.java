/**
* 给定一个数组（未排序），找到和为目标数的pair；

用一个HashMap来记录: 每次访问一个element， 如果这个element没有在hashmap里出现，
就存储 ［target - element, 当前元素的位置］
这样如果下次这个元素出现了，那么说明map.get(element)就是 与element相加和为target的元素的位置
注意 添加结果到res数组的顺序。

空间 是 O(N) 时间是 O(N)
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(pairs.containsKey(nums[i])){
                res[0] = pairs.get(nums[i]);
                res[1] = i;
            }else{
                pairs.put(target - nums[i], i);
            }
        }
        return res;
    }
}
