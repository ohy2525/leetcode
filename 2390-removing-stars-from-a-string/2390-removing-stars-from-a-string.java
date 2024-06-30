class Solution {
    public String removeStars(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = 0;

        while(j < s.length()) {
            if (c[j] == '*') {
                i--;
            } else {
                c[i++] = c[j];
            }
            j++;
        }
        
        return new String(c, 0 , i);
    }
}