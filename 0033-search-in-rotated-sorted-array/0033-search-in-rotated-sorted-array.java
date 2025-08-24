class Solution {
    public int binarySearch(int [] nums, int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int findPivot(int [] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mid < high && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            else if(mid >  low && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            else if(nums[mid] <= nums[low]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target) {
            return pivot;
        }
        if(nums[0] <= target) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}