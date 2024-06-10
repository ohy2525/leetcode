class Solution {
    int answer = Integer.MAX_VALUE;

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for (int base : baseCosts) {
            dfs(base, 0, toppingCosts, target);
        }

        return answer;
    }

    private void dfs(int currentCost, int idx, int[] toppingCosts, int target) {
        if (Math.abs(currentCost - target) < Math.abs(answer - target) ||
                (Math.abs(currentCost - target) == Math.abs(answer - target) && currentCost < answer)) {
            answer = currentCost;
        }

        if (idx == toppingCosts.length || currentCost - target > Math.abs(answer - target)) {
            return;
        }

        dfs(currentCost, idx + 1, toppingCosts, target);
        dfs(currentCost + toppingCosts[idx], idx + 1, toppingCosts, target);
        dfs(currentCost + 2 * toppingCosts[idx], idx + 1, toppingCosts, target);
    }
}