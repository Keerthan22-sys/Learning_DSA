public class Solution {

    // Helper function to print numbers from A to 1 recursively
    private void printNumbersDescending(int A) {
        if (A < 1) {
            return; // Base case: stop when A < 1
        }
        System.out.print(A + " "); // Print the current number
        printNumbersDescending(A - 1); // Recursive call to print the next number
    }

    public void solve(int A) {
        printNumbersDescending(A); // Call the helper function to print from A to 1
        System.out.println(); // Print a newline after the sequence
    }
}
