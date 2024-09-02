class Solution {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    public int numIslands(char[][] grid) {
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    result++;
                }
            }
        }

        return result;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            dfs(grid, i + dx[k], j + dy[k], visited);
        }
    }
}