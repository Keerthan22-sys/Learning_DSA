import java.util.Arrays;
public class Solution {
    public static void selection_sort(int[] A)
    {
        int N = A.length;
        for(int i = 0; i<N-1; i++)
        {
            int minindex = i;
            for(int j=i; j<N; j++)
            {
                if(A[j] < A[minindex])
                {
                    minindex = j;
                }
            }

            int temp = A[i];
            A[i] = A[minindex];
            A[minindex] = temp;
        }
    }

    public int solve(int[] A) {
        int N = A.length;
        int ans = 0;
        //selection_sort(A);
        Arrays.sort(A);
        for(int i=0; i<N; i++)
        {
            if(i < N-1 && (A[i] == A[i+1]))
            {
                continue;
            }

            if(A[i] == N-i-1)
                return 1;
        }
        return -1;

    }
}
