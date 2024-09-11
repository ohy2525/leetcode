class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return ture;

        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            char f = s.charAt(l);
            char b = s.charAt(r);
            if (!Character.isLetterOrDigit(f)) {
        		l++;
        	} else if(!Character.isLetterOrDigit(b)) {
        		r--;
        	} else {
        		if (Character.toLowerCase(f) != Character.toLowerCase(b)) {
        			return false;
        		}
        		l++;
        		r--;
        	}
        }
        return true;
    }
}