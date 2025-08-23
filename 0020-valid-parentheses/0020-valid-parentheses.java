class Solution {
    public boolean isValid(String s) {
        int size = s.length();
        if(size % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < size; i++) {
            int ch = (int)(s.charAt(i));
            if(ch == 40 || ch == 91 || ch == 123) {
                stack.push((char)ch);
            }
            else if(ch == 41 || ch == 93 || ch == 125) {
                if(stack.empty()) return false;
                int topMost = (int)stack.peek();
                if(topMost == (ch - 2) || topMost == (ch - 1)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
