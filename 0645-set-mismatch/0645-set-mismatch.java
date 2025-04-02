class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] answer = new int [2];
        int n = nums.length;
        answer[0] = 0;
        answer[1] = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) == true) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == 2) {
            answer[0] = key;
            break;
            }
        }
        for(int i = 1; i <= n; i++) {
            if(map.containsKey(i) == false) {
            answer[1] = i;
            break;
            }
        }
        return answer;
    }
}