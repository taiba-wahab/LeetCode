class Solution {
    public int search(int [] nums, int low, int high, int key) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == key) {
                return 1;
            }
            else if(nums[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return 0;
    }
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        int answer = 0;
        for(int i = 0; i < size; i= i + 2) {
            if(search(nums, i + 1, size - 1, nums[i]) == 0) {
                answer = nums[i];
                break;
            }
        }
        return answer;
    }
}