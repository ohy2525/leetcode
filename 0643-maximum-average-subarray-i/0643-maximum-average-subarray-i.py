class Solution(object):
    def findMaxAverage(self, nums, k):
        sumList = []
        tmp = 0
        for i in range(k):
            tmp += int(nums[i])
        sumList.append(tmp)

        for i in range(k, len(nums)):
            sumList.append(sumList[-1] + nums[i] - nums[i - k])

        return float(max(sumList)) / k