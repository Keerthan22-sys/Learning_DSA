public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int count = 1;
        int top = 0, bottom = A - 1, left = 0, right = A - 1;

        while (count <= A * A) {
            // Fill the top row
            for (int j = left; j <= right; j++) {
                ans[top][j] = count++;
            }
            top++;

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = count++;
            }
            right--;

            // Fill the bottom row if there's still a row left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = count++;
                }
                bottom--;
            }

            // Fill the left column if there's still a column left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = count++;
                }
                left++;
            }
        }

        return ans;
    }
}