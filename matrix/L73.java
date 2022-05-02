package matrix;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L73 {
    public void setZeroes(int[][] matrix) {
        int i, j;
        boolean isFirstRowZero = false, isFirstColZero = false;

        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }
        for (j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstColZero) {
            for (i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (isFirstRowZero) {
            for (j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
