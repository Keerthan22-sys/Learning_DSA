public class Solution {
    public int[] solve(int[] A) {
        int[] psum = new int[A.length];
        psum[0] = A[0];
        for(int i=1; i<A.length; i++)
        {
            psum[i] = psum[i-1] + A[i];
        }
        return psum;
    }
}
