class Solution {
    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
    public static void cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != (i + 1)) {
                list.add(i + 1);
            }
        }
        return list;
    }
}