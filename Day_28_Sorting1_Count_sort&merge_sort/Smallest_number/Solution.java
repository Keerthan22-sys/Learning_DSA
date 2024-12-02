public class Solution {
    public int[] smallestNumber(int[] A) {
        // Array to count the frequency of each digit (0-9)
        int[] count = new int[10];
        
        // Count occurrences of each digit
        for (int digit : A) {
            count[digit]++;
        }
        
        // Construct the smallest number
        int[] result = new int[A.length];
        int index = 0;
        
        // Add digits to the result array in ascending order based on their counts
        for (int digit = 0; digit <= 9; digit++) {
            while (count[digit] > 0) {
                result[index++] = digit;
                count[digit]--;
            }
        }
        
        return result;
    }
}
