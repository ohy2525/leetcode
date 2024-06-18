class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        answer = 0
        n = len(isConnected)
        visited = [False] * n

        def dfs(x):
            for y in range(n):
                if isConnected[x][y] and not visited[y]:
                    visited[y] = True
                    dfs(y)

        for i in range(n):
            if not visited[i]:
                visited[i] = True
                answer += 1
                dfs(i)

        return answer
        