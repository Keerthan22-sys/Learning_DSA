public class Solution {
    public int[][] solve(int[][] A, int B) {
        // Priority queue to maintain the farthest B points
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((p1, p2) -> {
            long dist1 = (long) p1[0] * p1[0] + (long) p1[1] * p1[1];
            long dist2 = (long) p2[0] * p2[0] + (long) p2[1] * p2[1];
            return Long.compare(dist2, dist1); // Max-heap based on distance
        });

        // Iterate through all points
        for (int[] point : A) {
            maxHeap.offer(point);

            // If the size exceeds B, remove the farthest point
            if (maxHeap.size() > B) {
                maxHeap.poll();
            }
        }

        // Prepare the result
        int[][] result = new int[B][2];
        for (int i = 0; i < B; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] A1 = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int B1 = 2;

        int[][] A2 = {{3, 3}, {5, -1}, {-2, 4}};
        int B2 = 1;

        System.out.println(Arrays.deepToString(solution.kClosest(A1, B1))); // Output: [[-2, 2], [0, 1]]
        System.out.println(Arrays.deepToString(solution.kClosest(A2, B2))); // Output: [[3, 3]]
    }
}
