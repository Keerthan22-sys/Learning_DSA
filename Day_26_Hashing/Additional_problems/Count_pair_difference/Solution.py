class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return an integer
    def solve(self, A, B):
        MOD = 10**9 + 7
        freq_map = {}
        count = 0

        # Populate frequency map
        for num in A:
            freq_map[num] = freq_map.get(num, 0) + 1

        # Count pairs
        for num in A:
            target = num - B
            if target in freq_map:
                count += freq_map[target]
        
        return count % MOD
