package dynamicProgramming;

/*
 * Company : Amazon, Facebook
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        obstacleGrid[0][0] = 1;
        int i,j, m = obstacleGrid.length, n = obstacleGrid[0].length;
        int v = 1;
        for (i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                v = 0;
            }
            obstacleGrid[i][0] = v;
        }
        v = 1;
        for (i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                v = 0;
            }
            obstacleGrid[0][i] = v;
        }
        for (i = 1; i < m; i++) {
            for (j = 1; j < n; j++) {
                if (obstacleGrid[i][j] != 1) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }

            }
        }

        return obstacleGrid[m - 1][n - 1];
    }

}
