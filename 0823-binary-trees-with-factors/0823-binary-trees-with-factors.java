class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = 1_000_000_007;
        long ans = 0;
        int size = arr.length;
        Arrays.sort(arr);
        HashMap<Integer, Long> map = new HashMap<>();
        for(int i = 0; i < size; i++) {
            map.put(arr[i], 1L);
        }
        for(int i = 1; i < size; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];
                    if(map.containsKey(right)) {
                        long m = map.get(arr[j]) % mod;
                        long n = map.get(right) % mod;
                        long newValue = ((m * n) % mod + map.get(arr[i])) % mod;
                        map.put(arr[i], newValue);
                    }
                }
            }
        }
        for(int key : map.keySet()) {
            ans = (ans + map.get(key)) % mod;
        }
        return (int) ans;
    }
}