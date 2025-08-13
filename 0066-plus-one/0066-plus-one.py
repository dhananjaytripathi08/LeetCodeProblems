class Solution(object):
    def plusOne(self, digits):
        output = []
        result = 0
        for i in digits:
            result = result * 10 + i
        result = result + 1
        while result > 0:
            remainder = result % 10
            result = result / 10
            output.insert(0,remainder)
        return output
        