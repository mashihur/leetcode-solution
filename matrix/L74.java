package matrix;

/*
 * Company : Microsoft
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }

        return false;
    }
}
