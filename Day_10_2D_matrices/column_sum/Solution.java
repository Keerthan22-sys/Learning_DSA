public class Solution {
    public int[] solve(int[][] A) {
        int N = A.length;
        int[] sum = new int[A[0].length];
        for(int col=0; col<A[0].length; col++)
        {
            for(int row=0; row<N; row++)
            {
                sum[col] += A[row][col];
            }
        }
        return sum;
    }
}
