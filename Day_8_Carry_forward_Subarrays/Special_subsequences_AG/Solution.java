public class Solution {
    public long solve(String A) {
        int countA = 0;
        long countPairs = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                countA++;
            } else if (A.charAt(i) == 'G') {
                countPairs += countA;
            }
        }

        return countPairs;
    }
}

