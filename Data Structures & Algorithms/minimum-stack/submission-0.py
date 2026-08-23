class MinStack:

    def __init__(self):
        # use two stack:
        self.stack = []
        self.min_stack = []
        

    def push(self, val: int) -> None:
        # always append on the main stack.
        self.stack.append(val)

        # check if min_stack empty or val less than or equal (duplicates) to current val. 
        if len(self.min_stack) == 0 or self.min_stack[-1] >= val:
            self.min_stack.append(val)

    def pop(self) -> None:
        top_value = self.stack.pop()
        if self.min_stack and top_value == self.min_stack[-1]:
            self.min_stack.pop()
        
    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.min_stack[-1]
        
