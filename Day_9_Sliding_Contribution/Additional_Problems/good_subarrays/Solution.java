public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        int N = A.length;

        for(int i=0; i<N; i++)
        {
            int sum = 0;

            for(int j = i; j < N; j++)
            {
                sum += A[j];
                int length = j - i + 1;

                if(length % 2 == 0 && sum < B)
                {
                    count++;
                }else if(length % 2 != 0 && sum > B){
                    count++;
                }
            }
        }

        return count;
    }
}
