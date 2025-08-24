class Solution {
    boolean isPossible(int[] nums, int k, int maxSum) {
        int sum = 0;
        int count = 1;
        for(int i = 0; i < nums.length; i++) {
            if(sum + nums[i] > maxSum) {
                count++;
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
        }
        return count <= k;
    }
    public int splitArray(int[] nums, int k) {
        int ans = -1;
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low <= high) {
            int mid = low + (high - low) / 2;
            boolean possible = isPossible(nums, k, mid);
            if(possible) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}