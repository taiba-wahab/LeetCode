class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int[] seats : reservedSeats) {
            int row = seats[0];
            int col = seats[1];
            map.computeIfAbsent(row, k -> new HashSet<>()).add(col);
        }
        int family = 0;
        for(int row : map.keySet()) {
            HashSet<Integer> seats = map.get(row);
            boolean[] group = new boolean[3];
            for(int seat : seats) {
                if(seat >= 2 && seat <= 5) {
                    group[0] = true;
                }
                if(seat >= 4 && seat <= 7) {
                    group[1] = true;
                }
                if(seat >= 6 && seat <= 9) {
                    group[2] = true;
                }
            }
            
            if(!group[0] && !group[2]) family += 2;
            else if(!group[0] || !group[1] || !group[2]) family += 1;
        }
        family += (n - map.size()) * 2;
        return family;
    }
}