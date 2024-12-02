import java.util.*;

public class Solution {
    public int[] solve(int[] A) {
        // Convert array to List for easier sorting
        List<Integer> list = new ArrayList<>();
        for (int num : A) {
            list.add(num);
        }

        // Define the comparator
        Collections.sort(list, (a, b) -> {
            int tensA = (a / 10) % 10; // Extract tens digit of a
            int tensB = (b / 10) % 10; // Extract tens digit of b

            if (tensA != tensB) {
                return Integer.compare(tensA, tensB); // Sort by tens digit
            } else {
                return Integer.compare(b, a); // If same tens digit, sort by max value
            }
        });

        // Convert list back to array
        int[] result = new int[A.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A1 = {105, 231, 25, 60, 44, 1234, 9};
        int[] result1 = solution.tensDigitSorting(A1);
        System.out.println(Arrays.toString(result1)); // Example Output: [9, 1234, 25, 44, 60, 231, 105]

        int[] A2 = {90, 45, 81, 22, 14};
        int[] result2 = solution.tensDigitSorting(A2);
        System.out.println(Arrays.toString(result2)); // Example Output: [14, 22, 45, 81, 90]
    }
}
