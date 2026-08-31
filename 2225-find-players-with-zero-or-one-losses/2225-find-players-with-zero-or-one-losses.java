class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            map.putIfAbsent(winner, 0);
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }
        List<Integer> lostOnce = new ArrayList<>();
        List<Integer> lostZero = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == 0) lostZero.add(key);
            if(map.get(key) == 1) lostOnce.add(key);
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(lostOnce);
        Collections.sort(lostZero);
        ans.add(lostZero);
        ans.add(lostOnce);
        return ans;
    }
}