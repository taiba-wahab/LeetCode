class Solution {
    public int product(int[] nums) { 
        int pro = 1; 
        for(int i = 0; i < nums.length; i++) { 
            if(nums[i] == 0) continue; 
            pro *= nums[i]; 
        } 
        return pro; 
    }
    public int countZeros(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) counter++;
        }
        return counter;
    }
    public int[] productExceptSelf(int[] nums) {
        int count = countZeros(nums);
        int maxPro = product(nums);
        int[] answer = new int[nums.length];
        for(int i = 0; i < answer.length; i++) {
            if(count > 1) {
                answer[i] = 0;
            }
            else if(count == 1) {
                if(nums[i] == 0) {
                    answer[i] = maxPro;
                }
                else {
                    answer[i] = 0;
                }
            }
            else {
                answer[i] = maxPro / nums[i];
            }
        }
        return answer;
    }
}