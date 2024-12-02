public class Solution {
    public int solve(int A, int B, int C) {
        long lcmBC = lcm(B, C);  // Calculate LCM of B and C
        return (int)(A / lcmBC);  // Count the multiples of LCM up to A
    }
    
    // Method to calculate the gcd using Euclidean algorithm
    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    // Method to calculate the lcm using the gcd
    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
