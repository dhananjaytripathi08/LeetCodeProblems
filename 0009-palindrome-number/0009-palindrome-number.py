class Solution(object):
    def isPalindrome(self, x):
        num = x
        reverse = 0
        if x < 0:
            return False
        else:
            while num > 0:
                remainder = num % 10
                reverse = (reverse * 10) + remainder
                num = num / 10
            if reverse == x:
                return True
        return False
        