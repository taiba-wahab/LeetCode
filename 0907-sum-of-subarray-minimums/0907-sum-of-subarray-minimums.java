class Solution {
    public int[] findNSE(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            nse[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return nse;
    }
    public int[] findPSEE(int[] arr) {
        int[] psee = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) stack.pop();
            psee[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        int total = 0;
        int MOD = 1_000_000_007;
        for(int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            total = (int) (total + (left * right * 1L * arr[i]) % MOD) % MOD;
        }
        return total;
    }
}