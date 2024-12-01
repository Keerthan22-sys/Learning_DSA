public class Solution {
    public long solve(long A, int B) {
        // Create a mask with the rightmost B bits unset
        long mask = ~((1L << B) - 1);
        // Apply the mask to A
        return A & mask;
    }
}
