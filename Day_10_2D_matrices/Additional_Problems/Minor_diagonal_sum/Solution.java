public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int n = A.length;
        int row=0, col=n-1;
        int sum= 0;
        for(int i=0; i<n; i++){
            sum += A[row][col];
            row++;
            col--;
        }
        return sum;
    }
}
