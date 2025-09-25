class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        for(int i = num1.length() - 1; i >= 0; i--) {
            char ch = num1.charAt(i);
            n1.append(ch);
        }
        for(int i = num2.length() - 1; i >= 0; i--) {
            char ch = num2.charAt(i);
            n2.append(ch);
        }
        int[] result = new int [num1.length() + num2.length()];
        for(int i = 0; i < n1.length(); i++) {
            for(int j = 0; j < n2.length(); j++) {
                int mul = (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
                result[i + j] += mul;
                result[i + j + 1] += result[i + j] / 10;
                result[i + j] %= 10;
            }
        }
        StringBuilder ans = new StringBuilder();
        int k = result.length - 1;
        while(k >= 0 && result[k] == 0) k--;
        while(k >= 0) {
            ans.append(result[k]);
            k--;
        }
        return ans.toString();
    }
}