class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int [] answer = new int[nums1.length > nums2.length? nums2.length : nums1.length];
        int i = 0, j = 0, idx = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                answer[idx] = nums1[i];
                i++;
                j++;
                idx++;
            }
        }
        return Arrays.copyOfRange(answer, 0, idx); 
    }
}