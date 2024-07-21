class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        while (l < r) {
            int m = l + (r - l) / 2;
            if (cond(weights, m, days)) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    private boolean cond(int[] weights, int m, int days) {
        int sum = 0, cnt = 1;

        for (int w : weights) {
            sum += w;
            if (sum > m) {
                cnt++;
                sum = w;
            }
            if (cnt > days) return false;
        }
        return true;
    }
}