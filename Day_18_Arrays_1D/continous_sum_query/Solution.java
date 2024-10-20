public class Solution {
    public int[] solve(int A, int[][] B) {
                int[] prefix = new int[A+1];

        for(int[] devotee: B)
        {
            int L = devotee[0]; //start index
            int R = devotee[1]; // end index
            int P = devotee[2]; // value

            prefix[L-1] += P;
            if(R < A){
                prefix[R] -= P;
            }
        }

        //prefix sum
        for(int i=1; i<=A; i++)
        {
            prefix[i] += prefix[i-1];
        }

        int[] result = new int[A];
        System.arraycopy(prefix, 0, result, 0, A);

        return result;
    }
}
