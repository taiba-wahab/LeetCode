class Solution {
    public boolean isDistinct(int[] nums, int startIndex) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return false;
            }
            set.add(nums[i]);
        }
        return true; 
    }
    public int minimumOperations(int[] nums) {
        int index = 0, answer = 0;
        while (index < nums.length) {
            boolean check = isDistinct(nums, index);
            if(check) {
                return answer;
            }
            else {
                answer++;
            }
                index += 3;
        }
        return answer;
    }
}


