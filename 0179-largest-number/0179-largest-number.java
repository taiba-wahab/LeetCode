class Solution {
    public String largestNumber(int[] nums) {
        String[] numsStrings = new String[nums.length];
        for(int i  =0; i < nums.length; i++) {
            numsStrings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsStrings, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numsStrings.length; i++) {
            sb.append(numsStrings[i]);
        }
        if(sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}