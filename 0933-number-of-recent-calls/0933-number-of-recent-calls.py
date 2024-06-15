from collections import deque

class RecentCounter(object):

    def __init__(self):
        self.q = deque()

    def ping(self, t):
        self.q.append(t)

        while t - self.q[0] > 3000:
            self.q.popleft()

        return len(self.q)
        


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)