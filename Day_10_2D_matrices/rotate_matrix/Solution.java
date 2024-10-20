public class Solution {
    public void solve(int[][] A) {
        int n = A.length;
        int temp;
        //Transpose a matrix
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;           
            }
        }

        //Reverse a matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp1 = A[i][j];
                A[i][j] = A[i][n-1-j];
                A[i][n-1-j] = temp1;
            }
        }
        //return A;
    }
}
