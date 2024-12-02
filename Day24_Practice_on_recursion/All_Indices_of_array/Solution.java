import java.util.ArrayList;

public class Solution {
    public int[] allIndices(int[] A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        findAllIndices(A, B, 0, result);
        
        // Convert ArrayList to int array
        int[] indices = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            indices[i] = result.get(i);
        }
        
        return indices;
    }

    private void findAllIndices(int[] A, int B, int index, ArrayList<Integer> result) {
        // Base case: End of array
        if (index == A.length) {
            return;
        }
        
        // If current element matches the target, add index to result
        if (A[index] == B) {
            result.add(index);
        }
        
        // Recursive call to check the next index
        findAllIndices(A, B, index + 1, result);
    }
}
