class Solution {
    boolean isPossible(int [] time, long totalTrips, long minTime) {
        long trips = 0; long t = minTime;
        for(int i = 0; i < time.length; i++) {
            if(t - time[i] >= 0) {
                trips += t / time[i];
            }
        }
        return trips >= totalTrips;
    }
    public long minimumTime(int[] time, long totalTrips) {
        Arrays.sort(time);
        long start = 1;
        long end = totalTrips * Arrays.stream(time).min().getAsInt();
        long answer = 0;
        while(start <= end) {
            long mid = (start + end) >> 1;
            boolean possible = isPossible(time, totalTrips, mid);
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