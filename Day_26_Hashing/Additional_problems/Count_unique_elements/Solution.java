import java.util.*;

public class Solution {
    public int solve(int[] A) {
        // Step 1: Create a HashMap to store frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Populate the HashMap with element frequencies
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Count elements with frequency 1
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == 1) {
                count++;
            }
        }

        // Step 4: Return the count of elements with frequency 1
        return count;
    }

}
