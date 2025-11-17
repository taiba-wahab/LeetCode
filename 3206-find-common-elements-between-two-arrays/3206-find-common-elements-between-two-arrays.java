class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] answer = new int[2];
        int ans1 = 0;
        int ans2 = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++) set2.add(nums2[i]);
        for(int i = 0; i < nums1.length; i++) {
            int key = nums1[i];
            if(set2.contains(key)) ans1++;
        }
        for(int i = 0; i < nums2.length; i++) {
            int key = nums2[i];
            if(set1.contains(key)) ans2++;
        }
        answer[0] = ans1;
        answer[1] = ans2;
        return answer;
    }
}