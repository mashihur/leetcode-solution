package recursion;

/*
 * Company : Google, Facebook, Amazon, Microsoft, Bloomberg
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L79 {
    public boolean exist(char[][] board, String word) {
        char[] wordArray = word.toCharArray();
        int i, j;
        for (i = 0; i < board.length; i++) {
            for (j = 0; j <board[i].length; j++) {
                if (board[i][j] == wordArray[0]) {
                    if (search(board, wordArray, 0, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, char[] wordArray, int index, int r, int c) {
        if (index == wordArray.length) {
            return true;
        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[r].length || board[r][c] != wordArray[index]) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '0';
        boolean returnValue = search(board, wordArray, index + 1, r, c - 1) |
                search(board, wordArray, index + 1, r - 1, c) |
                search(board, wordArray, index + 1, r + 1, c) |
                search(board, wordArray, index + 1, r, c + 1);
        board[r][c] = temp;
        return returnValue;
    }

}
