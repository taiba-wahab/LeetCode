class Solution {
    public int [] countingSort(int[] heights) {
        int max = Arrays.stream(heights).max().getAsInt();
        int[] freq = new int[max + 1];
        for(int i = 0; i < heights.length; i++) {
            freq[heights[i]]++;
        }
        int[] expected = new int[heights.length];
        int idx = 0;
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                expected[idx] = i;
                idx++;
                freq[i]--;
            }
        }
        return expected;
    }
    public int heightChecker(int[] heights) {
        int[] expected = countingSort(heights);
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}