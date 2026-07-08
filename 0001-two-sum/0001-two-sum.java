class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - nums[i];
            if(map.containsKey(y)) {
                if(map.get(y) != i) {
                    ans[0] = i;
                    ans[1] = map.get(y);
                    break;
                }
            }
        }
        return ans;
    }
}