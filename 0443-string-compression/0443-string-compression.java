class Solution {
    public int compress(char[] chars) {
        char before = chars[0];
        int answer = 0;
        int cnt = 1;
        int idx = 1;
        while (idx < chars.length) {
            if (chars[idx] == before) {
                cnt++;
            } else {
                before = chars[idx];
                chars[answer++] = chars[idx - 1];
                if (cnt > 1) {
                    for (char digit : String.valueOf(cnt).toCharArray()) {
                        chars[answer++] = digit;
                    }
                }
                cnt = 1;
            }
            idx++;
        }

        chars[answer++] = chars[idx - 1];
                if (cnt > 1) {
                    for (char digit : String.valueOf(cnt).toCharArray()) {
                        chars[answer++] = digit;
                    }
                }
                
        return answer;
    }
}