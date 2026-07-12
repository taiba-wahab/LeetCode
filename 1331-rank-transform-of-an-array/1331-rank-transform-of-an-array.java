class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] answer = new int[arr.length];
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < temp.length; i++) {
            if(!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }
        for(int i = 0; i < answer.length; i++) {
            answer[i] = map.get(arr[i]);
        }
        return answer;
    }
}