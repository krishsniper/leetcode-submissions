from collections import Counter

class Solution(object):
    def firstUniqChar(self, s):
        counts = Counter(s) 
        
        for index, char in enumerate(s):
            if counts[char] == 1:
                return index
                
        return -1