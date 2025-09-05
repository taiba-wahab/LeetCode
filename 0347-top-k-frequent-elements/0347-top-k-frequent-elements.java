class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(Integer key : map.keySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            list.add(temp);
        }
        Collections.sort(list, (x, y) -> y.get(1) - x.get(1));
        int idx = 0;
        while(k != 0) {
            answer[idx] = list.get(idx).get(0);
            k--;
            idx++;
        }
        return answer;
    }
}