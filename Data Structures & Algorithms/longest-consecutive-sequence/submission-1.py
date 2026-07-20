class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        uniqueVals = set(nums)

        maxSequence = 0

        for val in nums:
            if val - 1 not in uniqueVals:
                cur = 1
                while val + 1 in uniqueVals:
                    cur += 1
                    val += 1
                maxSequence = max(maxSequence, cur)
        
        return maxSequence