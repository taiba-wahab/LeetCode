class Solution {
    public int binarySearch(int[] nums, int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                return binarySearch(nums, target, low, mid - 1);
            }
            else {
                return binarySearch(nums, target, mid + 1, high);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}