class Solution {
    public String frequencySort(String s) {
        int n  = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+ 1);
        }
        ArrayList<Character>[] buckets = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(char c : map.keySet()) {
            int freq = map.get(c);
            buckets[freq].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = n; i >= 0; i--) {
            for(char c : buckets[i]) {
                for(int k = 0; k < i; k++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}