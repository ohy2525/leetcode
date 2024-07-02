class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCnt = 0;
        for (int num : nums) {
            if (num != 0) {
                product = product * num;
            } else {
                zeroCnt++;
            }
        }

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (zeroCnt == 0) {
                answer[i] = product / nums[i];
            } else if (zeroCnt == 1 && nums[i] == 0) {
                answer[i] = product;
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }
}