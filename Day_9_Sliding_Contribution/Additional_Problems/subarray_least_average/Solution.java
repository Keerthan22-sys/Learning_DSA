public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;

        // Calculate the sum of the first subarray of size B
        int currentsum = 0;
        for(int i=0; i<N; i++)
        {
            currentsum += A[i];
        }

        int minsum = currentsum;
        int minindex = 0;
        // Slide the window across the array
        for(int i=B; i<N; i++)
        {
            currentsum += A[i] - A[i-B]; // Add new element and remove the old element
            if(currentsum < minsum){
                minsum = currentsum;
                minindex = i-B+1; // Update the starting index of the minimum sum subarray
            }
        }
        return minindex;
    }
}
