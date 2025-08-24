class Solution {
    public int binarySearch(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int findPivotWithDuplicates(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid < high && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > low && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                if (low < high && nums[low] > nums[low + 1]) {
                    return low;
                }
                if (high > low && nums[high - 1] > nums[high]) {
                    return high - 1;
                }
                low++;
                high--;
            } else if (nums[low] < nums[mid] || (nums[low] == nums[mid] && nums[mid] > nums[high])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1) != -1;
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
    }
}
