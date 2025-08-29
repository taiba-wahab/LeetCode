class Solution {
    public long flowerGame(int n, int m) {
        long oddInN = (n + 1) / 2;
        long evenInN = n / 2;
        long oddInM = (m + 1) / 2;
        long evenInM = m / 2;

        return oddInN * evenInM + evenInN * oddInM;
    }
}
