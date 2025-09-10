class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < languages.length; i++) {
            int user = i + 1;
            map.putIfAbsent(user, new HashSet<>());
            for(int lang : languages[i]) {
                map.get(user).add(lang);
            }
        }
        HashSet<Integer> problemUsers = new HashSet<>();
        for(int[] f : friendships) {
            int u = f[0];
            int v = f[1];
            Set<Integer> langU = map.get(u);
            Set<Integer> langV = map.get(v);
            boolean communicate = false;
            for(int lang : langU) {
                if(langV.contains(lang)) {
                    communicate = true;
                    break;
                }
            }
            if(!communicate) {
                problemUsers.add(u);
                problemUsers.add(v);
            }
        }
        HashMap<Integer, Integer> freqLang = new HashMap<>();
        for(int user : problemUsers) {
            for(int lang : map.get(user)) {
                freqLang.put(lang, freqLang.getOrDefault(lang, 0) +  1);
            }
        }
        int maxCount = 0;
        for(int freq : freqLang.values()) {
            maxCount = Math.max(maxCount, freq);
        }
        return problemUsers.size() - maxCount;
    }
}