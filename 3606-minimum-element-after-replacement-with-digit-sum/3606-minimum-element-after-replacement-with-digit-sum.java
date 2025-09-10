class Solution {
    public int sumOfDigits(int temp) {
        int sum = 0;
        while(temp != 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sumOfDigits(nums[i]);
        }
        int ans = Arrays.stream(nums).min().getAsInt();
        return ans;
    }
}