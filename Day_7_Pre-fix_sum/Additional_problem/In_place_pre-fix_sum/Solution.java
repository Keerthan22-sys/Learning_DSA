public class Solution {
    public int[] solve(int[] A) {
        int N = A.length;
        int[] psum = new int[N];
        psum[0] = A[0];
        for(int i=1; i<N; i++)
        {
            psum[i] = psum[i-1] + A[i];
        }

        return psum;
    }
}
