class Solution(object):
    def removeKdigits(self, num, k):
        ans = []
        for i in num:
            while k > 0 and ans and ans[-1] > i:
                ans.pop()
                k -= 1
            ans.append(i)

        while k > 0:
            ans.pop()
            k -= 1
        
        result = "".join(ans).lstrip("0")

        return result if result else "0"
        