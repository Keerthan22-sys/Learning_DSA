public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        int L, R, sum;
        long[] psum = new long[A.length];
        long[] result = new long[B.length];
        psum[0] = A[0];
        for(int i=1; i<A.length; i++)
        {
            psum[i] = psum[i-1] + A[i];
        }
        
        for(int j=0; j<B.length; j++)
        {
            L = B[j][0];
            R = B[j][1];
            if(L == 0)
            {
                result[j] = psum[R];
            }
            else{
                result[j] = psum[R] - psum[L-1];
            }
        }

        return result;

    }
}
