class MinStack {
    Stack<Long> stack;
    long min = Long.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        long x = val;

        if(stack.isEmpty()) {
            min = x;
            stack.push(x);
        }
        else {
            if(x > min) {
                stack.push(x);
            }
            else {
                stack.push(2 * x - min);
                min = x;
            }
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;

        long x = stack.peek();
        stack.pop();

        if(x < min) {
            min = 2 * min - x;
        }
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;

        long x = stack.peek();

        if(min < x) return (int)x;
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}