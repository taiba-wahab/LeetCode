class Solution {
    public int first_occurence(int [] nums, int key, int low, int high) {
        int first_occ = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == key) {
                first_occ = mid;
                high = mid - 1;
            }
            else if(nums[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return first_occ != -1 ? first_occ : low;
    }
    public int last_occurence(int [] nums, int key, int low, int high) {
        int last_occ = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == key) {
                last_occ = mid;
                low = mid + 1;
            }
            else if(nums[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return last_occ != -1 ? last_occ : high;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        Arrays.sort(nums);
        int size = nums.length;
        for(int i = 0; i < size; i++) {
            int left = lower - nums[i];
            int right = upper - nums[i];
            int l = first_occurence(nums, left, i + 1, size - 1);
            int r = last_occurence(nums, right, i + 1, size - 1);
            if(l <= r) {
                count += (long) ((long) (r) - (long) (l) + 1);
            }
        }
        return count;
    }
}