class Solution {
    public boolean isPossible(int [] weights, int days, int capacity) {
        int d = 1;
        int C = capacity;
        for(int i = 0; i < weights.length; i++) {
            if(C - weights[i] < 0) {
                d++;
                C = capacity;
            }
            C -= weights[i];
        }
        return d <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();
        int answer = 0;
        while(start <= end) {
            int mid = start + end >> 1;
            boolean possible = isPossible(weights, days, mid);
            if(possible) {
                answer = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return answer;
    }
}