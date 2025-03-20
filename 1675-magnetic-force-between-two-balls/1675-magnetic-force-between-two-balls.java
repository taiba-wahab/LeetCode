class Solution {
        public static boolean isPossible(int [] stalls, int k, int d) {
        int size = stalls.length;
        int totalCows = 1;
        int nextDistance = stalls[0] + d;
        for(int i = 1; i < size; i++) {
            if(stalls[i] >= nextDistance) {
                totalCows++;
                nextDistance = stalls[i] + d;
            }
        }
        return totalCows >= k;
    }
    public int maxDistance(int[] stalls, int k) {
        Arrays.sort(stalls);
        int answer = 0;
        int size = stalls.length;
        int low = 1;
        int high = stalls[size - 1] - stalls[0];
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(isPossible(stalls, k, mid)) {
                answer = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return answer;
    }
}