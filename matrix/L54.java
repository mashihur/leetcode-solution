package matrix;

import java.util.ArrayList;
import java.util.List;

/*
 * Company : Google, Microsoft, Uber
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int direction = 0, count = matrix.length * matrix[0].length, i = 0, j = 0;
        while(count > 0) {
            list.add(matrix[i][j]);
            matrix[i][j] = -200;
            if (direction == 0) {
                if (j < matrix[0].length - 1 && matrix[i][j + 1] != -200) {
                    j++;
                } else {
                    i++;
                    direction = 1;
                }
            } else if (direction == 1) {
                if (i < matrix.length - 1 && matrix[i + 1][j] != -200) {
                    i++;
                } else {
                    j--;
                    direction = 2;
                }
            } else if (direction == 2) {
                if (j > 0 && matrix[i][j - 1] != -200) {
                    j--;
                } else {
                    i--;
                    direction = 3;
                }
            } else if (direction == 3) {
                if (matrix[i - 1][j] != -200) {
                    i--;
                } else {
                    j++;
                    direction = 0;
                }
            }
            count--;
        }

        return list;
    }
}
