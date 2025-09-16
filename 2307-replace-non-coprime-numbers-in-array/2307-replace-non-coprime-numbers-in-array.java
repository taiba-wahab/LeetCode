class Solution {
    public int getGcd(int a, int b) {
        if(b == 0) 
        return a;
        return getGcd(b, a % b);
    }
    public int getLcm(int a, int b) {
        long x = (long) a;
        long y = (long) b;
        long lcm = (long)(x * y) / (long) getGcd(a, b);
        return (int) lcm;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< nums.length; i++) {
            list.add(nums[i]);
        }
        int i = 0;
        while(i < list.size() - 1) {
            int gcd = getGcd(list.get(i), list.get(i + 1));
            if(gcd > 1) {
                int lcm = getLcm(list.get(i), list.get(i + 1));
                list.set(i, lcm);
                list.remove(i + 1);
                if(i > 0) i--;
            }
            else {
                i++;
            }
        }
        return list;
    }
}