class Solution {
    boolean isPossible(int [] piles, int h, int rate) {
        long hours = 0;
        for(int k = 0; k < piles.length; k++) {
            if(piles[k] % rate != 0) {
                hours += 1;
            }
            hours += piles[k] / rate;
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int answer = 0;
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