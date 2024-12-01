public class Solution {
    public int solve(int A, int B) {
        // Create a mask with the B-th bit set
        int mask = 1 << B;
        // Check if the B-th bit is set
        return (A & mask) != 0 ? 1 : 0;
    }
}
