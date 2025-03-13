class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;
        int answer = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < size - 2; i++) {
            int j = i + 1;
            int k = size - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) {
                    return sum;
                }
                if(Math.abs(target - answer) > Math.abs(target - sum))
                answer = sum;
                else if(sum < target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return answer;
    }
}