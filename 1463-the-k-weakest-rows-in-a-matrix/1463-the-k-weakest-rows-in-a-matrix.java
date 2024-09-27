import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> rowStrength = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            rowStrength.add(new int[] {i, sum});
        }

        rowStrength.sort((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowStrength.get(i)[0];
        }

        return result;
    }
}
