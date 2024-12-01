public class Solution {
    public int solve(int[][] A) {
        int N = A.length;
        int j = N-1;
        int maxrowones = -1, maxonescount = 0;
        int max_num = 0;
for(int i=0; i<N; i++){
        while(j>=0 && A[i][j] == 1)
        {
            j--;
            maxrowones = i;
        }
}
return maxrowones;
    }
}
