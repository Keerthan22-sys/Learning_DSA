package Additional_problems.Is_magic;
public class Solution {
    public int solve(int A) {
        int sum = A;
        
        // Keep reducing the sum to a single digit
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }
        
        // Check if the single digit is 1
        return sum == 1 ? 1 : 0;
    }
    
    // Helper function to calculate the sum of digits of a number
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

