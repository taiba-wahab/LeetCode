class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        // first window
        for(int i = 0; i < k; i++) {
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offer(i);
        }
        ans.add(nums[dq.peek()]);
        // remaining windows
        for(int i = k; i < nums.length; i++) {
            // condition check :  size of dq cannot be greater than k 
            if(dq.peek() == (i - k)) {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offer(i);
            ans.add(nums[dq.peek()]);
        }
        int [] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}