class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        matching = {
            ")":"(",
            "}":"{",
            "]":"[", 
        }
        for val in s:
            if val in "([{":
                stack.append(val)
            else:
                if not stack or stack[-1] != matching[val]:
                    return False
                stack.pop()

        return not stack
        