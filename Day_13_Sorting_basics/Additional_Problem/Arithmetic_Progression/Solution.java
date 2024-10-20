import java.util.Arrays;
public class Solution {
    public int solve(int[] A) {
        int N = A.length;

        Arrays.sort(A);

        int diff = A[1] - A[0];

        for(int i = 2; i<N; i++)
        {
            if(A[i] - A[i-1] != diff){
                return 0;
            }
        }
        return 1;

    }
}
