class Solution {
    public int compareVersion(String version1, String version2) {
        String[] part1 = version1.split("\\.");
        String[] part2 = version2.split("\\.");
        int i = 0; int j = 0;
        while(i < part1.length && j < part2.length) {
            if(Integer.valueOf(part1[i]) < Integer.valueOf(part2[j])) {
                return -1;
            }
            else if(Integer.valueOf(part1[i]) > Integer.valueOf(part2[j])) {
                return 1;
            }
            i++;
            j++;
        }
        while(i < part1.length) {
            if(Integer.valueOf(part1[i]) != 0) return 1;
            i++;
        }
        while(j < part2.length) {
            if(Integer.valueOf(part2[j]) != 0) return -1;
            j++;
        }
        return 0;
    }
}