public class Solution {
    public int[] solve(int[][] A) {
        int N = A.length;
        int[] sum = new int[N];
        for(int row=0; row<N; row++)
        {
            for(int col=0; col<A[0].length; col++)
            {
                sum[row] += A[row][col];
            }
        }
        return sum;
    }
}
