class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && answer > 0) break;
            if (s.charAt(i) != ' ') answer++;
        }

        return answer;
    }
}