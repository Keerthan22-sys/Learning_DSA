public class Solution {
    public int solve(int A, int B) {
        if ((A & (1 << B)) != 0) {
            // Unset the B-th bit
            A = A & ~(1 << B);
        }
        return A;

    }
}


