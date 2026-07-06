class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        int i = 0; int j = i + 1;
        while(i < intervals.length - 1 && j < intervals.length) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            int c = intervals[j][0];
            int d = intervals[j][1];
            if(a <= c && b >= d) {
                count++;
                j++;
            }
            else {
                i = j;
                j++;
            }
        }
        return intervals.length - count;
    }
}