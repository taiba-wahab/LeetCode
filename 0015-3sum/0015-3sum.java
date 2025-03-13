class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int size = nums.length;
        for(int i = 0; i < size - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int j = i + 1, k = size - 1;
            while(j < k) {
                int sum  = nums[j] + nums[k];
                if(sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
                else if(sum < target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return result;
    }
}