class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Map of Roman numeral values
        roman_values = {
            'I': 1, 'V': 5, 'X': 10,
            'L': 50, 'C': 100, 'D': 500, 'M': 1000
        }
        
        total = 0  # Initialize total
        n = len(s)  # Length of the string
        
        for i in range(n):
            # If current numeral is smaller than the next numeral, subtract it
            if i < n - 1 and roman_values[s[i]] < roman_values[s[i + 1]]:
                total -= roman_values[s[i]]
            else:
                total += roman_values[s[i]]
        
        return total

        