package matrix;

/*
 * Company : Amazon, Microsoft
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L48 {
    public void rotate(int[][] matrix) {
        transposeMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            reverseHorizontal(matrix[i]);
        }
    }

    private void transposeMatrix(int[][] matrix) {
        int i, j, length = matrix.length;
        for (i = 0; i < length; i++) {
            for (j = i + 1; j < length; j++) {
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
            }
        }
    }

    private void reverseHorizontal(int[] a) { // Vertical reverse is anti- clockwise rotation
        int i= 0, j = a.length - 1;
        while(j > i) {
            a[i] ^= a[j];
            a[j] ^= a[i];
            a[i] ^= a[j];
            i++;
            j--;
        }
    }
}
