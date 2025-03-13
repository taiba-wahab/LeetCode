class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        Arrays.sort(nums);
    //     if(size < 4)
    //     return result;
    //     if(size == 4){
    //     long sum = nums[0] + nums[1] + nums[2] + nums[3];
    //     if(sum == target)
    //     {
    //         List<Integer> temp = new ArrayList<>();
    //                     temp.add(nums[0]);
    //                     temp.add(nums[1]);
    //                     temp.add(nums[2]);
    //                     temp.add(nums[3]);
    //                     result.add(temp);
    //     }
    //     return result;
    // }
        for(int i = 0; i < size - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < size - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int a = j + 1;
                int b = size - 1;
                while(a < b) {
                    long sum =((long)nums[i] + (long)nums[j] + (long)nums[a] + (long)nums[b]);
                    
                    if(sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        result.add(temp);
                        a++;
                        b--;
                        while(a < b && nums[a] == nums[a - 1]) a++;
                        while(a < b && nums[b] == nums[b + 1]) b--;
                    }
                    else if(sum < target) {
                        a++;
                    }
                    else {
                        b--;
                    }
                }
            }
        }
        return result;
    }
}