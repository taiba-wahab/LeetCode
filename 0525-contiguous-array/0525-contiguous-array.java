class Solution {
    public int findMaxLength(int[] nums) {
        int len = nums.length;
        int maxLen = 0, sum = 0, length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < len; i++) {
            if(nums[i] == 0) {
                sum += -1;
            }
            else {
                sum += 1;
            }
            if(map.containsKey(sum) == true) {
                length = i - map.get(sum);
            }
            else {
                map.put(sum, i);
            }
            if(length > maxLen) {
                maxLen = length;
            }
        }
        return maxLen;
    }
}