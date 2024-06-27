class Solution:
    def minReorder(self, n: int, connections: List[List[int]]) -> int:
        answer = 0
        graph = [[] for _ in range(n)]
        
        for s, e in connections:
            graph[s].append((e, 1))
            graph[e].append((s, 0))
        
        def dfs(node, parent):
            cnt = 0
            for n, d in graph[node]:
                if n != parent:
                    cnt += d
                    cnt += dfs(n, node)
            
            return cnt

        return dfs(0, -1)