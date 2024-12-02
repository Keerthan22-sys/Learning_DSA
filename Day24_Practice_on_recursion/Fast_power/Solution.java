public class Solution {
    public long Power(int A, int B) {
        // Call the helper recursive function to compute A^B
        return power(A, B);
    }
    
    public long power(int A, int B) {
        // Base case: any number to the power 0 is 1
        if (B == 0) {
            return 1;
        }
        
        // Recursive case
        long halfPower = power(A, B / 2);
        
        // If B is even, the result is halfPower * halfPower
        if (B % 2 == 0) {
            return halfPower * halfPower;
        } else {
            // If B is odd, the result is A * halfPower * halfPower
            return A * halfPower * halfPower;
        }
    }
}
