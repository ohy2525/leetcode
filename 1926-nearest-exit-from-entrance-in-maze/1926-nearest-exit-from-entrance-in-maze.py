from collections import deque

class Solution:
    def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:
        dx = [-1, 0, 1, 0]
        dy = [0, 1, 0, -1]
        q = deque()
        row = len(maze)
        col = len(maze[0])
        visited = [[False] * col for _ in range(row)]
        q.append((entrance[0], entrance[1], 0))
        visited[entrance[0]][entrance[1]] = True

        while q:
            x, y, cnt = q.popleft()
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if 0 <= nx < row and 0 <= ny < col and maze[nx][ny] == '.' and not visited[nx][ny]:
                    visited[nx][ny] = True
                    q.append((nx, ny, cnt + 1))
                    if nx == 0 or nx == row - 1 or ny == 0 or ny == col - 1:
                        print(visited)
                        return cnt + 1
            

        return -1