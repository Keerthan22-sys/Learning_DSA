public class Solution {
    public int solve(int A) {
        int magicNumber = 0;
        int power = 1; // Initialize power of 5

        while (A > 0) {
            power *= 5; // 5^1, 5^2, 5^3, ...
            if ((A & 1) == 1) { // Check if the current bit is set
                magicNumber += power;
            }
            A >>= 1; // Move to the next bit
        }

        return magicNumber;
    }
}
