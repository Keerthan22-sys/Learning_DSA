public class Solution {
    public int cpFact(int A, int B) {
        int X = A;
        int gcdValue;
        
        // Keep removing common factors of X and B until X and B are co-prime
        while ((gcdValue = gcd(X, B)) > 1) {
            X /= gcdValue;
        }
        
        return X;
    }
    
    // Helper method to compute the gcd using Euclidean algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
