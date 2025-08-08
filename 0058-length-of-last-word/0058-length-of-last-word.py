class Solution(object):
    def lengthOfLastWord(self, s):
        word = s.split()
        last_word = word[len(word)-1]
        return len(last_word)
        