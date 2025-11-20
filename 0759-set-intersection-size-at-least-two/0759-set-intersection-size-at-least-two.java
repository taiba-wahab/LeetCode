class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int total = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int p1 = -1;
        int p2 = -1;
        for(int[] i : intervals) {
            int start = i[0];
            int end = i[1];
            boolean c1 = p1 >= start && p1 <= end;
            boolean c2 = p2 >= start && p2 <= end;
            if(c1 && c2) continue;
            else if(c2) {
                if(p2 == end) {
                    p1 = end - 1;
                    total++;
                }
                else {
                    total++;
                    p1 = p2;
                    p2 = end;
                }
            } 
            else {
                total += 2;
                p1 = end - 1;
                p2 = end;
            }
        }
        return total;
    }
}