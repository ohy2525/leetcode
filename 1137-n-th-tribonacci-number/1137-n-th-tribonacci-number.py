class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        if n == 2:
            return 1
            
        arr = [0, 1, 1]
        for i in range(2, n):
            arr.append(arr[i - 2] + arr[i - 1] + arr[i]) 

        return arr[-1]