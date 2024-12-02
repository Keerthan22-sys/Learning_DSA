public class Solution {

    // Helper function to print numbers from 1 to A recursively
    private void printNumbers(int A) {
        if (A == 1) {
            System.out.print("1 ");
            return;
        }
        printNumbers(A - 1);  // Recursive call to print numbers from 1 to A-1
        System.out.print(A + " ");  // Print the current number after recursion
    }

    public void solve(int A) {
        printNumbers(A);  // Call the helper function to print numbers from 1 to A
        System.out.println(); // Print a newline after the sequence
    }
}
