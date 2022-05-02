package recursion;

/*
 * LeetCode Difficulty: Hard
 * My Judgement: Medium
 */
public class L52 {
    private int count = 0;
    public int totalNQueens(int n) {
        int[][] board =  new int[n][n];
        updateBoard(board, 0);
        return count;
    }

    private void updateBoard(int[][] board, int row) {
        int length = board.length;
        if (row == length) {
            count++;
            return;
        }
        for (int col = 0; col < length; col++) {
            if (checkQueenPlace(row, col, board)) {
                board[row][col] = 1;
                updateBoard(board, row + 1);
                board[row][col] = 0;
            }
        }
    }

    private boolean checkQueenPlace(int r, int c, int[][] board) {
        int index, length = board.length;
        for(index = 0; index < length; index++) {
            if (board[index][c] == 1 || board[r][index] == 1) {
                return false;
            }
            if (r - index >= 0 && c - index >= 0 && board[r - index][c - index] == 1) {
                return false;
            }
            if (r + index < length && c + index < length && board[r + index][c + index] == 1) {
                return false;
            }
            if (r + index < length && c - index >=0 && board[r + index][c - index] == 1) {
                return false;
            }
            if (r - index >= 0 && c + index < length && board[r - index][c + index] == 1) {
                return false;
            }
        }
        return true;
    }
}
