class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        for(int key : map.keySet()) {
            int count = map.get(key);
            result += count * (count - 1) / 2;
        }
        return result;
    }
}