package matrix;

/*
 * Company: Apple, Uber, Sbapchat
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L36 {
    public boolean isValidSudoku(char[][] board) {
        int i, j;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!isValid(board, i, j, board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char val) {
        int i, j, startRow, startCol;
        for (i = 0; i < 9; i++) {
            if (i != row && (board[i][col] == val)) {
                return false;
            }
            if (i != col && (board[row][i] == val)) {
                return false;
            }
        }
        startRow = (row / 3) * 3;
        startCol = (col / 3) * 3;
        for (i = startRow; i < (startRow + 3); i++) {
            for (j = startCol; j < (startCol + 3); j++) {
                if (i == row && j == col) {
                    continue;
                }
                if (board[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
