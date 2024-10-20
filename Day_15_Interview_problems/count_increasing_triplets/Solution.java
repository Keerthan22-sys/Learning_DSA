public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int count = 0;

        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                if(A[i] < A[j])
                {
                    for(int k=j+1; k<N; k++)
                    {
                        if(A[j] < A[k])
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
