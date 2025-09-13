class Solution {
    public int binarySearch(int[] arr, int target, int low, int high) {
        if(low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[low] <= arr[mid]) {
            if(target >= arr[low] && target <= arr[mid]) {
                return binarySearch(arr, target, low, mid - 1);
            }
            else {
                return binarySearch(arr, target, mid + 1, high);
            }
        }
            else {
                if (target >= arr[mid] && target <= arr[high]) {
                    return binarySearch(arr, target, mid + 1, high);
                } 
            else {
                return binarySearch(arr, target, low, mid - 1);
            }
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}