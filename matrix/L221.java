package matrix;

/*
 * Company : Apple, Facebook, Airbnb
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Best Solution
 */
public class L221 {
    public int maximalSquare(char[][] matrix) {
        int r, c, max = 0;
        for (r = 1; r < matrix.length; r++) {
            for (c = 1; c < matrix[r].length; c++) {
                if (matrix[r][c] == '1') {
                    matrix[r][c] = (char) (Math.min(Math.min(matrix[r][c - 1], matrix[r - 1][c]), matrix[r - 1][c - 1]) + 1);
                    max = Math.max(max, matrix[r][c] - '0');
                }
            }
        }
        if (max == 0) {
            for (c = 0; c < matrix[0].length; c++) {
                if (matrix[0][c] == '1') {
                    return 1;
                }
            }
            for (r = 0; r < matrix.length; r++) {
                if (matrix[r][0] == '1') {
                    return 1;
                }
            }
        }
        return max * max;
    }
}
