package dynamicProgramming;

import java.util.Arrays;
import java.util.List;

/*
 * Company : Amazon
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L119 {
    public List<Integer> getRow(int rowIndex) {
        int i, j, temp1, temp2;
        Integer[] ar = new Integer[rowIndex + 1];
        ar[0] = 1;
        for (i = 1; i <= rowIndex; i++) {
            temp1 = 1;
            for (j = 1; j <= i; j++) {
                if (j == i) {
                    ar[j] = 1;
                } else {
                    temp2 = ar[j];
                    ar[j] = temp1 + ar[j];
                    temp1 = temp2;
                }
            }
        }
        return Arrays.asList(ar);
    }
}
