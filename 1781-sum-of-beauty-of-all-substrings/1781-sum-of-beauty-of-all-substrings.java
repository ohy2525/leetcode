class Solution {
    public int beautySum(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] cnt = new int[26];

            for (int j = i; j < s.length(); j++) {
                cnt[s.charAt(j) - 'a']++;
                result += calc(cnt);
            }
        }

        return result;
    }

    private int calc(int[] cnt) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                max = Math.max(max, cnt[i]);
                min = Math.min(min, cnt[i]);
            }
        }

        return max - min;
    }
}