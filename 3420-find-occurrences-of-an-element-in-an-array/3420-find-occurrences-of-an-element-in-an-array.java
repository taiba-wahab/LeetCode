class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == x) {
                count++;
                map.put(count, i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < queries.length; i++) {
            if(map.containsKey(queries[i])) {
                list.add(map.get(queries[i]));
            }
            else {
                list.add(-1);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}