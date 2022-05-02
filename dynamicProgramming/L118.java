package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/*
 * Company : Twitter, Apple
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  list = new ArrayList<List<Integer>>();
        int i, j;
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(1);
        list.add(firstList);
        for (i = 1; i < numRows; i++) {
            List<Integer> prevList = list.get(i - 1);
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for (j = 0; j <= i; j++) {
                if (j == 0) {
                    newList.add(prevList.get(0));
                } else if (j == i) {
                    newList.add(1);
                } else {
                    newList.add(prevList.get(j - 1) + prevList.get(j));
                }
            }
            list.add(newList);
        }
        return list;
    }
}
