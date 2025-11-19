class Solution {
    public void solve(int i, List<Integer> curr, int[] nums, List<List<Integer>> ans) {
        if(i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        solve(i + 1, curr, nums, ans);
        curr.add(nums[i]);
        solve(i + 1, curr, nums, ans);
        curr.remove(curr.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, curr, nums, ans);
        return ans;
    }
}