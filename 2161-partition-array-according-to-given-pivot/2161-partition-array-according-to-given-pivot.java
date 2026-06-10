class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         ArrayList<Integer> small = new ArrayList<Integer>();
         ArrayList<Integer> equal = new ArrayList<Integer>();
          ArrayList<Integer> large = new ArrayList<Integer>();
          int size=nums.length;
          for(int i = 0;i < size; i++)
          {
            if(nums[i]>pivot)
            large.add(nums[i]);
            else if(nums[i]<pivot)
            small.add(nums[i]);
            else
            equal.add(nums[i]);
          }
          small.addAll(equal);
          small.addAll(large);
          int len=small.size();
          for(int i=0;i<len;i++)
          {
            nums[i]=small.get(i);
          }
          return nums;
    }
}