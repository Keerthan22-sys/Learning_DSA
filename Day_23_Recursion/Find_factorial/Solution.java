public class Solution {
    public static int fact(int N)
    {
        if(N <= 1)
        {
            return 1;
        }
        else{
            return N * fact(N - 1);
        }
    }
    public int solve(int A) {
        int res = fact(A);
        return res;
    }
}
