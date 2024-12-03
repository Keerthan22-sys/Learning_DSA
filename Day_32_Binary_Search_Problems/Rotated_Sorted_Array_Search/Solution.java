public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int N = A.length;
        int l = 0, r = N - 1;
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            if(A[mid] == B){
                return mid;
            }
            if(A[mid] < A[0])
            {
                if(B < A[0]){
                    if(B < A[mid]){
                        r = mid - 1;
                    }
                    else{
                        l = mid + 1;
                    }
                }else{
                r = mid - 1;
            }
            }
            else
            {
                if(B < A[0])
                {
                    l = mid + 1;
                }
                else{
                    if(B < A[mid]){
                        r = mid - 1;
                    }
                    else{
                        l = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
