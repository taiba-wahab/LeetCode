class Solution {
    boolean isPossible(int [] piles, int h, int rate) {
        long hours = 0;
        for(int i = 0; i < piles.length; i++) {
            if(piles[i] % rate != 0) {
                hours += 1;
            }
            hours += piles[i] / rate;
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int answer = 0;
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        while(start <= end) {
            int mid = start + (end - start) / 2;
            boolean possible = isPossible(piles, h, mid);
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