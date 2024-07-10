class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> row = new HashMap<>();
        int n = grid.length;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int c : grid[i]) {
                sb.append(c);
                sb.append(',');
            }
            row.put(sb.toString(), row.getOrDefault(sb.toString(), 0) + 1);
        }
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[j][i]);
                sb.append(',');
            }
            answer += row.getOrDefault(sb.toString(), 0);
        }
        
        return answer;
    }
}