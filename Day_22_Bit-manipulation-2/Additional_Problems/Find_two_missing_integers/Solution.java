public class Solution {
    public int[] solve(int[] A) {
        int N = A.length;
        
        // Calculate the expected sum and sum of squares of numbers 1 to N+2
        long totalSum = (long) (N + 2) * (N + 3) / 2;
        long totalSumSquares = (long) (N + 2) * (N + 3) * (2 * (N + 2) + 1) / 6;
        
        // Calculate the actual sum and sum of squares of elements in A
        long sumA = 0, sumSquaresA = 0;
        for (int num : A) {
            sumA += num;
            sumSquaresA += (long) num * num;
        }
        
        // Calculate the difference
        long sumMissing = totalSum - sumA; // x + y
        long sumSquaresMissing = totalSumSquares - sumSquaresA; // x^2 + y^2
        
        // Solving for x and y:
        // x + y = sumMissing
        // x^2 + y^2 = sumSquaresMissing
        // We can use the identity: (x + y)^2 = x^2 + y^2 + 2xy
        long sumMissingSquared = sumMissing * sumMissing;
        long productMissing = (sumMissingSquared - sumSquaresMissing) / 2;
        
        // Now we solve for x and y:
        long discriminant = sumMissing * sumMissing - 4 * productMissing;
        long x = (sumMissing + (long) Math.sqrt(discriminant)) / 2;
        long y = sumMissing - x;
        
        return new int[]{(int) Math.min(x, y), (int) Math.max(x, y)};
    }
}

