class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[n + 1];
        for(Integer key : map.keySet()) {
            int freq = map.get(key);
            if(bucket[freq] == null) {     
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int[] ans = new int[k];
        for(int i = n; i >= 0 && result.size() < k; i--) {
            if(bucket[i] != null) {
                for(int num : bucket[i]) {
                    result.add(num);
                    if(result.size() == k)
                        break;
                }
            }
        }
        for(int i = 0; i < k; i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}