public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int[] subarray = new int[C - B + 1];
        for (int i = B; i <= C; i++) {
            subarray[i - B] = A[i];
        }
        return subarray;
    }
}
