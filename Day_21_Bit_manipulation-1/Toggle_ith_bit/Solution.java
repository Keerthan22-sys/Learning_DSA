public class Solution {
    public int solve(int A, int B) {
        if ((A & (1 << B)) == 0) { // Check if the B-th bit is unset
            A = A | (1 << B); // Set the B-th bit
        } else {
            A = A & ~(1 << B); // Unset the B-th bit
        }
        return A;
    }
}
