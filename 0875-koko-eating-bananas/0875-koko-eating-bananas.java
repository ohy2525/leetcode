class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles) r = Math.max(r, p);

        while (l < r) {
            int m = l + (r - l) / 2;
            if (cond(piles, m, h)) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    private boolean cond(int[] piles, int k, int h) {
        int curCnt = 0;
        for (int p : piles) {
            curCnt += p / k + (p % k > 0 ? 1 : 0);
            if (curCnt > h) return false;
        }
        return true;
    }
}