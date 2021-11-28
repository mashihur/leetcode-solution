package string;

import org.junit.Assert;
import org.junit.Test;

/*
 * Company : Facebook
 * LeetCode Difficulty: Medium
 * My Judgement: Easy
 */
public class L38 {
    public String countAndSay(int n) {
        StringBuilder builder = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            char[] ar = builder.toString().toCharArray();
            builder.delete(0, builder.length());
            int count = 1;
            for (int j = 1; j < ar.length; j++) {
                if (ar[j - 1] == ar[j]) {
                    count++;
                } else {
                    builder.append(count + "" + ar[j - 1]);
                    count = 1;
                }
            }
            builder.append(count + "" + ar[ar.length - 1]);
        }
        return builder.toString();
    }

    @Test
    public void test1() {
        Assert.assertEquals("1", countAndSay(1));
    }

    @Test
    public void test2() {
        Assert.assertEquals("11", countAndSay(2));
    }

    @Test
    public void test3() {
        Assert.assertEquals("21", countAndSay(3));
    }

    @Test
    public void test4() {
        Assert.assertEquals("1211", countAndSay(4));
    }

}
