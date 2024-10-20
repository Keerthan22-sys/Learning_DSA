public class Solution {
    public static int max(int a, int b){
        if(a > b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    public int solve(String A) {
        int N=A.length();
        char arr[] = A.toCharArray();
        int ans = 0, totalOnes = 0, l = 0, r = 0, j;

        for(int i=0; i<N; i++)
        {
            if(arr[i] == '1'){
                totalOnes++;
            }  
        }
        if(totalOnes == N){
            return N;
        }

        for(int i=0; i<N; i++)
        {
            if(arr[i] == '0')
            {
                l=0; 
                r=0;
                j = i+1;
                while(j < N && arr[j] == '1' )
                {
                    j++; 
                    r++;
                }
                j = i - 1;
                while(j >= 0 && arr[j] == '1')
                {
                    j--; 
                    l++;
                }

                if(l+r == totalOnes)
                {
                    ans = max(ans, l+r);
                }else{
                    ans = max(ans, l+r+1);
                }
            }
        }
        return ans; 
    }
}
