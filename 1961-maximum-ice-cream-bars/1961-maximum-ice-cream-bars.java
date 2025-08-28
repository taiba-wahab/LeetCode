class Solution {
        public static void countingSort(int [] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        int [] freq = new int[max + 1];
        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int index = 0;
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                nums[index] = i;
                freq[i]--;
                index++;
            }
        }
    }
    public int maxIceCream(int[] costs, int coins) {
        countingSort(costs);
        int count = 0;
        int sum = 0;
        for(int i = 0; i < costs.length; i++) {
            sum += costs[i];
            if(sum <= coins) {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}