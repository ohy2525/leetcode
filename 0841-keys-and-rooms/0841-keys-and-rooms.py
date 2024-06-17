class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        self.visited = [False] * len(rooms)
        self.visited[0] = True
        self.dfs(0, rooms)
        return True if sum(self.visited) == len(rooms) else False

    def dfs(self, n, rooms):
        keys = rooms[n]
        for key in keys:
            if not self.visited[key]:
                self.visited[key] = True
                self.dfs(key, rooms)