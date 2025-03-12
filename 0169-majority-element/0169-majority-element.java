class Solution {
    public int majorityElement(int[] nums) {
        int answer = -1, maximumfreq = 0;
        HashMap<Integer, Integer> freqarr = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(freqarr.containsKey(nums[i]) == false)
            {
                freqarr.put(nums[i], 1);
            }
            else{
                freqarr.replace(nums[i],freqarr.get(nums[i])+1);
            }
        }
        for(Integer key : freqarr.keySet()){
            if(freqarr.get(key) > maximumfreq) {
                answer = key;
                maximumfreq = freqarr.get(key);
            }
        }
        return answer;
    }
}