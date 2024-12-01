class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        max_val = max(A)
        time = 0
        for num in A:
            time += (max_val - num)
        return time
