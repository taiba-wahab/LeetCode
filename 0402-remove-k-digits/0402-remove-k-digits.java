class Solution {
    public String reverse(String str) {
        String reversed = "";
        for(int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
            System.out.println(reversed);
        }
        return reversed;
    }
    public String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < num.length(); i++) {
            while(!st.isEmpty() && k > 0 && (st.peek() - '0') > (num.charAt(i) - '0')) {
                st.pop();
                k--;
            } 
            st.push(num.charAt(i));
        }
        while(k > 0) {
            st.pop();
            k--;
        }
    if(st.isEmpty()) return "0";
    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty()) {
        sb.append(st.peek());
        st.pop();
    }
    String result = sb.reverse().toString();
    int index = 0;
    while(index < result.length() && result.charAt(index) == '0') index++;
    result = result.substring(index);
    return (result.length() == 0) ? "0" : result; 
    }
}