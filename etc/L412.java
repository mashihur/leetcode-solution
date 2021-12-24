package etc;

import java.util.ArrayList;
import java.util.List;

/*
 * Company : Agoda
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }

        return list;
    }

}
