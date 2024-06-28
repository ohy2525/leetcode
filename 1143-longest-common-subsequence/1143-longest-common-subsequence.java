class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         char[] s1 = text1.toCharArray();
         char[] s2 = text2.toCharArray();

         int[][] dp = new int[text1.length() + 1][text2.length() + 1];
         for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                int cnt = 0;
                if (s1[i - 1] == s2[j - 1]) {
                    cnt = dp[i - 1][j - 1] + 1;
                } else {
                    cnt = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                dp[i][j] = cnt;
            }
         }

         return dp[text1.length()][text2.length()];

    }
}