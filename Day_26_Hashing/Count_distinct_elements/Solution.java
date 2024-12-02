import java.util.*;

public class Solution {
    public int solve(int[] A) {
        // Step 1: Create a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        
        // Step 2: Add each element from the array to the HashSet
        for (int num : A) {
            uniqueElements.add(num);
        }
        
        // Step 3: Return the size of the HashSet (number of unique elements)
        return uniqueElements.size();
    }
}