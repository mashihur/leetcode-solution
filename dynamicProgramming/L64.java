package dynamicProgramming;

/*
 * Company : Amazon
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L64 {
    public int minPathSum(int[][] grid) {
        int r, c, m = grid.length, n = grid[0].length;

        for (r = 1; r < m; r++) {
            grid[r][0] += grid[r - 1][0];
        }
        for (c = 1; c < n; c++) {
            grid[0][c] += grid[0][c - 1];
        }
        for (r = 1; r < m; r++) {
            for (c = 1; c < n; c++) {
                grid[r][c] += Math.min(grid[r - 1][c], grid[r][c - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
