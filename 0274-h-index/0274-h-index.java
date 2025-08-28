class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i = 0; i < n / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[n - i -1];
            citations[n - i -1] = temp;
        }
        int h = 0;
        for(int i = 0; i < n; i++) {
            int papers = i + 1;
            if(citations[i] >= papers) {
                h = papers;
            }
            else {
                break;
            }
        }
        return h;
    }
}