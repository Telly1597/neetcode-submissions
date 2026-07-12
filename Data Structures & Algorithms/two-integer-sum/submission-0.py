class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map_val = {}

        for i, val in enumerate(nums):
            if val in map_val:
                return [map_val[val], i]
            else:
                map_val[target - val] = i
        