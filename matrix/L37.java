package matrix;

/*
 * Company : Uber, Snapchat
 * LeetCode Difficulty: Hard
 * My Judgement: Hard
 */
public class L37 {

    public void solveSudoku(char[][] board) {
        placeNum(board, 0, 0);
    }

    public boolean placeNum(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        int pRow, pCol;
        while(board[row][col] != '.') {
            if (col < board[0].length - 1) {
                col++;
            } else if (row < board.length - 1){
                row++;
                col = 0;
            } else {
                return true;
            }
        }
        if (col < board[0].length - 1) {
            pRow = row;
            pCol = col + 1;
        } else {
            pRow = row + 1;
            pCol = 0;
        }
        for (char c = '1'; c <= '9'; c++) {
            if (isValid(board, row, col, c)) {
                board[row][col] = c;
                if (placeNum(board, pRow, pCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public boolean isValid(char[][] board, int x, int y, int v) {
        int startRow = (x / 3) * 3;
        int startCol = (y / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == v) {
                    return false;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] == v) {
                return false;
            }
            if (board[x][i] == v) {
                return false;
            }
        }
        return true;
    }
}
