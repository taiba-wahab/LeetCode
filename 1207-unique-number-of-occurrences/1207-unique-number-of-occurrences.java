class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for(int key : freqMap.keySet()) {
            if(freqMap.get(key) > max) {
                max = freqMap.get(key);
            }
        }
        int [] freq = new int[max + 1];
        for(int key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            freq[frequency]++;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 1) return false;
        }
        return true;
    }
}