class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] answer = {-1, -1};
        int i = 0, j = numbers.length - 1, sum = 0;
        while(i <= j) {
            sum = numbers[i] + numbers[j];
            if(sum == target) {
                answer[0] = i + 1;
                answer[1] = j + 1;
                return answer;
            }
            else if(sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return answer;
    }
}