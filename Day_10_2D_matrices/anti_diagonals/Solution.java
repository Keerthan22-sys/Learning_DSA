public class Solution {
    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] result = new int[2 * N-1][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Calculate which diagonal this element belongs to
                int diagonalIndex = i + j;
                // Find the next available position in the current anti-diagonal
                for (int k = 0; k < N; k++) {
                    if (result[diagonalIndex][k] == 0) {
                        result[diagonalIndex][k] = A[i][j];
                        break;
                    }
                }
            }
        }
        return result;
    }
}
