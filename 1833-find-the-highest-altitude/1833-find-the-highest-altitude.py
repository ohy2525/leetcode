class Solution(object):
    def largestAltitude(self, gain):
        sum = 0
        maxValue = 0
        for a in gain:
            sum += a
            maxValue = max(maxValue, sum)

        return maxValue