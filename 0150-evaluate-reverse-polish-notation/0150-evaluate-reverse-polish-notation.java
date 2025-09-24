class Solution {
    public int operation(int a, int b, String ch) {
        if(ch.equals("-")) return a - b;
        if(ch.equals("*")) return a * b;
        if(ch.equals("/")) return a / b;
        return a + b;
    }
    public int evalRPN(String[] tokens) {
        HashSet<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            if(!(operators.contains(ch))) {
                stack.push(Integer.valueOf(ch));
            }
            else {
                int a = stack.pop();
                int b = stack.pop();
                int val = operation(b, a, ch);
                stack.push(val);
            }
        }
        return stack.pop();
    }
}