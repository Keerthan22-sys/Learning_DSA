public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int N = A.length;
        for(int i = 0; i<N-1; i++)
        {
            int maxindex = i;
            for(int j = i+1; j<N; j++)
            {
                if(A[j] < A[maxindex])
                {
                    maxindex = j;
                }
            }

            int temp = A[i];
            A[i] = A[maxindex];
            A[maxindex] = temp;
        }
        return A[B-1];
    }
}
