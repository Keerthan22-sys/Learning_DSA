public class Solution {
    public static void find(int N)
    {
        if (N < 1) {
            return; // Base case: stop when N is less than 1
        }
        System.out.print(N + " "); // Print in decreasing order
        find(N - 1); // Recursive call with N-1 to continue decreasing order
        System.out.print(N + " "); // P
    }
    public void DecThenInc(int A) {
        find(A);
        System.out.println();
    }
}
