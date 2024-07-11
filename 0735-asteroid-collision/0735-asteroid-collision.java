class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 || s.isEmpty()) {
                s.push(arr[i]);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(arr[i])) {
                    s.pop();
                }
                if (!s.isEmpty() && s.peek() == Math.abs(arr[i])) {
                    s.pop();
                } else {
                    if (s.isEmpty() || s.peek() < 0) {
                        s.push(arr[i]);
                    }
                }
            }
        }
        
        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }

        return res;
    }
}