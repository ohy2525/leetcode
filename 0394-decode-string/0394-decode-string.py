class Solution:
    def decodeString(self, s: str) -> str:
        stack = []

        for char in s:
            if char != ']':
                stack.append(char)
            else:
                cur_str = ''
                while stack[-1] != '[':
                    cur_str = stack.pop() + cur_str
                stack.pop()

                cur_num = ''
                while stack and stack[-1].isdigit():
                    cur_num = stack.pop() + cur_num
                
                stack.append(int(cur_num) * cur_str)

        return "".join(stack)
        