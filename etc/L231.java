package etc;

/*
 * Company : Google
 * LeetCode Difficulty: Easy
 * My Judgement: Easy - similar L326
 */
public class L231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while(n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
