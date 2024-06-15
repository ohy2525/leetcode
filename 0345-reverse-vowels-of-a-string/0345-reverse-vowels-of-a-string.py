class Solution(object):
    def reverseVowels(self, s):
        vowels = ['a','e','i','o','u','A','E','I','O','U']
        tmp = []

        for c in s:
            if c in vowels:
                tmp.append(c)

        result = ""

        for c in s:
            if c in vowels:
                result += tmp.pop()
            else:
                result += c

        return result
        