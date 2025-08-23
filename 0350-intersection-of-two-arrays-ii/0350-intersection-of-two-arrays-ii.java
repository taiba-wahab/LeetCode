class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // int size = nums1.length > nums2.length? nums2.length : nums1.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i],0) + 1);
        }
        for(int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i],0) + 1);
        }
        for(Integer key : map1.keySet()) {
            if(map2.containsKey(key)) {
                int times = map1.get(key) > map2.get(key) ? map2.get(key) : map1.get(key);
                for(int i = 1; i <= times; i++) {
                    ans.add(key);
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i); 
        }
        return result;
    }
}