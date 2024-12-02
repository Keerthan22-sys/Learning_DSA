public class Solution {
    public int[] solve(int[] A) {
        // Find the maximum value in the array
        int max = 0;
        for (int num : A) {
            if (num > max) {
                max = num;
            }
        }

        // Create a count array to store the frequency of each number
        int[] count = new int[max + 1];

        // Count the occurrences of each number in A
        for (int num : A) {
            count[num]++;
        }

        // Construct the sorted array
        int index = 0;
        int[] sortedArray = new int[A.length];
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                sortedArray[index++] = i;
                count[i]--;
            }
        }

        return sortedArray;
    }
}
