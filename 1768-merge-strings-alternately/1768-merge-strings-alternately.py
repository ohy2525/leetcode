class Solution(object):
    def mergeAlternately(self, word1, word2):
        ans = ""
        minLength = min(len(word1), len(word2))
        idx = 0
        if len(word1) >= len(word2):
            for i in range(len(word2)):
                ans += word1[i]
                ans += word2[i]
                idx += 1
            for i in range(idx, len(word1)):
                ans += word1[i]
        else:
            for i in range(len(word1)):
                ans += word1[i]
                ans += word2[i]
                idx += 1
            for i in range(idx, len(word2)):
                ans += word2[i]

        return ans
