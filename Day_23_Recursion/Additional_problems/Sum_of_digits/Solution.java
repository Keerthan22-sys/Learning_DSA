public class Solution {

    // Recursive function to calculate the sum of digits
    private int sumOfDigits(int A) {
        if (A == 0) {
            return 0; // Base case: if A is 0, return 0
        }
        return A % 10 + sumOfDigits(A / 10); // Recursive case: add last digit to sum of remaining digits
    }

    public int solve(int A) {
        return sumOfDigits(A); // Call the recursive function and return the result
    }
}
