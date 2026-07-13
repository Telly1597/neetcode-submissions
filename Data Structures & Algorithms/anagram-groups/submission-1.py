from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        res = []
        hash_map = defaultdict(list)

        for st in strs:
            key = ''.join(sorted(st))
            hash_map[key].append(st)
            
            
        for key, val in hash_map.items():
            res.append(val)

        return res