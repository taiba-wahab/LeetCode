class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[][] positions = new int[score.length][2];
        for(int i = 0; i < score.length; i++) {
            positions[i][0] = score[i];
            positions[i][1] = i;
        }
        Arrays.sort(positions, (a, b) -> Integer.compare(b[0],a[0]));
        String[] answer = new String[score.length];
        for(int i = 0; i < score.length; i++) {
            int idx = positions[i][1];
            if(i == 0) {
                answer[idx] = "Gold Medal";
            }
            else if(i == 1) {
                answer[idx] = "Silver Medal";
            }
            else if(i == 2) {
                answer[idx] = "Bronze Medal";
            }
            else {
                answer[idx] = Integer.toString(i + 1);
            }
        }
        return answer;
    }
}