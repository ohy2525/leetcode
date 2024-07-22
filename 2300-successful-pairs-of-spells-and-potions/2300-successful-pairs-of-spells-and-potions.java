class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] answer = new int[spells.length];
        
        for (int i = 0; i < spells.length; i++) {
            int l = 0, r = potions.length;
            while (l < r) {
                int m = l + (r - l) / 2;
                long product = (long) spells[i] * (long) potions[m];
                if (product >= success) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            answer[i] = potions.length - l;
        }

        return answer;
    }
}