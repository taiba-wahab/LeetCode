class Solution {
    public int maximumPopulation(int[][] logs) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];
            for(int j = birth; j < death; j++) {
                if(map.containsKey(j)) {
                    map.put(j, map.get(j) + 1);
                }
                else {
                    map.put(j,1);
                }
            }
        }
        int maxpopulation = 0, maxyear = 0;
        for(Integer year : map.keySet()) {
            int currentpopulation  = map.get(year);
            if(currentpopulation > maxpopulation ||(currentpopulation == maxpopulation && year < maxyear)) {
                maxpopulation = currentpopulation;
                maxyear = year;
            }
        }
        return maxyear;
    }
}