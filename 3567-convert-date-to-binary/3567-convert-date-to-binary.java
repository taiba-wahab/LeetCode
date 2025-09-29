class Solution {
    public String deciToBinary(String n) {
        int num = Integer.parseInt(n);
        if(num == 0) return "0";
        StringBuilder ans = new StringBuilder();
        while(num > 0) {
            ans.append(num % 2);
            num /= 2;
        }
        return ans.reverse().toString();
    }
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < parts.length; i++) {
            sb.append(deciToBinary(parts[i]));
            if(i < parts.length - 1) sb.append("-");
        }
        return sb.toString();
    }
}