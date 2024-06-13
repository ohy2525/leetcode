class Solution(object):
    def gcdOfStrings(self, str1, str2):
        str1, str2 = (str1, str2) if len(str1) <= len(str2) else (str2, str1)
        len1, len2 = len(str1), len(str2)

        for i in range(len(str1), 0, -1):
            if len1 % i != 0 or len2 % i != 0:
                continue
            
            prefix = str1[:i]
            n1, n2 = len1 // i, len2 // i
            if prefix * n1 == str1 and prefix * n2 == str2:
                return prefix
        
        return ""
        