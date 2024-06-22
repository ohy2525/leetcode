class Solution:
    def countCompleteDayPairs(self, hours: List[int]) -> int:
        check = [0] * 25
        answer = 0

        for hour in hours:
            rem = hour % 24
            rem2 = (24 - rem) % 24
            if check[rem2] != 0:
                answer += check[rem2]

            check[rem] += 1
        
        return answer