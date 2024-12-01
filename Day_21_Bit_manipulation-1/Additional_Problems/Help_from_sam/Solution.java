public class Solution {
    public int solve(int A) {
        int helpCount = 0;

        while (A > 0) {
            if (A % 2 == 0) {
                // If A is even, we can assume it was reached by doubling A/2
                A /= 2;
            } else {
                // If A is odd, we need to take help from Sam
                A -= 1;
                helpCount++;
            }
        }

        return helpCount;
    }
}
