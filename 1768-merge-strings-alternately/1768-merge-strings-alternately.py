class Solution(object):
    def mergeAlternately(self, word1, word2):
        ans = []
        minLength = min(len(word1), len(word2))
        idx = 0
        while idx < len(word1) or idx < len(word2):
            if idx < len(word1):
                ans.append(word1[idx])
            if idx < len(word2):
                ans.append(word2[idx])
            idx += 1

        return ''.join(ans)
