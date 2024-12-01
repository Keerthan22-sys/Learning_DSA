import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] A, int[] B) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = A.length;

        // Add all intervals that come before the new interval
        while (i < n && A[i][1] < B[0]) {
            result.add(A[i]);
            i++;
        }

        // Merge overlapping intervals with the new interval
        while (i < n && A[i][0] <= B[1]) {
            B[0] = Math.min(B[0], A[i][0]);
            B[1] = Math.max(B[1], A[i][1]);
            i++;
        }
        result.add(B); // Add the merged interval

        // Add all intervals that come after the new interval
        while (i < n) {
            result.add(A[i]);
            i++;
        }

        // Convert the result list to an array
        return result.toArray(new int[result.size()][]);
    }
}

