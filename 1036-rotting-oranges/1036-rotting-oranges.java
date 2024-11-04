class Solution {
    static class Cell {
        int row, col, time;
        Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int N = grid.length;
        int M = grid[0].length;
        Queue<Cell> queue = new LinkedList<>();
        int healthyCells = 0;

        // Initialize the queue with all virus cells and count healthy cells
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Cell(i, j, 0));  // virus cell with initial time 0
                } else if (grid[i][j] == 1) {
                    healthyCells++;
                }
            }
        }

        // If there are no healthy cells, return 0
        if (healthyCells == 0) {
            return 0;
        }

        int maxTime = 0;
        int[] dRow = {-1, 1, 0, 0};  // row movement for up, down, left, right
        int[] dCol = {0, 0, -1, 1};  // column movement for up, down, left, right

        // Process the queue
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            int row = cell.row, col = cell.col, time = cell.time;

            // Check each neighbor
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                // Check if within bounds and if the cell is healthy
                if (newRow >= 0 && newRow < N && newCol >= 0 && newCol < M && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2;  // mark as infected
                    healthyCells--;  // decrease count of healthy cells
                    queue.offer(new Cell(newRow, newCol, time + 1));  // enqueue new infected cell
                    maxTime = time + 1;  // update max time
                }
            }
        }

        // If there are still healthy cells left, return -1
        return healthyCells == 0 ? maxTime : -1;
    }
}