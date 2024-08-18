class Solution {
    public boolean hasValidPath(int[][] grid) {
        Map<Integer, int[][]> tiles = new HashMap<>();
        tiles.put(1, new int[][] {{0, -1}, {0, 1}});
        tiles.put(2, new int[][] {{-1, 0}, {1, 0}});
        tiles.put(3, new int[][] {{0, -1}, {1, 0}});
        tiles.put(4, new int[][] {{0, 1}, {1, 0}});
        tiles.put(5, new int[][] {{0, -1}, {-1, 0}});
        tiles.put(6, new int[][] {{-1, 0}, {0, 1}});

        int tx = grid.length - 1, ty = grid[tx].length - 1;

        Deque<int[]> q = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        q.addLast(new int[] {0, 0});
        visited.add("0_0");

        while (!q.isEmpty()) {
            int[] p = q.pollFirst();
            int x = p[0], y = p[1];
            if (x == tx && y == ty) {
                return true;
            }

            int[][] tile = tiles.get(grid[x][y]);

            for (int[] nextDir : tile) {
                int nx = x + nextDir[0], ny = y + nextDir[1];
                if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[nx].length || visited.contains(nx + "_" + ny)) {
                    continue;
                }

                int[][] nextTile = tiles.get(grid[nx][ny]);
                for (int[] retDir : nextTile) {
                    int rx = nx + retDir[0], ry = ny + retDir[1];

                    if (rx == x && ry == y) {
                        visited.add(nx + "_" + ny);
                        q.addLast(new int[] {nx, ny});
                        break;
                    }
                }
            }
        }

        return false;
    }
}