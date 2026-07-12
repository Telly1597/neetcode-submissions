class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        map_values = {}

        for val in nums:
            if val not in map_values:
                map_values[val] = True
            else:
                return True
        return False
        