public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
}
