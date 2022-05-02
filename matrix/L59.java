package matrix;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Easy - Similar problem L54
 */
public class L59 {
    public int[][] generateMatrix(int n) {
        int[][] output = new int[n][n];
        int count = n * n, i = 1, direction = 0, r = 0, c = 0;

        while(i <= count) {
            output[r][c] = i;
            i++;
            if (direction % 4 == 0) {
                if (c < (n - 1) && output[r][c + 1] == 0) {
                    c++;
                } else {
                    r++;
                    direction++;
                }
            } else if (direction % 4 == 1) {
                if (r < (n - 1) && output[r + 1][c] == 0) {
                    r++;
                } else {
                    c--;
                    direction++;
                }
            } else if (direction % 4 == 2) {
                if (c > 0 && output[r][c - 1] == 0) {
                    c--;
                } else {
                    r--;
                    direction++;
                }
            } else if (direction % 4 == 3) {
                if (output[r - 1][c] == 0) {
                    r--;
                } else {
                    c++;
                    direction++;
                }
            }
        }

        return output;
    }

}

