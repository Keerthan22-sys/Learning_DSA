import java.util.*;

public class Solution {
    public int[] solve(int[] A, int[] B) {
        // Step 1: Create a HashMap to store frequency of elements in A
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 2: Populate the frequency map with elements from A
        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: List to store common elements
        List<Integer> result = new ArrayList<>();
        
        // Step 4: Iterate through B and find common elements
        for (int num : B) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);  // Add the element to result
                freqMap.put(num, freqMap.get(num) - 1);  // Decrement the count in the map
            }
        }

        // Step 5: Convert the list to an array and return
        int[] commonElements = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            commonElements[i] = result.get(i);
        }

        return commonElements;
    }
}
