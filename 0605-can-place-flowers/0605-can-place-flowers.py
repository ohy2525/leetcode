class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        cnt = 0
        for i in range(len(flowerbed)):
            if flowerbed[i]:
                continue
                
            if i == 0:
                if not flowerbed[i + 1]:
                    flowerbed[i] = 1
                    cnt += 1
            elif i == len(flowerbed) - 1:
                if not flowerbed[i - 1]:
                    flowerbed[i] = 1
                    cnt += 1
            elif not flowerbed[i - 1] and not flowerbed[i + 1]:
                    flowerbed[i] = 1
                    cnt += 1
        
        if n > cnt:
            return False
        return True