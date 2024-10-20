public class Solution {
    public int[][] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] transpose = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }
}
