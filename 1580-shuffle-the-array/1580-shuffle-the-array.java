class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result = new int[2 * n];
        int i = 0;
        int j = n;
        int k = 0;
        while(i < j && j < 2 * n) {
            result[k] = nums[i];
            i++;
            k++;
            result[k] = nums[j];
            k++;
            j++;
        }
        return result;
    }
}