public class Solution {
    public void PrintArray(int[] A) {
        printElements(A, 0);  // Start recursive printing from index 0
        System.out.println();  // Print a newline after all elements
    }

    private void printElements(int[] A, int index) {
        // Base case: if index is out of bounds, stop recursion
        if (index >= A.length) {
            return;
        }
        
        // Print current element followed by a space
        System.out.print(A[index] + " ");
        
        // Recursive call for the next index
        printElements(A, index + 1);
    }
}
