class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int left = 0;
        int right = k - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = left; i <= right; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        while(right < nums.length) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> { 
                if(a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0];
            });
            for(int val : freq.keySet()) {
                pq.offer(new int[]{val, freq.get(val)});
            }
            int sum = 0;
            int t = x;
            while(t != 0 && (!(pq.isEmpty()))) {
                int[] top = pq.poll();
                int value = top[0];
                int frequency = top[1];
                sum += value * frequency;
                t--;
            }
            ans.add(sum);
            int key1 = nums[left];
            int count = freq.getOrDefault(key1, 0) - 1;
            if(count <= 0) freq.remove(key1);
            else freq.put(key1, count);
            left++;
            right++;
            if(right >= nums.length) break;
            int key2 = nums[right];
            freq.put(key2, freq.getOrDefault(key2, 0) + 1);
        }
        int[] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}