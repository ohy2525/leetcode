class Solution(object):
    def findDifference(self, nums1, nums2):
        answer = [[], []]
        hashTable = {}
        for n in nums1:
            if n not in hashTable:
                hashTable[n] = [True, False]

        for n in nums2:
            if n in hashTable:
                hashTable[n][1] = True
            else:
                hashTable[n] = [False, True]

        for k, v in hashTable.items():
            if v[0] and not v[1]:
                answer[0].append(k)
            elif not v[0] and v[1]:
                answer[1].append(k)

        return answer