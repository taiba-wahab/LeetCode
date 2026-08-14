class Solution {
    public int[] findNGE(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return nge;
    }
    public int[] findNSE(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return nse;
    }
    public int[] findPSEE(int[] arr) {
        int[] psee = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            psee[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return psee;
    }
    public int[] findPGEE(int[] arr) {
        int[] pgee = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            pgee[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pgee;
    }
    public long sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        long total = 0;
        for(int i = 0; i < arr.length; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;
            total += left * right * arr[i];
        }
        return total;
    }
    public long sumSubarrayMaxs(int[] arr) {
        int[] nge = findNGE(arr);
        int[] pgee = findPGEE(arr);
        long total = 0;
        for(int i = 0; i < arr.length; i++) {
            long left = i - pgee[i];
            long right = nge[i] - i;
            total += left * right * arr[i];
        }
        return total;
    }
    public long subArrayRanges(int[] nums) {
        long maxs = sumSubarrayMaxs(nums);
        long mins = sumSubarrayMins(nums);
        return maxs - mins;
    }
}