class Solution {
    public int findX(int n) {
        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) != '0') {
                sb.append(num.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
    public int sum(int n) {
        int s = 0;
        while(n != 0) {
            int rem = n % 10;
            s += rem;
            n /= 10;
        }
        return s;
    }
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
        int x = findX(n);
        int s = sum(x);
        return (long) x * s;
    }
}