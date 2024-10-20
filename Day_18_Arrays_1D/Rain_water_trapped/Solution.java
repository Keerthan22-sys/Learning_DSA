public class Solution {
    public int max(int A, int B){
        if(A>B){
            return A;
        }else{
            return B;
        }
    }

    public int min(int A, int B)
    {
        if(A<B){
            return A;
        }else{
            return B;
        }
    }
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int[] lmax = new int[A.length];
        int[] rmax = new int[A.length];
        int N = A.length, water = 0, ans = 0;

        for(int i=1 ; i<N-1; i++)
        {
            lmax[i] = max(lmax[i-1], A[i-1]);
        }

        for(int i=N-2; i>=0; i--)
        {
            rmax[i] = max(rmax[i+1], A[i+1]);
        }

        for(int i=1 ; i<N-1; i++)
        {
            water = min(lmax[i], rmax[i]) - A[i];
            if(water > 0){
                ans += water;
            }
        }
        return ans;
    }
}
