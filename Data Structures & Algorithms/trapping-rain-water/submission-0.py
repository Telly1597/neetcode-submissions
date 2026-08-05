class Solution:
    def trap(self, height: List[int]) -> int:

        totalWater = 0

        for i in range(len(height)):
            l, r = 0, len(height) - 1
            max_left, max_right = 0, 0
            while l < i:
                max_left = max(max_left, height[l])
                l += 1

            while r > i:
                max_right = max(max_right, height[r])
                r -= 1
            current_water = min(max_left, max_right) - height[i]
            totalWater += max(0, current_water)

        
                
        return totalWater
        