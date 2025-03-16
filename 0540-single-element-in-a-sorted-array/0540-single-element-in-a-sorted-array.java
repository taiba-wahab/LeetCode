class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        int answer = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        int [] freq = new int [max + 1];
        for(int i = 0; i < size; i++) {
            freq[nums[i]] += 1;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == 1){
            answer = i;
            break;
            }
        }
        return answer;
    }
}