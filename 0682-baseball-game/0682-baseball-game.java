class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++) {
            String opr = operations[i];
            if(opr.equals("C")) {
                stack.pop();
            }
            else if(opr.equals("D")) {
                int score = stack.peek() * 2;
                stack.push(score);
            }
            else if(opr.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                int item = first + second;
                stack.push(item);
            }
            else {
                stack.push(Integer.parseInt(opr));
            }
        }
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}