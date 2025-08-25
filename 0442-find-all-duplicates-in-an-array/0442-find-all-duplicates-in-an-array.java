class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];;
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void cyclicSort(int[] nums) {
        int i = 0; 
        while( i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, correct, i);
            }
            else {
                i++;
            }
        }
    }
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != (i + 1)) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}