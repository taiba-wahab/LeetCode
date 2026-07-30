class Solution {
    public int minimumPushes(String word) {
        int rounds = word.length() / 8;
        return (rounds * (rounds + 1) / 2) * 8 + (word.length() % 8) * (rounds + 1);
    }
}