public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int l = 0, r = A.length - 1;
        while(l<=r)
        {
            int mid = l + (r - l) / 2;
            if((mid == 0 || A[mid] != A[mid-1]) && (mid == N-1 || A[mid] != A[mid+1])){
                return A[mid];
            }
            int firstoccr = mid;
            if(mid != 0 && A[mid] == A[mid-1]){
                firstoccr = mid - 1;
            }

            if(firstoccr % 2 == 0){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
