public class Solution {
    public int solve(int[][] A) {
        int totalSum = 0;
        int N = A.length;
        int tl = 0, br = 0, contri = 0;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                tl = ((i+1) * (j+1));
                br = ((N-i) * (N-j));
                contri = tl * br * A[i][j];
                totalSum += contri;
            }
        }
        return totalSum;
    }
}
