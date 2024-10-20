public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int N=A.length;
        int i=0, row = 0, col = 0, sum = 0;
        while(row < N)
        {
            sum += A[row][col];
            row++;
            col++;
        }
        return sum;
    }
}
