class Solution {
    public int reverseNumber(int x) {
        int temp = x;
        int rev = 0;
        while(temp != 0) {
            int rem = temp % 10;
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
            if ((rev == Integer.MAX_VALUE/10 ||  rev < Integer.MIN_VALUE/10) && rem > 7) return 0;
            rev = 10 * rev + rem;
            temp /= 10;
        }
        return rev;
    }
    public int reverse(int x) {
        int reverseX = reverseNumber(x);
        return reverseX;
    }
}