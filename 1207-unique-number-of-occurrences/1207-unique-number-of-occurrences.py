class Solution(object):
    def uniqueOccurrences(self, arr):
        dic = {}
        for num in arr:
            if num in dic:
                dic[num] += 1
            else:
                dic[num] = 1

        cnt = [False] * 1000
        for k, v in dic.items():
            if cnt[v]:
                return False
            else:
                cnt[v] = True

        return True