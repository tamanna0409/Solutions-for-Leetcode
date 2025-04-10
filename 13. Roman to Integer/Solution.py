class Solution:
    def romanToInt(self, s: str) -> int:
        ans = 0
        n=0
        roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C':100,
            'D':500,
            'M':1000
        }
        for i in reversed(s):
            n = roman[i]
            if 4*n<ans:
                ans = ans - n
            else:
                ans = ans + n
        return ans