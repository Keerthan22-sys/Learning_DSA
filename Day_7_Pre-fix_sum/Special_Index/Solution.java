public class Solution {
    public int solve(int[] A) {
        int N=A.length;

        int[] evenPrefix = new int[N+1];
        int[] oddPrefix = new int[N+1];

        for(int i=0; i<N; i++)
        {
            evenPrefix[i+1] = evenPrefix[i];
            oddPrefix[i+1] = oddPrefix[i];
            if(i%2 == 0)
            {
                evenPrefix[i+1] += A[i];
            }else{
                oddPrefix[i+1] += A[i];
            }
        }

        int count = 0;

        for(int i=0; i<N; i++)
        {
            int evenSumAfterRemoval = evenPrefix[i] + (oddPrefix[N] - oddPrefix[i+1]);
            int oddSumAfterRemoval = oddPrefix[i] + (evenPrefix[N] - evenPrefix[i+1]);

            if(evenSumAfterRemoval == oddSumAfterRemoval)
            {
                count++;
            } 
        }

        return count;
    }
}
