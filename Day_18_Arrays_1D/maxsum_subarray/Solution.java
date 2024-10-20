public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int maxsum = Integer.MIN_VALUE;
        int runsum = 0;
        int N = A.length;
        for(int i=0;i<N; i++)
        {
            runsum += A[i];
            if(runsum > maxsum){
                maxsum = runsum;
            }
            if(runsum < 0){
                runsum = 0;
            }
        }
        return maxsum;
    }
}

