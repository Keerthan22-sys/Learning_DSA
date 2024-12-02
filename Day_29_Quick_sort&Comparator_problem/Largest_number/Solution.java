import java.util.*;

public class Solution {
    public String largestNumber(int[] A) {
        // Convert int[] to Integer[] for sorting with a custom comparator
        Integer[] nums = Arrays.stream(A).boxed().toArray(Integer[]::new);

        // Sort using a custom comparator
        Arrays.sort(nums, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                String XY = String.valueOf(a) + String.valueOf(b);
                String YX = String.valueOf(b) + String.valueOf(a);
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        // Build the result string
        StringBuilder ans = new StringBuilder();
        for (int x : nums) {
            ans.append(x);
        }

        // Handle edge case where all elements are 0
        if (ans.charAt(0) == '0') {
            return "0";
        }

        return ans.toString();
    }
}
