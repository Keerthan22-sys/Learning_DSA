public class Solution {
    public int[] solve(int[] A, int B) {
        int N=A.length;
        B = B%N;

        reverse(A, 0, N-1);
        reverse(A, 0, B-1);
        reverse(A, B, N-1);

        return A;
    }

    private static void reverse(int[] A, int start, int end)
    {
        while(start < end)
        {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}
