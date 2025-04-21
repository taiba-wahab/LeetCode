class Pair {
    int val;
    int curr_min;
    Pair(int val, int curr_min) {
        this.val = val;
        this.curr_min = curr_min;
    }
}
class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();

    }
    
    public void push(int val) {
        int min_value = val;
        if(!stack.empty()) {
            min_value = stack.peek().curr_min < min_value ? stack.peek().curr_min : min_value;
        }
        Pair new_pair = new Pair(val, min_value);
        stack.push(new_pair);
    }
    
    public void pop() {
        if(!stack.empty()) {
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.empty()) {
            return stack.peek().val;
        }
        else {
            return -1;
        }
    }
    
    public int getMin() {
        if(!stack.empty()) {
            return stack.peek().curr_min;
        }
        else {
            return -1;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */