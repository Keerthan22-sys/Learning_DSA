import java.util.*;

public class Solution {
    public int[] solve(int[] A, int[] B) {
        // Step 1: Create a HashMap to store the frequency of each learner in A
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int learner : A) {
            frequencyMap.put(learner, frequencyMap.getOrDefault(learner, 0) + 1);
        }
        
        // Step 2: Initialize the result array to store frequencies of learners in B
        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            // Retrieve frequency of each learner in B or 0 if not found
            result[i] = frequencyMap.getOrDefault(B[i], 0);
        }
        
        return result;
    }
}
