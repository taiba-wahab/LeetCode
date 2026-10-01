class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty() || s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();
        }
        return sb.reverse().toString();
    }
}