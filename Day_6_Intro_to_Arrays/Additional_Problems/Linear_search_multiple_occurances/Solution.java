public class Solution {
    public int solve(int[] A, int B) {
        int occur = 0;
        for(int i=0; i<A.length; i++)
        {
            if(B == A[i])
            {
                occur++;
            }
        }
        return occur;
    }
}
