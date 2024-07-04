class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums);
        while (l < r) {
            if ((nums[l] + nums[r]) > k) {
                r--;
            } else if ((nums[l] + nums[r]) < k) {
                l++;
            } else {
                answer++;
                r--;
                l++;
            }
        }

        return answer;
    }
}