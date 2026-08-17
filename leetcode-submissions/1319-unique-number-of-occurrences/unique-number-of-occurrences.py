
class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        count = Counter(arr)
        occurence = list(count.values())
        for i in occurence:
            if occurence.count(i)>1:
                return False
        return True



        
        