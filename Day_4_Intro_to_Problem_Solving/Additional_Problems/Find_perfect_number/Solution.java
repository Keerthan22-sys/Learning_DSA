public class Solution {
    public int solve(int A) {
        int sum = 0;
        for (int i = 1; i < A; i++) {
            if (A % i == 0) {
                sum += i;
            }
        }
        return sum == A ? 1 : 0;
    }
}