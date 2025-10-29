class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int ans = (28 * weeks) + (7 * ((weeks * (weeks - 1) / 2))) + ((weeks + 1) * days) + (((days - 1) * (days)) / 2);
        return ans;
    }
}