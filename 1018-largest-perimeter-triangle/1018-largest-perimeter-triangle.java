class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int perimeter = 0, maxPerimeter = 0;
        int i = 0, j = 1, k = 2;
        while(k < nums.length) {
            if(((nums[i] + nums[j]) > nums[k]) && ((nums[j] + nums[k]) > nums[i]) && ((nums[i] + nums[k]) > nums[j])) {
                perimeter = nums[i] + nums[j] + nums[k];
                maxPerimeter = Math.max(maxPerimeter, perimeter);
            }
            i++;
            j++;
            k++;
        }
        return maxPerimeter;
    }
}