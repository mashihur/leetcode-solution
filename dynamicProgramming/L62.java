package dynamicProgramming;

/*
 * Company : Amazon, Google, Facebook
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L62 {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        int i,j;
        for (i = 0; i < m; i++) {
            paths[i][0] = 1;
        }
        for (i = 0; i < n; i++) {
            paths[0][i] = 1;
        }
        for (i = 1; i < m; i++) {
            for (j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }
        return paths[m - 1][n - 1];
    }
}
