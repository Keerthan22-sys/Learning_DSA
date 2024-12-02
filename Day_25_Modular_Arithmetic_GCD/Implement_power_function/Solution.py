# Do not write code to include libraries, main() function or accept any input from the console.
# Initialization code is already written and hidden from you. Do not write code for it again.
class Solution:
    # @param A : integer
    # @param B : integer
    # @param C : integer
    # @return an integer
    #def pow(self, A, B, C):
        # Just write your code below to complete the function. Required input is available to you as the function arguments.
        # Do not print the result or any output. Just return the result via this function

    def pow(self, A, B, C):
        # Edge case where C is 1, as any number mod 1 is 0
        if C == 1:
            return 0

        # Handle negative base properly by adjusting modulo
        A = A % C
        if A < 0:
            A += C

        result = 1
        while B > 0:
            # If B is odd, multiply A with result and take modulo C
            if (B % 2) == 1:
                result = (result * A) % C
                if result < 0:  # Ensure result is non-negative
                    result += C

            # Square the base for the next iteration and reduce B by half
            A = (A * A) % C
            if A < 0:  # Ensure base is non-negative
                A += C
            B //= 2

        return result

