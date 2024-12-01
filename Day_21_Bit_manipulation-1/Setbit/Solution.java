public class Solution {
    public int solve(int A, int B) {
        // Create masks for the A-th and B-th bits
        int maskA = 1 << A; // Set the A-th bit
        int maskB = 1 << B; // Set the B-th bit
        
        // Combine the masks using bitwise OR
        return maskA | maskB;
    }
}
