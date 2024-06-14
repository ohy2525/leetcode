class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        maxCnt = max(candies)
        answer = []
        for c in candies:
            if c + extraCandies >= maxCnt:
                answer.append(True)
            else:
                answer.append(False)

        return answer