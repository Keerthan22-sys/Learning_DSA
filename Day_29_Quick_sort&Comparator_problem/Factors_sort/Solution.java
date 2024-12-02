import java.util.Arrays;

public class Solution {
    public int[] solve(int[] A) {
        // Convert int[] to Integer[] for custom sorting
        Integer[] arr = Arrays.stream(A).boxed().toArray(Integer[]::new);

        // Sort array with a custom comparator
        Arrays.sort(arr, (a, b) -> {
            int factorsA = countFactors(a);
            int factorsB = countFactors(b);

            // Sort by number of factors first
            if (factorsA != factorsB) {
                return factorsA - factorsB;
            }

            // If number of factors is the same, sort by value
            return a - b;
        });

        // Convert Integer[] back to int[]
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }

    // Method to count factors of a number
    private int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    count++; // Perfect square
                } else {
                    count += 2; // Two distinct factors
                }
            }
        }
        return count;
    }
}
