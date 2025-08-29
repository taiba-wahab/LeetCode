class Solution {
    public long countOdds(int n) {
        long odds = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) odds++; 
        }
        return odds;
    }
    public long countEvens(int m) {
        long evens = 0;
        for(int i = 1; i <= m; i++) {
            if(i % 2 == 0) evens++; 
        }
        return evens;
    }
    public long flowerGame(int n, int m) {
        long oddInN = countOdds(n);
        long oddInM = countOdds(m);
        long evenInN = countEvens(n);
        long evenInM = countEvens(m);
        long answer = (oddInN * evenInM) + (oddInM * evenInN);
        return answer;
    }
}