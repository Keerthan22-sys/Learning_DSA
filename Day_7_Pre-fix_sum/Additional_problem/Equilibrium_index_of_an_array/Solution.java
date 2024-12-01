public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        if (N==0)   
            return -1;

        long totalSum = 0;
        for(int i=0; i<N; i++)
        {
            totalSum += A[i];
        }

        long leftSum = 0;
        for(int i=0; i < N; i++)
        {
            long rightSum = totalSum - leftSum - A[i];
            if(leftSum == rightSum)
                return i;

            leftSum += A[i];
        }

        return -1;
    }
}
