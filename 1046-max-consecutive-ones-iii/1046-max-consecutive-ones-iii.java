class Solution {
    public int longestOnes(int[] nums, int k) {
        int answer = 0;
        int l = 0, r = 0;
        int cnt = 0;
        int cntZero = 0;
        while (l <= r && r < nums.length) {
            if (nums[r] == 1) {
                cnt++;
                r++;
            } else if (cntZero < k) {
                cnt++;
                cntZero++;
                r++;
            } else {
                if (nums[l] == 1) {
                    cnt--;
                    l++;
                } else {
                    cntZero--;
                    cnt--;
                    l++;
                }
            }

            answer = Math.max(answer, cnt);
        }

        return answer;
    }
}