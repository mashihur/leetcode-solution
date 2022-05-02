package dynamicProgramming;

/*
 * Company : Google, Amazon, Apple, Airbnb, Bloomberg, Twitter
 * LeetCode Difficulty: Hard
 * My Judgement: Medium
 */
public class L42 {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int trapWater = 0, i;
        int[] ltr = new int[height.length];
        int[] rtl = new int[height.length];

        ltr[0] = height[0];
        for (i = 1; i < height.length; i++) {
            ltr[i] = Math.max(ltr[i - 1], height[i]);
        }

        rtl[height.length - 1] = height[height.length - 1];
        for (i = height.length - 2; i >=0; i--) {
            rtl[i] = Math.max(rtl[i + 1], height[i]);
        }

        for (i = 0; i < height.length; i++) {
            trapWater += Math.min(ltr[i], rtl[i]) - height[i];
        }
        return trapWater;
    }
}
