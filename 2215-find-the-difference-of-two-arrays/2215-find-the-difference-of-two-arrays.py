class Solution(object):
    def findDifference(self, nums1, nums2):
        answer = [[], []]
        set1 = set(nums1)
        set2 = set(nums2)
        for n in nums1:
            if not n in set2 and not n in answer[0]:
                answer[0].append(n)
        
        for n in nums2:
            if not n in set1 and not n in answer[1]:
                answer[1].append(n)

        return answer