class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        boolean missing = false;
        int j = 1;
        while(!missing) {
            if(set.contains(j * k)) {
                j++;
            }
            else {
                missing = true;
            }
        }
        return j * k;
    }
}