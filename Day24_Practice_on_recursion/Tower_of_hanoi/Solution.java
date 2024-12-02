import java.util.ArrayList;
import java.util.List;

public class Solution {

    private void solveHanoi(int disk, int start, int end, int aux, List<int[]> moves) {
        if (disk == 0) return; // Base case: no disk to move
        solveHanoi(disk - 1, start, aux, end, moves); // Move n-1 disks from start to aux
        moves.add(new int[]{disk, start, end});       // Move nth disk from start to end
        solveHanoi(disk - 1, aux, end, start, moves); // Move n-1 disks from aux to end
    }

    public int[][] towerOfHanoi(int A) {
        List<int[]> moves = new ArrayList<>();
        solveHanoi(A, 1, 3, 2, moves);
        int[][] result = new int[moves.size()][3];
        for (int i = 0; i < moves.size(); i++) {
            result[i] = moves.get(i);
        }
        return result;
    }
}
