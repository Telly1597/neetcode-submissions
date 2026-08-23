class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        sign_list = ['+', '-', "*", '/']
        for ch in tokens:
            if ch in sign_list:
                total = 0
                if ch == '+':
                    first_val = int(stack.pop())
                    second_val = int(stack.pop())
                    total = second_val + first_val
                elif ch == '-':
                    first_val = int(stack.pop())
                    second_val = int(stack.pop())
                    total = second_val - first_val
                elif ch == '*':
                    first_val = int(stack.pop())
                    second_val = int(stack.pop())
                    total = second_val * first_val
                else:
                    first_val = int(stack.pop())
                    second_val = int(stack.pop())
                    total = second_val / first_val
                stack.append(total)
            else:
                stack.append(ch)
        
        return int(stack[-1])