class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];
        for(int num : nums2) {
            while(!stack.empty() && num > stack.peek()) {
                int top = stack.pop();
                map.put(top, num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int i = 0;
        for(int nums : nums1) {
            ans[i] = map.get(nums);
            i++;
        }
        return ans;
    }
}