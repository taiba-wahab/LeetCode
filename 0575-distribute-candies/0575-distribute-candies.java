class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int n = candyType.length;
        for(int i = 0; i < n; i++) {
            set.add(candyType[i]);
        }
        return Math.min(n / 2, set.size());
    }
}