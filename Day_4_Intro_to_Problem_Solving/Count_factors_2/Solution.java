public class Solution {
    public int solve(int A) {
        int factors = 0;
        for(int i=1; i*i<=A; i++)
        {
            if(A%i==0)
            {
                if(A==i*i)
                {
                    factors += 1;
                }
                else{
                    factors += 2;
                }
            }
        }
        return factors;
    }
}
