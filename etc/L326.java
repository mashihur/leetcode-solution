package etc;

/*
 * Company : Google
 * LeetCode Difficulty: Easy
 * My Judgement: Easy - similar L231
 */
public class L326 {
    public boolean isPowerOfThree(int n) {
        while(n > 1 && n % 3 == 0) {
            n /= 3;
        }

        return (n == 1);
    }
}
