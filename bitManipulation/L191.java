package bitManipulation;

/*
 * Company : Apple, Microsoft
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L191 {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
