import java.util.HashMap;

public class Solution {
    public int solve(int[] A) {
        // HashMap to store the first occurrence index of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE; // To track the smallest index of a repeating element

        for (int i = 0; i < A.length; i++) {
            // If the element is already in the map, update minIndex
            if (map.containsKey(A[i])) {
                minIndex = Math.min(minIndex, map.get(A[i]));
            } else {
                // Otherwise, store the first occurrence index
                map.put(A[i], i);
            }
        }

        // If no repeating element is found, return -1
        if (minIndex == Integer.MAX_VALUE) {
            return -1;
        }

        // Return the first repeating element
        return A[minIndex];
    }
}
