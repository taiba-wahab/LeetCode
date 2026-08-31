class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashMap<Integer, Integer> mapOfMap = new HashMap<>();
        for(int key : map.keySet()) {
            mapOfMap.put(map.get(key), mapOfMap.getOrDefault(map.get(key), 0) + 1);
        }
        for(int num : mapOfMap.keySet()) {
            if(mapOfMap.get(num) > 1) return false;
        }
        return true;
    }
}