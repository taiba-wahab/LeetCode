class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int[] freq = new int[max + 1];
        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for(int i = min; i < freq.length; i++) {
            if(freq[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}