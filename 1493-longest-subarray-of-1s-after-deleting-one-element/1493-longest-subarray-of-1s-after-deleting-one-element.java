class Solution {
    public int longestSubarray(int[] nums) {
        int answer = 0;
        int prevCnt = 0, cnt = 0, tmp = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                flag = true;
                tmp = prevCnt + cnt;
                answer = Math.max(tmp, answer);
                prevCnt = cnt;
                cnt = 0;
            } else {
                cnt++;
            }
        }
        tmp = prevCnt + cnt;
        answer = Math.max(tmp, answer);

        return flag ? answer : answer - 1;
    }
}
