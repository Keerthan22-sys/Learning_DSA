public class Solution {
    public static void selection_sort(int[] A)
    {
        int N = A.length;
        for(int i = 0; j < N-1; j++)
        {
            
        }
    }
    public int solve(int[] A) {
        int ans = 0;
        int N = A.length;
        selection_sort(A);
        for(int i = 0; i<N; i++)
        {
            ans += A[i] * (i+1);
        }
        return ans;
    }
}
