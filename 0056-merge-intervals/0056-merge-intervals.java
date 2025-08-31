class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int curr_start = intervals[0][0];
        int curr_end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            int second_start = intervals[i][0];
            int second_end = intervals[i][1];
            if(curr_end >= second_start) {
                curr_end = Math.max(curr_end, second_end);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(curr_start);
                list.add(curr_end);
                result.add(list);
                curr_start = intervals[i][0];
                curr_end = intervals[i][1];
            }
        }
        ArrayList<Integer> last = new ArrayList<>();
        last.add(curr_start);
        last.add(curr_end);
        result.add(last);
        int[][] answer = new int[result.size()][];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = new int[result.get(i).size()];
            for(int j = 0; j < result.get(i).size(); j++) {
                answer[i][j] = result.get(i).get(j);
            }
        }
        return answer;
    }
}