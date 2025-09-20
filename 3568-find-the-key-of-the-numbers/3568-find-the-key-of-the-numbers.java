class Solution {
    public int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }
    public String padZeroes(int num) {
        String n = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int digits = countDigits(num);
        int countOfZeroes = 0;
        while(countOfZeroes != (4 - digits)) {
            sb.append("0");
            countOfZeroes++;
        }
        sb.append(String.valueOf(num));
        return sb.toString();
    }
    public int findMinimum(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb = new StringBuilder();
        String a = padZeroes(num1);
        String b = padZeroes(num2);
        String c = padZeroes(num3);
        for(int i = 0; i < 4; i++) {
            int[] array = new int[3];
            array[0] = a.charAt(i) - '0';
            array[1] = b.charAt(i) - '0';
            array[2] = c.charAt(i) - '0';
            int min = findMinimum(array);
            sb.append(String.valueOf(min));
        }
        return Integer.valueOf(sb.toString());
    }
}