class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] setArray = new int[set.size()];
        int idx = 0;
        for(int val : set) {
            setArray[idx] = val;
            idx++;
        }
        int max = Arrays.stream(setArray).max().getAsInt();
        if(setArray.length < 3) return max;
        Arrays.sort(setArray);
        max = setArray[setArray.length - 3];
        return max;
    }
}