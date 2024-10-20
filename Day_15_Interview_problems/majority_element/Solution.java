public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int majeleindx = 0;
        int count = 1;
        int N = A.length;
        
        for(int i=1; i<N; i++)
        {
            if(count == 0)
            {
                majeleindx = i;
                count = 1;
            }
            else
            {
                if(A[i] == A[majeleindx])
                {
                    count++;
                }
                else{
                    count--;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<N; i++)
        {
            if(A[i] == A[majeleindx])
            {
                cnt++;
            }
        }

        if(cnt > N/2)
        {
            return A[majeleindx];
        }
        else{
            return -1;
        }
    }
}
