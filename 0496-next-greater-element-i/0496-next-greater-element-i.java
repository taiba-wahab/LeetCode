class Solution {
    public int getMax(int[] nums, int j, int a, int b) {
        for(int i = a; i < b; i++) {
            if(nums[i] > nums[j]) {
                return nums[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < nums2.length - 1; j++) {
                if(nums1[i] == nums2[j]) {
                    ans[i] = getMax(nums2, j, j + 1, nums2.length);
                }
            }
        }
        return ans;
    }
}