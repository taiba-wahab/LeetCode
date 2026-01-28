class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++) {
            if(Math.abs(arr[i] - arr[i - 1]) < minDiff) {
                minDiff = Math.abs(arr[i] - arr[i - 1]);
            }
        }
        for(int i = 0; i < arr.length - 1; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            if(arr[i + 1] - arr[i] == minDiff) {
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
            }
            if(temp.size() != 0) {
                ans.add(temp);
            }
        }
        return ans;
    }
}