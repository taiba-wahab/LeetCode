class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb = new StringBuilder();
        String a = String.format("%04d", num1);
        String b = String.format("%04d", num2);
        String c = String.format("%04d", num3);
        for(int i = 0; i < 4; i++) {
            int min = Math.min(a.charAt(i) - '0', Math.min(b.charAt(i) - '0', c.charAt(i) - '0'));
            sb.append(String.valueOf(min));
        }
        return Integer.parseInt(sb.toString());
    }
}