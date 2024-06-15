class Solution(object):
    def pivotIndex(self, nums):
        leftSum = 0
        rightSum = sum(nums) - nums[0]
        idx = 0
        nums.append(0)
        
        while idx < len(nums) - 1:
            if leftSum == rightSum:
                return idx
            
            leftSum += nums[idx]
            rightSum -= nums[idx + 1]

            idx += 1
        
        return -1