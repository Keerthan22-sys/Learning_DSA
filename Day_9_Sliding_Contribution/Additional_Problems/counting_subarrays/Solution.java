public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;
        int count = 0, sum = 0, start = 0;

        // sliding approach
        for (int end = 0; end < N; end++)
        {
            sum += A[end];

            //shrink the window if sum exceeds or equals B
            while(sum >= B && start <= end)
            {
                sum -= A[start];
                start++;
            }

            //The number of valid subarrays ending at 'end'
            count += (end-start + 1);
        }

        return count;
    }
}
