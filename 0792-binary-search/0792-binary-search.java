class Solution {
    public int search(int[] nums, int target, int idx) {
        if(idx == nums.length) {
            return -1;
        }
        else if(nums[idx] == target) {
            return idx;
        }
        else {
            return search(nums, target, idx + 1);
        }
    }
    public int search(int[] nums, int target) {
        int answer = search(nums, target, 0);
        return answer;
    }
}