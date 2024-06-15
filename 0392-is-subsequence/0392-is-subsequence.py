class Solution(object):
    def isSubsequence(self, s, t):
        posS = 0
        posT = 0

        while posS < len(s):
            flag = False
            for i in range(posT, len(t)):
                if t[i] == s[posS]:
                    posT = i + 1
                    posS += 1
                    flag = True
                    break
            
            if not flag:
                return False
        
        return True
         