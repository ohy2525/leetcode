import java.util.*;
import java.io.*;

class Solution {
    public String removeKdigits(String num, int k) {
        ArrayDeque<Character> ans = new ArrayDeque<Character>();

        for (char c : num.toCharArray()) {
            while (k > 0 && ans.size() > 0 && Integer.parseInt(String.valueOf(ans.peekLast())) > Integer.parseInt(String.valueOf(c))) {
                ans.removeLast();
                k--;
            }
            ans.addLast(c);
        }

        while (k > 0) {
            ans.removeLast();
            k--;
        }

        if (ans.size() == 0) {
            return "0";
        }
        
        while (ans.peekFirst() != '0') {
            ans.removeFirst();
        }
        return Arrays.toString(ans.toArray());
    }
}