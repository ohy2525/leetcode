class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int answer = 0;
        int idx = k;
        int cnt = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if (vowels.contains(chars[i])) {
                answer++;
                cnt++;
            }
        }

        while (idx < s.length()) {
            if (vowels.contains(chars[idx])) cnt++;
            if (vowels.contains(chars[idx - k])) cnt--;
            answer = Math.max(answer, cnt);
            idx++;
        }

        return answer;
    }
}