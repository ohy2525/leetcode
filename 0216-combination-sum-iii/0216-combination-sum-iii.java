class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum3(int k, int n) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        
        backtracking(nums, k, n, 0, arr);

        return result;   
    }

    private void backtracking(int[] nums, int k, int n, int idx, List<Integer> arr) {
        if (k == 0) {
            if (n == 0) result.add(new ArrayList<>(arr));
            return;
        }
        for (int i = idx; i < 9; i++) {
            if (n - nums[i] < 0) break;
            arr.add(nums[i]);
            backtracking(nums, k - 1, n - nums[i], i + 1, arr);
            arr.remove(arr.size() - 1);
        }
    }
}