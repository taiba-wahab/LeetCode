class Solution {
    public int candy(int[] ratings) {
        int size = ratings.length;
        int candiesCount = 0;
        int [] prefix = new int [size];
        int [] suffix = new int [size];
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);
        for(int i = 1; i < size; i++) {
            if(ratings[i] > ratings[i - 1]) {
                prefix[i] = prefix[i - 1] + 1;
            }
        }

        for(int i = size - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                suffix[i] = suffix[i + 1] + 1;
            }
        }

        for(int i = 0; i < size; i++) {
            candiesCount += Math.max(prefix[i], suffix[i]);
        }
        return candiesCount;
    }
}