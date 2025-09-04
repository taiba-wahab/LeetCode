class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n % k != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int m = Collections.max(map.values());
        return (long)m * k <= n;
    }
}