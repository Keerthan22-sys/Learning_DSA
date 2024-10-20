public class Solution {
    public int repeatedNumber(int[] A) {
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        
        // First pass: Find potential candidates
        for (int num : A) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : A) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        if (count1 > A.length / 3) return candidate1;
        if (count2 > A.length / 3) return candidate2;

        return -1;
    }
}